package com.valandro.impl.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.valandro.impl.repository.SomeRepository;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;

public class AuthServiceTest {
    @Spy
    @InjectMocks
    private AuthService authService;
    @Mock
    private SomeRepository someRepository;
    @Mock
    private ObjectMapper objectMapper;
}