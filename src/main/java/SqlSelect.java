
import java.sql.*;

public class SqlSelect{
    public static void main(String[] args) {
        SqlJdbcConnector sjcon = new SqlJdbcConnector();
        Connection conn = null;
        sjcon.connector();
        conn = sjcon.getConn();

        Statement stmt = null;
        try {

            stmt = conn.createStatement();

            boolean s;
            String sql = "SELECT * FROM person";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                int id = rs.getInt("id");
                String n = rs.getString("name");
                String add = rs.getString("address");
                System.out.println(id + "\t" + n + "\t" + add);
            }
            s = stmt.execute(sql);
            System.out.println(s);
//            System.out.println("record inserted... :)");

        }catch(SQLException se) {
            se.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                sjcon.connClose(conn);
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