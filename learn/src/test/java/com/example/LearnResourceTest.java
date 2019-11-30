package com.example;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsStringIgnoringCase;

@QuarkusTest
public class LearnResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/learn")
          .then()
             .statusCode(200)
             .body(containsStringIgnoringCase("hello"));
    }
}
