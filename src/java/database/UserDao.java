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
import java.util.ArrayList;
import model.User;

/**
 *
 * @author nhatp
 */
public class UserDao {
    public ArrayList<User> getUser() {
            ArrayList<User> list = new ArrayList<>();
            String query = "select * from [user]";
        try {
            
            Connection conn = new JDBCUtil().getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                list.add(new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
            }

        } catch (Exception e) {
        }
        return list;
    }

    public User getListTaiKhoanAdminById(User t) {
        User ketQua = null;
        try {
            final Connection con = JDBCUtil.getConnection();
            final String sql = "SELECT * FROM user WHERE id=?";
            final PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, t.getId());
            System.out.println(sql);
            final ResultSet rs = st.executeQuery();
            if (rs.next()) {
                ketQua = new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
            }

        } catch (Exception e) {
        }
        return ketQua;
    }
    public User getUserByIdString(String t) {
        User ketQua = null;
        try {
            final Connection con = JDBCUtil.getConnection();
            final String sql = "SELECT * FROM user WHERE id=?";
            final PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, t);
            System.out.println(sql);
            final ResultSet rs = st.executeQuery();
            if (rs.next()) {
                ketQua = new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
            }

        } catch (Exception e) {
        }
        return ketQua;
    }
    
    public int delete(String id){
        int ketQua = 0;
        try {
            final Connection con = JDBCUtil.getConnection();
            final String sql = "DELETE from user  WHERE id=?";
            final PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, id);
            System.out.println(sql);
            ketQua = st.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }
    
     public int insert(final User t) {
        int ketQua = 0;
        try {
            final Connection con = JDBCUtil.getConnection();
            final String sql = "INSERT INTO user (id, email, password,name)  VALUES (?,?,?,?)";
            final PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, t.getId());
            st.setString(2, t.getEmail());
            st.setString(3, t.getPassword());
            st.setString(4, t.getName());
          
            ketQua = st.executeUpdate();
            System.out.println("B\u1ea1n \u0111\u00e3 th\u1ef1c thi: " + sql);
            System.out.println("C\u00f3 " + ketQua + " d\u00f2ng b\u1ecb thay \u0111\u1ed5i!");
            JDBCUtil.closeConnection(con);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }
     
     public int insertAll( ArrayList<User> arr) {
        int dem = 0;
        for (final User user : arr) {
            dem += this.insert(user);
        }
        return dem;
    }
     
     public int update( User t) {
        int ketQua = 0;
        try {
            final Connection con = JDBCUtil.getConnection();
            final String sql = "UPDATE user  SET  name=?, email=?, password=? WHERE id=?";
            final PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, t.getName());
            st.setString(2, t.getEmail());
            st.setString(3, t.getPassword());
            st.setString(4, t.getId());
            System.out.println(sql);
            ketQua = st.executeUpdate();
          
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }
     
     public User selectByUserAndPassword(User t) {
        User ketQua = null;
        try {
            final Connection con = JDBCUtil.getConnection();
            final String sql = "Select * from [user] where [email] = ? and [password] = ?";
            final PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, t.getEmail());
            st.setString(2, t.getPassword());
            System.out.println(sql);
            final ResultSet rs = st.executeQuery();
            if (rs.next()) {
                ketQua = new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
            }

        } catch (Exception e) {
        }
        return ketQua;
    }
     public boolean kiemTraTenDangNhap(final String email) {
        boolean ketQua = false;
        try {
            final Connection con = JDBCUtil.getConnection();
            final String sql = "SELECT * FROM user WHERE email=?";
            final PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, email);
            System.out.println(sql);
            final ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ketQua = true;
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
return ketQua;
    }
}
