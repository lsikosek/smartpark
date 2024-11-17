package org.ekipaenajst;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("/Accounts")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AccountsResource {

    @GET
    public Response getAccounts() {

        return null;
        // TODO
    }

    @GET
    @Path("/{id}")
    public Response getAccount(@PathParam("id") String id) {

        return null;
        // TODO
    }

}
