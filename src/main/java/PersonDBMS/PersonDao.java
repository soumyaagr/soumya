package PersonDBMS;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class PersonDao {
    Person P = new Person();
    int checkByName(String name) throws SQLException {
        Connection c = DriverManager.getConnection(
         "jdbc:hsqldb:file:/opt/db/testdb;ifexists=true", "SA", "");
        return 0;
    }
}
