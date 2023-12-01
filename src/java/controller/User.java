/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import database.UserDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Random;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author nhatp
 */
@WebServlet(name = "User", urlPatterns = {"/user"})
public class User extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String hanhDong = request.getParameter("hanhDong");
        if (hanhDong.equals("dang-nhap")) {
            dangNhap(request, response);
        } else if (hanhDong.equals("dang-xuat")) {
            dangXuat(request, response);
        } 
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    private void dangNhap(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        final model.User kh = new model.User();
        kh.setEmail(email);
        kh.setPassword(password);
        final UserDao khd = new UserDao();
        final model.User khachHang = khd.selectByUserAndPassword(kh);
        String url = "";
        if (khachHang != null) {
            final HttpSession session = request.getSession();
            session.setAttribute("khachHang", (Object)khachHang);
            url = "/admin.jsp";
        }
        else {
            request.setAttribute("baoLoi", (Object)"T\u00ean \u0111\u0103ng nh\u1eadp ho\u1eb7c m\u1eadt kh\u1ea9u kh\u00f4ng \u0111\u00fang!");
            url = "/login.jsp";
        }
        final RequestDispatcher rd = this.getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
    }

    private void dangXuat(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        //huỷ bỏ ssession
        session.invalidate();
        response.sendRedirect("index.jsp");
    }
    
   
}