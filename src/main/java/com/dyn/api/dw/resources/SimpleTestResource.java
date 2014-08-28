package com.dyn.api.dw.resources;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
public class SimpleTestResource {

    public SimpleTestResource() {
    }


    @GET
    public String doIt() {
        return "Here";
    }
}
