package com.github.soulaway.shared.rest.api;

import com.github.soulaway.shared.rest.model.SimilarDay;
import com.github.soulaway.shared.rest.model.Error;
import org.joda.time.LocalDate;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface SimilarDayApi  {
    @GET
    @Path("/similar_day")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    public Response similarDayGet(@QueryParam("date") LocalDate date,@QueryParam("substation") String substation);
    @PUT
    @Path("/similar_day")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    public Response similarDayPut(@QueryParam("date") LocalDate date,@QueryParam("substation") String substation,SimilarDay newSimilarDay);
}

