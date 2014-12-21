//import java.sqlStatement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.StringTokenizer;

public class SqlInsert {

    static String jdbc_driver = "com.mysql.jdbc.Driver";
    static String db_url = "jdbc:mysql://sql5.freemysqlhosting.net/sql561737";

    static String user = "sql561737";
    static String password = "rA2%pI6%";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to mysql database...");
            conn = DriverManager.getConnection(db_url, user, password);
            System.out.println("connected database successfully");

            System.out.println("Inserting record into table:");

            stmt = conn.createStatement();
            int s;
            String sql = "INSERT INTO person (id, name, address)" + "VALUES (4, 'antra', 'meerut')";
            s = stmt.executeUpdate(sql);
            System.out.println("record inserted... :)");

        }catch(SQLException se) {
            se.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            }catch(SQLException se) {
                se.printStackTrace();
            }


            try {

                if (conn != null) {
                    conn.close();
                }
            }catch(SQLException se) {
                se.printStackTrace();
            }
        }
    }
}