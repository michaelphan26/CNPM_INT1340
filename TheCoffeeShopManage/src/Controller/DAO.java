/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Hida
 */
public class DAO {
    public static Connection Connect(){
        System.out.println("ok");
        Connection conn = null;
        try {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Test", "sa", "123");
            System.out.println("Kết nối SQL thành công");
        } catch (Exception e) {
            System.out.println("Không thể kết nối SQL");
        }
        return conn;
    }
}
