package com.oauth;

import org.apache.commons.io.IOUtils;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.utils.OAuthUtils;
import org.codehaus.jettison.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by alan on 17/2/15.
 */
public class OAuthWrapper extends HttpServletRequestWrapper {


    private Map<String,String> parameters=new HashMap<>();

    public OAuthWrapper(HttpServletRequest request) {
        super(request);

        if(!OAuthUtils.isEmpty(request.getContentType())&& request.getContentType().contains(OAuth.ContentType.JSON)){
            try(InputStream input=request.getInputStream()){
                JSONObject jsonObject=new JSONObject(IOUtils.toString(input));
                Iterator it=jsonObject.keys();
                while (it.hasNext()){
                    String parameterName=(String)it.next();
                    String parameterValue=jsonObject.getString(parameterName);
                    parameters.put(parameterName,parameterValue);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Enumeration<String> enumeration = super.getParameterNames();
        while (enumeration.hasMoreElements()) {
            String parameterName = enumeration.nextElement();
            String parameterValue = super.getParameter(parameterName);

            parameters.put(parameterName, parameterValue);
        }
    }


    @Override
    public String getParameter(String name){
        if(OAuth.OAUTH_CLIENT_ID.equals(name) && parameters.containsKey("app_id")){
            name="app_id";
        }
        if(OAuth.OAUTH_CLIENT_ID.equals(name) && parameters.containsKey("app_key")){
            name="app_key";
        }
        if(OAuth.OAUTH_CLIENT_ID.equals(name) && parameters.containsKey("app_secret")){
            name="app_secret";
        }
        return parameters.get(name);
    }

}
