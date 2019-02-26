package com.valandro.contract.binder;

import com.valandro.contract.response.RestaurantResponse;
import com.valandro.impl.data.RestaurantEntity;

import java.util.List;
import java.util.stream.Collectors;

public class RestaurantBinder {

    public static List<RestaurantResponse> bindToResponseList(List<RestaurantEntity> restaurantEntity) {
        return restaurantEntity.stream()
                               .map(RestaurantBinder::bindToResponse)
                               .collect(Collectors.toList());
    }

    private static RestaurantResponse bindToResponse(RestaurantEntity restaurantEntity) {
        return RestaurantResponse.builder()
                .address(restaurantEntity.getAddress())
                .city(restaurantEntity.getCity())
                .outCode(restaurantEntity.getOutCode())
                .postCode(restaurantEntity.getPostCode())
                .rating(restaurantEntity.getRating())
                .restaurantName(restaurantEntity.getRestaurantName())
                .typeFood(restaurantEntity.getTypeFood())
                .build();
    }
}
