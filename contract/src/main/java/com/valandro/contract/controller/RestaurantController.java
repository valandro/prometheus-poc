package com.valandro.contract.controller;

import com.valandro.contract.facade.RestaurantFacade;
import com.valandro.contract.response.RestaurantResponse;
import io.prometheus.client.Counter;
import io.prometheus.client.Histogram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantFacade restaurantFacade;

    static final Counter requests = Counter.build().name("requests_total")
                                                   .help("Total number of requests.").register();
    static final Histogram requestLatency = Histogram.build().name("requests_latency_seconds")
                                                             .help("Request latency in seconds.").register();

    @GetMapping(path = "/restaurants",
                produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<List<RestaurantResponse>> getRestaurantByFoodType(@RequestParam("foodType") String foodType){
        // Increase the counter metric
        requests.inc();
        // Start the histogram timer
        Histogram.Timer requestTimer = requestLatency.startTimer();
        try {
            return this.restaurantFacade.getRestaurantByFoodType(foodType);
        } finally {
            // Stop the histogram timer
            requestTimer.observeDuration();
        }
    }
}
