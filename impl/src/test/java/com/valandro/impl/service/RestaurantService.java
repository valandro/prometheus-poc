package com.valandro.impl.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.valandro.impl.repository.RestaurantsRepository;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;

public class RestaurantService {
    @Spy
    @InjectMocks
    private RestaurantService restaurantService;
    @Mock
    private RestaurantsRepository restaurantsRepository;
    @Mock
    private ObjectMapper objectMapper;
}