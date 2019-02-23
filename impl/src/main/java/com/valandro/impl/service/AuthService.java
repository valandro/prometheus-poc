package com.valandro.impl.service;

import com.valandro.impl.repository.SomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private SomeRepository someRepository;
}
