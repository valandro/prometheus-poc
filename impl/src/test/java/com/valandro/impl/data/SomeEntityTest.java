package com.valandro.impl.data;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.any;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SomeEntityTest {
    private SomeEntity entity;

    @Before
    public void create_reference() {
        entity = new SomeEntity();
    }

    @Test
    public void constructor() {
        entity = new SomeEntity();
        assertNotNull(entity);
    }
}