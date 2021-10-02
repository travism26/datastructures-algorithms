package datastructure.algorithms.OOD.hospitalExample.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {

    private Connection conn;
    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();

    public DatabaseConnectionManager() {

    }

    public static DatabaseConnectionManager getManagerInstance() {
        return connectionInstance;
    }

    public void connect() throws SQLException {
        conn = DriverManager.getConnection("some/database/url");
        System.out.println("Connected to database");
    }

    public Connection getConnectionObject() {
        return this.conn;
    }

    public void disconnect() throws SQLException {
        conn.close();
        System.out.println("Disconnect from DB");
    }

}
