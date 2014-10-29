#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

/**
 * Example resource class hosted at the URI path "/myresource"
 */
@Path("/service")
@Api(value = "/service", description = "Service descirption goes here")
public class MyResource {

	@GET
	@Path("/verb1")
	@ApiOperation(value = "verb1 operation", notes = "verb1 operation notes.")
	@Produces("text/plain")
	public String getIt(
			@ApiParam(value = "parameter1", required = true) @QueryParam("query parameterer") String repo) {


		return "verb 1";
	}

	@GET
	@Path("/verb2")
	@ApiOperation(value = "Verb2 Operation")
	@Produces("text/plain")
	public String list() {

		return "verb2";

	}

}
