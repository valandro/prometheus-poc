package com.valandro.contract.facade;

import com.valandro.impl.service.AuthService;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

public class FacadeTest {
    @InjectMocks
    private Facade facade;

    @Mock
    private AuthService authService;
}