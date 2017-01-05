package com.reader.service;

import com.reader.core.Wrapper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by alan on 16/12/26.
 */

@Path("/hello")
public interface RestServcie {

    @GET
    @Path("/a")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Wrapper show();

    @GET
    @Path("/studnet/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Wrapper BooksURead(@PathParam("id") String id);


}

