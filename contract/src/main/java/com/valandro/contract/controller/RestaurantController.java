package com.valandro.contract.controller;

import com.valandro.contract.facade.RestaurantFacade;
import com.valandro.contract.response.RestaurantResponse;
import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantFacade restaurantFacade;

    @Timed(
        value = "restaurants.get",
        histogram = true,
        percentiles = {0.95, 0.99},
        extraTags = {"version", "1.0"}
    )
    @GetMapping(path = "",
                produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<List<RestaurantResponse>> getRestaurantByFoodType(@RequestParam("tipo_de_comida") String foodType){
        return this.restaurantFacade.getRestaurantByFoodType(foodType);
    }
}
