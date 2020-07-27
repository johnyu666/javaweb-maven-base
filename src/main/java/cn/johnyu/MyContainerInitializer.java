package cn.johnyu;

import cn.johnyu.servlets.MyDispatchServlet;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.http.HttpServlet;
import java.util.Set;

public class MyContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        HttpServlet servlet = new MyDispatchServlet();
        ServletRegistration.Dynamic dynamic = ctx.addServlet("dispatcher", servlet);
        dynamic.addMapping("/test");
        dynamic.setLoadOnStartup(1);
    }
}
