package com.jet.init;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class InitSession implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		ServletContext application = session.getServletContext();
		List<HttpSession> sessions = (List<HttpSession>) application.getAttribute("sessions");
		sessions.add(session);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		
	}

}
