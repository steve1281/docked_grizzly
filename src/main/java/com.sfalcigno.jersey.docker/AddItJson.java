package com.sfalcigno.jersey.docker.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;

/**
 * Root resource (exposed at addit path)
 */
@Path("additj")
public class AddItJson {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String addIt_json(@QueryParam("a") int a, @QueryParam("b") int b) {

        String fs;
        fs = String.format( "{ \"a\":\"%d\", \"b\":\"%d\", \"tot\":\"%d\"} ", a, b, a + b);
        return fs; 
    }

}
