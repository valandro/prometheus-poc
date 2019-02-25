package com.valandro.impl.service;

import com.valandro.impl.data.RestaurantEntity;
import com.valandro.impl.repository.RestaurantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantsRepository restaurantsRepository;

    public List<RestaurantEntity> findRestaurants(String foodType) {
        return restaurantsRepository.findByTypeFood(foodType);
    }
}
