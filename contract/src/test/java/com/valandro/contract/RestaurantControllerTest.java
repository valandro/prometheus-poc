package com.valandro.contract;

import com.valandro.WebFluxApplicationTests;
import org.junit.Before;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.reactive.server.WebTestClient;

public class RestaurantControllerTest extends WebFluxApplicationTests {

    private WebTestClient webTestClient;

    @Before
    public void setUp() {
        this.webTestClient = WebTestClient.bindToApplicationContext(applicationContext).build();
    }
}