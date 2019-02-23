package com.valandro.impl.binder;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ImplBinderTest {
    @Test
    public void constructor(){
        ImplBinder binder = new ImplBinder();
        assertNotNull(binder);
    }
}