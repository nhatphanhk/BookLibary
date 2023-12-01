/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import database.AuthorDao;
import database.BookDao;
import database.CategoryDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Random;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Author;
import model.Book;
import model.Category;

/**
 *
 * @author nhatp
 */
@WebServlet(name = "BookEdit", urlPatterns = {"/book-edit"})
public class BookEdit extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CategoryEdit</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CategoryEdit at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String id = request.getParameter("id");
        CategoryDao categoryDao = new CategoryDao();
        List<Category> list = categoryDao.getAll();
        request.setAttribute("dataCategory", list);
        AuthorDao authorDao = new AuthorDao();
        List<Author> list1 = authorDao.getAll();
        BookDao bookDao =new BookDao();
        Book book = bookDao.getBookById(id);
        request.setAttribute("dataBook", book);
        request.getRequestDispatcher("book-edit.jsp").forward(request, response);

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
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
                String id = request.getParameter("id");

        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String idcategory = request.getParameter("idcategory");
        String idauthor = request.getParameter("idauthor");
        String amount_raw = request.getParameter("amount");
        String img = request.getParameter("img");
        
        Category c1 = new Category();
                c1.setId(idcategory);
                 Author a1 = new Author();
                a1.setId(idauthor);
                Category c2 = new CategoryDao().getListCategoryById(c1);
                Author a2 = new AuthorDao().getListById(a1);
        
        int amount = Integer.parseInt(amount_raw);
        model.Book kh = new model.Book(id, name,description,c2,a2,amount,img);
        database.BookDao bookDao = new BookDao();
        bookDao.update(kh);

        response.sendRedirect("book-list");
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

}
