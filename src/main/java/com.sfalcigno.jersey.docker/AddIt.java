package com.sfalcigno.jersey.docker.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;

/**
 * Root resource (exposed at addit path)
 */
@Path("addit")
public class AddIt {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String addIt(@QueryParam("a") int a, @QueryParam("b") int b) {

        String fs;
        fs = String.format( "<html><head></head><body><p>" +
                            " %d  + %d = %d" +
                            "</p></body></html>", 
                             a, b, a + b);
        return fs; 
    }

}
