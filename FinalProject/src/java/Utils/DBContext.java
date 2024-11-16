/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nhana
 */
public class DBContext {
    protected Connection connection;
    public DBContext(){
        try{
            String url="jdbc:sqlserver://LAPTOP-LJR5BSG7:1433;databaseName=FINALPRJ";
            String username="SA";
            String password="123456";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, username, password);
        } catch(ClassNotFoundException|SQLException ex){
            System.out.println(ex);
        }
    }
}
