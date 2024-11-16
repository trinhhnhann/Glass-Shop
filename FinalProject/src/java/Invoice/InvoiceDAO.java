/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice;

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
public class InvoiceDAO extends DBContext {

    public boolean AddInvoice(InvoiceInfo iv) {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO TBL_INVOICE (INVID, USERID, DATEBUY, GMAIL, ADDRESS, TOTAL) VALUES (?, ?, ?, ?, ?, ?)";
        try {

            ps = connection.prepareStatement(sql);
            ps.setString(1, iv.getInvId());
            ps.setString(2, iv.getUserId());
            ps.setString(3, iv.getDateBuy());
            ps.setString(4, iv.getGmail());
            ps.setString(5, iv.getAddress());
            ps.setFloat(6, iv.getTotal());
            int i = ps.executeUpdate();
            if (i == 1) {
                check = true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return check;
    }

    public boolean checkInvoice(String invId) {
        String sql = "SELECT INVID FROM TBL_INVOICE WHERE INVID=?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, invId);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public List<InvoiceInfo> getAllInvoices() {
        List<InvoiceInfo> invoiceList = new ArrayList<InvoiceInfo>();
        InvoiceInfo invoice;
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "SELECT * FROM TBL_INVOICE;";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                invoice = new InvoiceInfo(
                        rs.getString("INVID"),
                        rs.getString("USERID"),
                        rs.getString("DATEBUY"),
                        rs.getString("GMAIL"),
                        rs.getString("ADDRESS"),
                        rs.getFloat("TOTAL")
                );
                invoiceList.add(invoice);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return invoiceList;
    }

    public List<InvoiceInfo> getInvoicesByUser(String userID){
        List<InvoiceInfo> invoiceList = new ArrayList<InvoiceInfo>();
        InvoiceInfo invoice;
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "SELECT * FROM TBL_INVOICE WHERE USERID = ?;";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, userID);

            rs = ps.executeQuery();
            while (rs.next()) {
                invoice = new InvoiceInfo(
                        rs.getString("INVID"),
                        rs.getString("USERID"),
                        rs.getString("DATEBUY"),
                        rs.getString("GMAIL"),
                        rs.getString("ADDRESS"),
                        rs.getFloat("TOTAL")
                );
                invoiceList.add(invoice);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return invoiceList;
    }

}
