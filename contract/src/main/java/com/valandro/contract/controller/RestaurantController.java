package com.valandro.contract.controller;

import com.valandro.contract.facade.RestaurantFacade;
import com.valandro.contract.response.RestaurantResponse;
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

    @GetMapping(path = "/restaurants",
                produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<List<RestaurantResponse>> getRestaurantByFoodType(@RequestParam("foodType") String foodType){
        return this.restaurantFacade.getRestaurantByFoodType(foodType);
    }
}
