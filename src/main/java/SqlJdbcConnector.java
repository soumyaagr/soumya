import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class SqlJdbcConnector {
    Connection connection = null;

    public Connection getConn() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net:3306/sql561737", "sql561737", "rA2%pI6%");

        } catch (SQLException e) {
            System.out.println("connectn faild!!!");
            e.printStackTrace();
//            return;

        }
        return connection;
    }

    public void connector() {
        System.out.println("----------------------sql jdbc connection test---------------------------");
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("class not found");
            e.printStackTrace();
            return;
        }

        System.out.println("driver registered!");
        connection = getConn();


//        return connection;
    }

    public void connClose(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
