package org.job.joboo.security;

/**
 * Created by firas on 16/09/2016.
 */

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Http401DeniedEntryPoint implements AuthenticationEntryPoint {


    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        HttpServletResponse httpResponse = response;
        httpResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Access Denied");
    }

}