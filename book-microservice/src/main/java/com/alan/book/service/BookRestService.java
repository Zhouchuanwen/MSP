package com.alan.book.service;


import com.alan.book.model.BookReq;
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
    Wrapper up(BookReq bookReq);


    @DELETE
    @Path("/delete/{isbn}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Wrapper down(@PathParam("isbn") String isbn);


    @PUT
    @Path("/update")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Wrapper update(BookReq bookReq);


    @GET
    @Path("/queryisbn")
    @Produces(MediaType.APPLICATION_JSON)
    Wrapper selectByISBN(@QueryParam("isbn") String ISBN);


    @GET
    @Path("/query")
    @Produces(MediaType.APPLICATION_JSON)
    Wrapper selectBookByKey(@QueryParam("key") String key);

}
