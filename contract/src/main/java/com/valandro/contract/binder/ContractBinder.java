package com.valandro.contract.binder;

import com.valandro.contract.response.Response;
import com.valandro.impl.data.RestaurantEntity;

import java.util.List;
import java.util.stream.Collectors;

public class ContractBinder {

    public static List<Response> bindToResponseList(List<RestaurantEntity> restaurantEntity) {
        return restaurantEntity.stream()
                               .map(ContractBinder::bindToResponse)
                               .collect(Collectors.toList());
    }

    private static Response bindToResponse(RestaurantEntity restaurantEntity) {
        return Response.builder()
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
