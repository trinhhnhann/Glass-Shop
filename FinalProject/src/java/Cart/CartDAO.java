/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cart;

import Utils.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author nhana
 */
public class CartDAO extends DBContext {

    public boolean addToCart(CartInfo gl) {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO TBL_CART (CARTID, GLASSID, USERID, INVID, PRICE, QUANTITY, TOTALPRICE, IMAGE) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {

            ps = connection.prepareStatement(sql);
            ps.setString(1, gl.getCardId());
            ps.setString(2, gl.getGlassId());
            ps.setString(3, gl.getUserId());
            ps.setString(4, gl.getInvId());
            ps.setFloat(5, gl.getPrice());
            ps.setInt(6, gl.getQuantity());
            ps.setFloat(7, gl.getTotalprice());
            ps.setString(8, gl.getImage());
            int i = ps.executeUpdate();
            if (i == 1) {
                check = true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return check;
    }

    public CartInfo getCartByGlassesId(String idGlasses, String userID) {
        String sql = "SELECT * FROM TBL_CART WHERE GLASSID = ? and USERID =?;";
        CartInfo cart = null;
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, idGlasses);
            ps.setString(2, userID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String cartId = rs.getString("CARTID");
                String invId = rs.getString("INVID");
                float price = rs.getFloat("PRICE");
                float totalPrice = rs.getFloat("TOTALPRICE");
                int quantity = rs.getInt("QUANTITY");
                String image = rs.getString("IMAGE");
                cart = new CartInfo(cartId, idGlasses, userID, invId, price, quantity, totalPrice, image);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return cart;
    }

    public boolean updateCart(CartInfo cart) {
        String sql = "UPDATE TBL_CART SET TOTALPRICE = ?, QUANTITY = ? WHERE CARTID = ?;";
        boolean response = false;
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setFloat(1, cart.getPrice() * cart.getQuantity());
            ps.setInt(2, cart.getQuantity());
            ps.setString(3, cart.getCardId());
            response = ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return response;
    }

    public ArrayList<CartInfo> getListCart(String UserId) {
        ArrayList<CartInfo> list = new ArrayList();
        String sql = "SELECT * FROM TBL_CART WHERE USERID = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, UserId);
            rs = ps.executeQuery();
            while (rs.next()) {
                String cartId = rs.getString("CARTID");
                String glassId = rs.getString("GLASSID");
                String invId = rs.getString("INVID");
                float price = rs.getFloat("PRICE");
                float totalPrice = rs.getFloat("TOTALPRICE");
                int quantity = rs.getInt("QUANTITY");
                String image = rs.getString("IMAGE");
                CartInfo c = new CartInfo(cartId, glassId, UserId, invId, price, quantity, totalPrice, image);
                list.add(c);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void updateInvId(CartInfo cart) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE TBL_CART SET INVID = ? WHERE CARTID = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, cart.getInvId());
        ps.setString(2, cart.getCardId());
        ps.executeUpdate();
    }

    public boolean removeFromCart(String cartId) {
        String sql = "DELETE FROM TBL_CART WHERE CARTID = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        boolean response = true;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, cartId);
            response = ps.executeUpdate() > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
    
    public CartInfo getCartById(String UserId) {
        String sql = "SELECT * FROM TBL_CART WHERE CARTID = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        CartInfo c = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, UserId);
            rs = ps.executeQuery();
            while (rs.next()) {
                String cartId = rs.getString("CARTID");
                String glassId = rs.getString("GLASSID");
                String invId = rs.getString("INVID");
                float price = rs.getFloat("PRICE");
                float totalPrice = rs.getFloat("TOTALPRICE");
                int quantity = rs.getInt("QUANTITY");
                String image = rs.getString("IMAGE");
                c = new CartInfo(cartId, glassId, UserId, invId, price, quantity, totalPrice, image);
            }
        } catch (Exception e) {
        }
        return c;
    }
}
