package com.valandro.impl.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ModelTest {

    private Model model;

    @Before
    public void create_reference() {
        model = new Model();
    }

    @Test
    public void constructor() {
        Model constructor = new Model();
        assertNotNull(constructor);
    }
}