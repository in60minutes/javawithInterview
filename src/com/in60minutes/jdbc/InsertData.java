package com.in60minutes.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {
    public InsertData() {
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/orders";
        String un = "root";
        String pw = "root";
        String query = "insert into amazon values(?,?,?)";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ...");
        int no = sc.nextInt();
        System.out.println("Enter Name ...");
        String name = sc.next();
        System.out.println("Enter Brand ...");
        String brand = sc.next();
        Connection con = DriverManager.getConnection(url, un, pw);
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, no);
        ps.setString(2, name);
        ps.setString(3, brand);
        int rs = ps.executeUpdate();
        System.out.println("succussfully added ...");
        ps.close();
        con.close();
    }
}
