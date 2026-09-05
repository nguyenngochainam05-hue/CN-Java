/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hainam05.java;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author HAI NAM
 */
@WebServlet("/students")
public class bai2 extends HttpServlet {
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String className = request.getParameter("className");
        String email = request.getParameter("email");

        Student sv = new Student(id, name, className, email);

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html><html><head><meta charset='UTF-8'>");
            out.println("<title>Kết quả thêm sinh viên</title></head><body>");
            out.println("<h2>Đã lưu thông tin sinh viên</h2>");
            out.println("<p>Mã sinh viên: " + sv.getId() + "</p>");
            out.println("<p>Họ tên: " + sv.getName() + "</p>");
            out.println("<p>Lớp: " + sv.getClassName() + "</p>");
            out.println("<p>Email: " + sv.getEmail() + "</p>");
            out.println("<br/><a href='student-form.jsp'>Quay lại thêm sinh viên khác</a>");
            out.println("</body></html>");
        }
    }
}