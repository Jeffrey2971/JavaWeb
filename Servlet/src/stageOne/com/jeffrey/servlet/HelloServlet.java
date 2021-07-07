package stageOne.com.jeffrey.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author jeffrey
 * @ClassName: servlet
 * @Description:
 * @date: 2021/7/8 12:33 上午
 * @version:
 * @since JDK 1.8
 */


public class HelloServlet implements Servlet
{
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * @Descriptioin: service 方法用于处理请求和响应
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("helloServlet");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
