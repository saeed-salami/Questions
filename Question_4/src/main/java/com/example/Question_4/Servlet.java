package com.example.Question_4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "/servlet")
public class Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        if (request.getHeader("java") == null) {
            response.setStatus(400);
            out.print("ERORR ");
        } else {
            response.setStatus(200);
            out.print("WELCOME ");
        }
        out.flush();
    }
}