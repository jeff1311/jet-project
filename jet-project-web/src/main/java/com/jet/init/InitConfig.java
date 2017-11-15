package com.jet.init;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSession;

public class InitConfig implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		final ServletContext application = sce.getServletContext();
		String baseConfigPath = application.getInitParameter("BaseConfigPath");
		String baseConfigRealPath = application.getRealPath(baseConfigPath);
		Properties pro =  new Properties();
		FileInputStream configFile = null;
		try {
			configFile = new FileInputStream(baseConfigRealPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			pro.load(configFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Iterator<Entry<Object, Object>> proIterator = pro.entrySet().iterator();
		while(proIterator.hasNext()){//读取配置信息set到当前应用域里面
			Entry<Object, Object> next = proIterator.next();
			application.setAttribute(next.getKey().toString(), next.getValue());
		}
		
		final List<HttpSession> sessions = Collections.synchronizedList(new ArrayList<HttpSession>());
		application.setAttribute("sessions", sessions);
//		//开启一个定时任务 删除过期的session   5秒
//		Timer t = new Timer();
//		t.schedule(new TimerTask() {
//			@Override
//			public void run() {
//				System.out.println("Timer");
//				List<HttpSession> sessionList = (List<HttpSession>)application.getAttribute("sessions");
//				for (Iterator iterator = sessions.iterator(); iterator.hasNext();) {
//					HttpSession session = (HttpSession) iterator.next();
//					long time = System.currentTimeMillis() - session.getLastAccessedTime();
//					if(time > 5000){
//						System.out.println("--------------清空session:"+session.getId()+"--------------");
//						session.invalidate();
//						sessionList.remove(session);
//					}
//				}
//			}
//		}, 2000, 1000);//延迟2秒执行，间隔1秒执行一次
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}

}
