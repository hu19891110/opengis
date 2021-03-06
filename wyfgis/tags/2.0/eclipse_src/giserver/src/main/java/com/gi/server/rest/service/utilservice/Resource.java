package com.gi.server.rest.service.utilservice;

import javax.servlet.ServletContext;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;

import org.json.JSONException;
import org.json.JSONObject;

import com.gi.engine.util.VersionUtil;
import com.gi.server.rest.html.ServiceHTML;


/**
 * @author wuyf
 *
 */
@Path("/UtilService")
public class Resource {

	@Context
	ServletContext context;

	@GET
	public String getResult(@QueryParam("f") @DefaultValue("html") String f) {
		return result(f);
	}

	private String result(String f) {
		String result = null;

		try {
			// Various out format
			if ("json".equals(f)) {
				result = this.generateJSONResult();
			} else if ("html".equals(f)) {
				result = this.generateHTMLResult();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return result;
	}

	private String generateJSONResult() {
		String result = null;

		try {
			JSONObject obj = new JSONObject();
			
			obj.put("GIServerVersion", VersionUtil.getCurrentversion());

			result = obj.toString();
		} catch (JSONException ex) {
			ex.printStackTrace();
		}

		return result;
	}

	private String generateHTMLResult() {
		String contextRoot = context.getContextPath();

		StringBuilder sb = new StringBuilder();
		
		sb.append("<b>Utilities:</b>");
		sb.append("&nbsp;&nbsp;<a href='" + contextRoot + "/rest/service/UtilService/wkids'>Supported WKIDs</a>");
		sb.append("<br/><br/>");
		String restBody = sb.toString();
		
		ServiceHTML html = new ServiceHTML();
		html.setContextRoot(contextRoot);
		html.setTitle("Utility Service");
		html.setCatalog(" &gt; Utility Service");
		html.setHeader("Utility Service");
		html.setRestBody(restBody);

		return html.toString();
	}

}
