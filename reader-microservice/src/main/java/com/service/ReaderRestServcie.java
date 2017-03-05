package com.service;

import com.model.UserReq;
import com.util.Wrapper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by alan on 16/12/26.
 */

@Path("/user")
public interface ReaderRestServcie {

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

    @POST
    @Path("/login")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Wrapper userLogin(UserReq userReq);


    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Wrapper userInfo(@PathParam("id") String id);








}

