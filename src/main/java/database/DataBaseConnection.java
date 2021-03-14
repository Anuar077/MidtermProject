package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {
    private final static Connection conn = getConn();

    public static Connection getConnection() {
        return conn;
    }

    private static Connection getConn() {
        try {
            Connection c = DriverManager.getConnection("jdbc:sqlite:db.db");

            Statement stmt;

            // Create tables schema
            stmt = c.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS users (\n" +
                    "user_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
                    "user_login TEXT NOT NULL,\n" +
                    "user_password TEXT NOT NULL\n" +
                    "user_phone TEXT NOT NULL\n" +
                    ");");


            stmt = c.createStatement();
            stmt.execute("CREATE UNIQUE INDEX IF NOT EXISTS idx_users_login ON users (user_login);");

            return c;
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
