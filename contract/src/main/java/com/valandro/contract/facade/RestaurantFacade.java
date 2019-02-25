package com.valandro.contract.facade;

import com.valandro.contract.binder.ContractBinder;
import com.valandro.contract.response.Response;
import com.valandro.impl.data.RestaurantEntity;
import com.valandro.impl.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.List;

@Component
public class RestaurantFacade {
    @Autowired
    private RestaurantService restaurantService;

    public Mono<List<Response>> getRestaurantByFoodType(String foodType) {
        return Mono.just(foodType)
                   .map(restaurantService::findRestaurants)
                   .map(ContractBinder::bindToResponseList);
    }
}
