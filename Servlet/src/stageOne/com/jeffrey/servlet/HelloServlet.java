package stageOne.com.jeffrey.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author jeffrey
 * @ClassName: servlet
 * @Description:
 * @date: 2021/7/8 12:33 上午
 * @version:
 * @since JDK 1.8
 */


public class HelloServlet implements Servlet {

    public HelloServlet() {
        System.out.println("① 构造方法执行了");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("② init 方法执行了");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     * @Descriptioin: service 方法用于处理请求和响应
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        if ("GET".equalsIgnoreCase(request.getMethod())){
            doGet();
        } else if ("POST".equalsIgnoreCase(request.getMethod())) {
            doPost();

        }
    }

    /**
     * @Description: 处理 GET 请求
     */
    public void doGet(){
        System.out.println("GET 请求");
    }

    /**
     * @Description: 处理 POST 请求
     */
    public void doPost(){
        System.out.println("POST 请求");

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("④ story 方法执行了");
    }
}
