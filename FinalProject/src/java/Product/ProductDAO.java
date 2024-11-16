/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import Utils.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nhana
 */
public class ProductDAO extends DBContext{
    public List<ProductInfo> getAll() {
        List<ProductInfo> list = new ArrayList<>();
        String sql = "SELECT * FROM TBL_GLASS";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ProductInfo c = new ProductInfo(rs.getString("GLASSID"), rs.getString("NAME"), rs.getString("DESCRIPTION"),rs.getString("TYPE"),rs.getString("IMAGE"), rs.getFloat("PRICE"),rs.getInt("STATUS"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    public List<ProductInfo> getWomenGlasses() {
        List<ProductInfo> list = new ArrayList<>();
        String sql = "SELECT * FROM TBL_GLASS WHERE TYPE='GIRL'";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ProductInfo c = new ProductInfo(rs.getString("GLASSID"), rs.getString("NAME"), rs.getString("DESCRIPTION"),rs.getString("TYPE"),rs.getString("IMAGE"), rs.getFloat("PRICE"),rs.getInt("STATUS"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    public List<ProductInfo> getMenGlasses() {
        List<ProductInfo> list = new ArrayList<>();
        String sql = "SELECT * FROM TBL_GLASS WHERE TYPE='BOY'";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ProductInfo c = new ProductInfo(rs.getString("GLASSID"), rs.getString("NAME"), rs.getString("DESCRIPTION"),rs.getString("TYPE"),rs.getString("IMAGE"), rs.getFloat("PRICE"),rs.getInt("STATUS"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    public List<ProductInfo> getSunGlasses() {
        List<ProductInfo> list = new ArrayList<>();
        String sql = "SELECT * FROM TBL_GLASS WHERE TYPE='SUN'";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ProductInfo c = new ProductInfo(rs.getString("GLASSID"), rs.getString("NAME"), rs.getString("DESCRIPTION"),rs.getString("TYPE"),rs.getString("IMAGE"), rs.getFloat("PRICE"),rs.getInt("STATUS"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    public List<ProductInfo> getAllByIdAndName(String glassId, String name) {
    List<ProductInfo> mobileList = new ArrayList<>();
    String sql = "SELECT * FROM TBL_GLASS WHERE GLASSID LIKE ? OR NAME LIKE ?;";
    try (PreparedStatement ps = connection.prepareStatement(sql)) {
        ps.setString(1, '%' + glassId + '%');
        ps.setString(2, '%' + name + '%');
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                ProductInfo mobile = new ProductInfo(
                    rs.getString("GLASSID"), 
                    rs.getString("NAME"), 
                    rs.getString("DESCRIPTION"),
                    rs.getString("TYPE"), 
                    rs.getString("IMAGE"), 
                    rs.getFloat("PRICE"), 
                    rs.getInt("STATUS")
                );
                mobileList.add(mobile);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Or handle more gracefully
    }
    return mobileList;
}
    
    public List<ProductInfo> getListProductByPrice(double fromPrice, double toPrice) throws Exception {
        List<ProductInfo> list = new ArrayList<>();
        String sql = "SELECT * FROM TBL_GLASS WHERE price BETWEEN ? AND ?";
        ProductInfo c;
        ResultSet rs; 
        PreparedStatement ps;
        try {
            ps = connection.prepareStatement(sql);
            ps.setDouble(1, fromPrice);
            ps.setDouble(2, toPrice);
            rs = ps.executeQuery();
                while (rs.next()) {
                    c = new ProductInfo(
                        rs.getString("GLASSID"), rs.getString("NAME"), rs.getString("DESCRIPTION"),rs.getString("TYPE"),rs.getString("IMAGE"), rs.getFloat("PRICE"),rs.getInt("STATUS")
                );
                list.add(c);
                }
            }catch(Exception ex){
            
        }
        return list;
    }
    
    public boolean update(ProductInfo g) {
        String sql = "UPDATE TBL_GLASS SET NAME = ?, DESCRIPTION = ?, TYPE= ?, IMAGE= ?,  PRICE = ?,  STATUS = ? WHERE GLASSID=?;";
        boolean response = false;
        PreparedStatement ps;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, g.getGlassName());
            ps.setString(2, g.getDescription());
            ps.setString(3, g.getType());
            ps.setString(4, g.getImage());
            ps.setFloat(5, g.getPrice());
            ps.setInt(6, g.getStatus());
            ps.setString(7, g.getGlassId());
            response = ps.executeUpdate() > 0;
        } catch (Exception ex) {
        }
        return response;
    }
 
    public void delete(String glassId) {
        String sql = "DELETE FROM TBL_GLASS WHERE GLASSID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, glassId);
            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Successfully deleted user with ID: " + glassId);
            } else {
                System.out.println("No user found with ID: " + glassId);
            }
        } catch (SQLException e) {
            System.out.println("Error deleting user with ID: " + glassId);
            e.printStackTrace();
            }
    }
    
    public void addGlass(ProductInfo c) {
        String sql = "INSERT INTO TBL_GLASS (GLASSID, NAME, DESCRIPTION, TYPE, IMAGE, PRICE, STATUS) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, c.getGlassId());
            st.setString(2, c.getGlassName());
            st.setString(3, c.getDescription());
            st.setString(4, c.getType());
            st.setString(5, c.getImage());
            st.setFloat(6, c.getPrice());
            st.setInt(7, c.getStatus());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public ProductInfo getGlassById(String glassId) {
    ProductInfo product = null;
    String sql = "SELECT * FROM TBL_GLASS WHERE GLASSID = ?";
    try (
         PreparedStatement st = connection.prepareStatement(sql)) {
        st.setString(1, glassId);
        try (ResultSet rs = st.executeQuery()) {
            if (rs.next()) {
                product = new ProductInfo(
                    rs.getString("GLASSID"), 
                    rs.getString("NAME"), 
                    rs.getString("DESCRIPTION"),
                    rs.getString("TYPE"), 
                    rs.getString("IMAGE"), 
                    rs.getFloat("PRICE"), 
                    rs.getInt("STATUS")
                );
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return product;
}
}
