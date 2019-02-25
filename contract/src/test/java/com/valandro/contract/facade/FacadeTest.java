package com.valandro.contract.facade;

import com.valandro.impl.service.RestaurantService;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class FacadeTest {
    @InjectMocks
    private RestaurantFacade restaurantFacade;

    @Mock
    private RestaurantService restaurantService;
}