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

/**
 *
 * @author nhatp
 */
public class AuthorDao {

    //đọc tất cả các bản ghi từ table Student
    public List<Author> getAll() {
        List<Author> list = new ArrayList<>();
        String sql = "select * from [author]";

        try {
            Connection conn = new JDBCUtil().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Author author = new Author(rs.getString(1), rs.getString(2), rs.getString(3));
                list.add(author);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }

    // insert a Student
    public void insert(Author s) {
        String sql = "INSERT INTO [author] ([id], [name],[age] )  VALUES (?,?,?)";
        try {
            Connection conn = new JDBCUtil().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getAge());
            ResultSet rs = ps.executeQuery();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Author getListById(Author t) {
        Author ketQua = null;
        try {
            final Connection con = JDBCUtil.getConnection();
            final String sql = "select * from [author] where [id]=?";
            final PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, t.getId());
            System.out.println(sql);
            final ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Author author = new Author(rs.getString(1), rs.getString(2), rs.getString(3));
                return author;
            }

        } catch (Exception e) {
        }
        return ketQua;
    }

    //Tìm 1 sinh viên theo ID
    public Author getStudentById(String id) {
        String sql = "select * from [author] where [id]=?";

        try {
            Connection conn = new JDBCUtil().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Author author = new Author(rs.getString(1), rs.getString(2), rs.getString(3));
                return author;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

    //Delete
    public void delete(String id) {
        String sql = "DELETE FROM [author] WHERE [id]=?";
        try {
            Connection conn = new JDBCUtil().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //Update
    public void update(Author s) {
        String sql = "UPDATE [author] SET [name]=?, [age]=?  WHERE [id]=?";
        try {
            Connection conn = new JDBCUtil().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(3, s.getId());
            ps.setString(2, s.getAge());

            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
}
