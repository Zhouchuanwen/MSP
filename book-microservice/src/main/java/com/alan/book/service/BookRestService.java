package com.alan.book.service;


import com.alan.book.bean.Book;
import com.alan.common.util.Wrapper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by alan on 17/3/8.
 */
@Path("/book")
public interface BookRestService {

    @GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Wrapper test();

    @GET
    @Path("/testMongo")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Wrapper testMongo();

    @PUT
    @Path("/up")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Wrapper up(Book req);


    @DELETE
    @Path("/update")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Wrapper update();


}
