/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Author;
import model.Book;
import model.Category;

/**
 *
 * @author nhatp
 */
public class BookDao {

    //đọc tất cả các bản ghi từ table Student
    public List<Book> getAll() {
        List<Book> list = new ArrayList<>();
        String sql = "select * from [book]";

        try {
            Connection conn = new JDBCUtil().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category c1 = new Category();
                c1.setId(rs.getString(4));
                Author a1 = new Author();
                a1.setId(rs.getString(5));
                Category c2 = new CategoryDao().getListCategoryById(c1);
                Author a2 = new AuthorDao().getListById(a1);
                Book book = new Book(rs.getString(1), rs.getString(2), rs.getString(3), c2, a2, rs.getInt(6), rs.getString(7));
                list.add(book);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }
    public List<Book> getFour() {
        List<Book> list = new ArrayList<>();
        String sql = "select top 4 * from [book] ";

        try {
            Connection conn = new JDBCUtil().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category c1 = new Category();
                c1.setId(rs.getString(4));
                Author a1 = new Author();
                a1.setId(rs.getString(5));
                Category c2 = new CategoryDao().getListCategoryById(c1);
                Author a2 = new AuthorDao().getListById(a1);
                Book book = new Book(rs.getString(1), rs.getString(2), rs.getString(3), c2, a2, rs.getInt(6), rs.getString(7));
                list.add(book);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }

    // insert a Student
    public void insert(Book s) {
        String sql = "INSERT INTO [Book] ([id], [name],[description], [idcategory],[idauthor],[amount],[img] )  VALUES (?,?,?,?,?,?,?)";
        try {
            Connection conn = new JDBCUtil().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getDescription());
            ps.setString(4, s.getIdcategory().getId());
            ps.setString(5, s.getIdauthor().getId());
            ps.setInt(6, s.getAmount());
            ps.setString(7, s.getImg());

            ResultSet rs = ps.executeQuery();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Book getBookById(String id) {
        String sql = "select * from [book] where [id]=?";

        try {
            Connection conn = new JDBCUtil().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category c1 = new Category();
                c1.setId(rs.getString(4));
                Author a1 = new Author();
                a1.setId(rs.getString(5));
                Category c2 = new CategoryDao().getListCategoryById(c1);
                Author a2 = new AuthorDao().getListById(a1);
                Book book = new Book(rs.getString(1), rs.getString(2), rs.getString(3), c2, a2, rs.getInt(6), rs.getString(7));
                return book;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

    //Delete
    public void delete(String id) {
        String sql = "DELETE FROM [book] WHERE [id]=?";
        try {
            Connection conn = new JDBCUtil().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //Update
    public void update(Book s) {
        String sql = "UPDATE [book] SET [name]=?,[description]=?, [idcategory]=?,[idauthor]=?,[amount]=?,[img]=?  WHERE [id]=?";
        try {
            Connection conn = new JDBCUtil().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getDescription());
            ps.setString(3, s.getIdcategory().getId());
            ps.setString(4, s.getIdauthor().getId());
            ps.setInt(5, s.getAmount());
            ps.setString(6, s.getImg());
            ps.setString(7, s.getId());

            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
}
