package com.valandro.contract;

import com.valandro.contract.facade.Facade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private Facade facade;
}
