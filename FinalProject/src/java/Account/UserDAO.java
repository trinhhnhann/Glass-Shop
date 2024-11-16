/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import Utils.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nhana
 */
public class UserDAO extends DBContext {

    public UserInfo check(String identifier, String password) {
        String sql = "SELECT USERID, FULLNAME, PASSWORD, ROLEID, GMAIL, ADDRESS, STATUS \n"
                + "FROM TBL_USER \n"
                + "WHERE (USERID = ? OR GMAIL = ?) AND PASSWORD = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, identifier);
            st.setString(2, identifier); // Using the same identifier for both USERID and GMAIL
            st.setString(3, password);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                UserInfo user = new UserInfo(
                        rs.getString("USERID"),
                        rs.getString("FULLNAME"),
                        rs.getString("PASSWORD"),
                        rs.getInt("ROLEID"),
                        rs.getString("GMAIL"),
                        rs.getString("ADDRESS"),
                        rs.getInt("STATUS")
                );
                return user;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public void addUser(UserInfo c) {
        String sql = "INSERT INTO TBL_USER (USERID, FULLNAME, PASSWORD, ROLEID, GMAIL, ADDRESS, STATUS) VALUES (?, ?, ?, 1, ?, ?, 1)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, c.getUserId());
            st.setString(2, c.getFullName());
            st.setString(3, c.getPassword());
            st.setString(4, c.getGmail());
            st.setString(5, c.getAddress());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public UserInfo getUserById(String id) {
        String sql = "SELECT * FROM TBL_USER WHERE USERID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                UserInfo c = new UserInfo(
                        rs.getString("USERID"),
                        rs.getString("FULLNAME"),
                        rs.getString("PASSWORD"),
                        rs.getInt("ROLEID"),
                        rs.getString("GMAIL"),
                        rs.getString("ADDRESS"),
                        rs.getInt("STATUS")
                );
                return c;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public boolean update(UserInfo acc) {
        String sql = "UPDATE TBL_USER SET USERID = ?, FULLNAME = ?,PASSWORD = ?, ROLEID = ?, GMAIL = ?, ADDRESS = ?, STATUS = ? WHERE USERID=?;";
        boolean response = false;
        PreparedStatement ps;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, acc.getUserId());
            ps.setString(2, acc.getFullName());
            ps.setString(3, acc.getPassword());
            ps.setInt(4, acc.getRoleId());
            ps.setString(5, acc.getGmail());
            ps.setString(6, acc.getAddress());
            ps.setInt(7, acc.getStatus());
            ps.setString(8, acc.getUserId());
            response = ps.executeUpdate() > 0;
        } catch (Exception ex) {
        }
        return response;
    }

    public List<UserInfo> getAll() {
        List<UserInfo> list = new ArrayList<>();
        String sql = "SELECT * FROM TBL_USER";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                UserInfo c = new UserInfo(
                        rs.getString("USERID"),
                        rs.getString("FULLNAME"),
                        rs.getString("PASSWORD"),
                        rs.getInt("ROLEID"),
                        rs.getString("GMAIL"),
                        rs.getString("ADDRESS"),
                        rs.getInt("STATUS")
                );
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    public void delete(String id) {
    String sql = "DELETE FROM TBL_USER WHERE USERID=?";
    try {
        PreparedStatement st = connection.prepareStatement(sql);
        st.setString(1, id);
        int rowsAffected = st.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Successfully deleted user with ID: " + id);
        } else {
            System.out.println("No user found with ID: " + id);
        }
    } catch (SQLException e) {
        System.out.println("Error deleting user with ID: " + id);
        e.printStackTrace();
        }
    }
    
    public List<UserInfo> getUserByName(String id) {
        List<UserInfo> userList = new ArrayList<>();
        String sql = "SELECT * FROM TBL_USER WHERE FULLNAME=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                UserInfo c = new UserInfo(
                        rs.getString("USERID"),
                        rs.getString("FULLNAME"),
                        rs.getString("PASSWORD"),
                        rs.getInt("ROLEID"),
                        rs.getString("GMAIL"),
                        rs.getString("ADDRESS"),
                        rs.getInt("STATUS")
                );
                userList.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return userList;
    }
    
}
