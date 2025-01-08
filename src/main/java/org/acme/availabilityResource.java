package org.acme;

import java.net.URI;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;
import jakarta.ws.rs.core.Response.Status;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import io.vertx.mutiny.mysqlclient.MySQLPool;


import jakarta.ws.rs.Path;

@Path("/availability")
public class availabilityResource {
    //private final MySQLPool client;
    //public availabilityResource(MySQLPool client){
    //this.client = client;
}
