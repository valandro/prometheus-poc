package com.valandro.contract.facade;

import com.valandro.contract.binder.RestaurantBinder;
import com.valandro.contract.response.RestaurantResponse;
import com.valandro.impl.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.List;

@Component
public class RestaurantFacade {
    @Autowired
    private RestaurantService restaurantService;

    public Mono<List<RestaurantResponse>> getRestaurantByFoodType(String foodType) {
        return Mono.just(foodType)
                   .map(restaurantService::findRestaurants)
                   .map(RestaurantBinder::bindToResponseList);
    }
}
