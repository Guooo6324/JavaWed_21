package com.ujiuye.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 郭
 */
@WebServlet(name = "AxiosTestServlet",urlPatterns = "/axiosTest")
public class AxiosTestServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取请求参数
        String name = request.getParameter("name");
        System.out.println(name);
       response.setHeader("Content-Type","text/html;charset=utf-8");
        //2.响应
        response.getWriter().print("收到");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
