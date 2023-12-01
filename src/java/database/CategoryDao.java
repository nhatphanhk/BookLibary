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
import model.Category;

/**
 *
 * @author nhatp
 */
public class CategoryDao {
    //đọc tất cả các bản ghi từ table Student
        public List<Category> getAll() {
        List<Category> list = new ArrayList<>();
        String sql = "select * from [category]";

        try {
            Connection conn = new JDBCUtil().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category category = new Category(rs.getString(1),rs.getString(2));
                list.add(category);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }

    // insert a Student
    public void insert(Category s) {
        String sql = "INSERT INTO [category] ([id], [name] )  VALUES (?,?)";
        try {
            Connection conn = new JDBCUtil().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getId());
            ps.setString(2, s.getName());
            ResultSet rs = ps.executeQuery();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public Category getListCategoryById(Category t) {
        Category ketQua = null;
        try {
            final Connection con = JDBCUtil.getConnection();
            final String sql =  "select * from [category] where [id]=?";
            final PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, t.getId());
            System.out.println(sql);
            final ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Category category = new Category(rs.getString(1),rs.getString(2));
                return category;
            }

        } catch (Exception e) {
        }
        return ketQua;
    }

    //Tìm 1 sinh viên theo ID
    public Category getStudentById(String id) {
        String sql = "select * from [category] where [id]=?";

        try {
            Connection conn = new JDBCUtil().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category category = new Category(rs.getString(1),rs.getString(2));
                return category;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

    //Delete
    public void delete(String id) {
        String sql = "DELETE FROM [category] WHERE [id]=?";
        try {
            Connection conn = new JDBCUtil().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //Update
    public void update(Category s) {
        String sql = "UPDATE [category] SET [name]=?  WHERE [id]=?";
        try {
            Connection conn = new JDBCUtil().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getId());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
}
