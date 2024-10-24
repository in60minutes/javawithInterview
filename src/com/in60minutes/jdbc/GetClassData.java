package com.in60minutes.jdbc;

import java.io.PrintStream;
import java.sql.*;

public class GetClassData {
    public GetClassData() {
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/jfs";
        String un = "root";
        String pw = "root";
        String query = "select * from student";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection com = DriverManager.getConnection(url, un, pw);
        Statement st = com.createStatement();
        ResultSet rs = st.executeQuery(query);

        while(rs.next()) {
            PrintStream var10000 = System.out;
            int var10001 = rs.getInt(1);
            var10000.println("" + var10001 + " : " + rs.getString(2) + " : " + rs.getInt(3));
        }

        st.close();
        com.close();
    }
}
