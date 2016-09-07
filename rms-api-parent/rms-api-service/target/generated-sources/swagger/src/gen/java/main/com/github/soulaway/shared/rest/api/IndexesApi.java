package com.github.soulaway.shared.rest.api;

import com.github.soulaway.shared.rest.model.Error;
import org.joda.time.LocalDate;
import com.github.soulaway.shared.rest.model.Forecast;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

@Path("/")
public interface IndexesApi  {
    @GET
    @Path("/indexes")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    public Response indexesGet(@QueryParam("date") LocalDate date,@QueryParam("substation") String substation);
    @POST
    @Path("/residual_load_forecast")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    public Response residualLoadForecastPost(@QueryParam("date") LocalDate date,@QueryParam("substation") String substation);
    @POST
    @Path("/run_calculations_request")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    public Response runCalculationsRequestPost(@QueryParam("date") LocalDate date);
}

