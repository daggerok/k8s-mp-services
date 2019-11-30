package com.example;

import javax.enterprise.context.RequestScoped;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/learn")
@RequestScoped
public class ExampleResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject hello() {
        String message = String.format("Hello, {{friend}}! Would you like to lear {{something}} {{somewhere}} {{somehow}}?");
        return Json.createObjectBuilder()
                   .add("message", message)
                   .build();
    }
}
