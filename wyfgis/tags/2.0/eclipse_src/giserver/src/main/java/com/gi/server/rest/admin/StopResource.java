package com.gi.server.rest.admin;

import javax.servlet.ServletContext;
import javax.ws.rs.CookieParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;

import com.gi.server.core.auth.Administrator;
import com.gi.server.rest.html.AdministratorHTML;

/**
 * @author wuyf
 * 
 */
@Path("/stop")
public class StopResource {

	@Context
	ServletContext context;

	@GET
	@Produces("text/html")
	public String getResult(@QueryParam("f") @DefaultValue("html") String f,
			@QueryParam("service") String service,
			@CookieParam("username") String username,
			@CookieParam("password") String password) {
		return result(f, service, username, password);
	}

	@POST
	@Produces("text/html")
	public String postResult(@FormParam("f") @DefaultValue("html") String f,
			@FormParam("service") String service,
			@CookieParam("username") String username,
			@CookieParam("password") String password) {
		return result(f, service, username, password);
	}

	private String result(String f, String service, String username,
			String password) {
		String result = null;

		try {
			Administrator admin = new Administrator(username, password);
			boolean isSucceed = false;

			String serviceName = service.substring(4);
			try {
				if (service.startsWith("map>")) {
					isSucceed = admin.stopMapService(serviceName);
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			if ("html".equals(f)) {
				result = this.generateHTMLResult(admin, serviceName, isSucceed);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return result;
	}

	private String generateHTMLResult(Administrator admin, String serviceName,
			boolean isSucceed) {
		String result = "";

		String contextRoot = context.getContextPath();
		String rootURI = contextRoot + "/rest/admin/";
		String thisURI = rootURI + "stop";

		String restBody = "";
		if (!admin.isAuthorized()) {
			restBody = AdministratorHTML.getLoginForm();
			restBody = restBody.replace("${POST_URI}", thisURI);
		} else {
			if (isSucceed) {
				restBody += "<b>Succeed stop service '" + serviceName
						+ "' !</b>";
			} else {
				restBody += "<b>Stop service '" + serviceName
						+ "' failed !</b>";
			}
		}

		AdministratorHTML html = new AdministratorHTML();
		html.setContextRoot(contextRoot);
		html.setTitle("Stop");
		html.setHome(rootURI);
		html.setCatalog(" &gt; Stop");
		html.setHeader("Stop");
		html.setRestBody(restBody);
		result = html.toString();

		return result;
	}

}
