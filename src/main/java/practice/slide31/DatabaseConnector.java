package practice.slide31;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static practice.slide31.ConnectionConstants.URL;
import static practice.slide31.ConnectionConstants.USER;
import static practice.slide31.ConnectionConstants.PASSWORD;

public class DatabaseConnector implements Closeable {
    private final Connection connection;

    public DatabaseConnector() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException);
        }
    }

    public Statement getStatement() {
        try {
            return connection.createStatement();
        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException);
        }
    }

    public ResultSet executeQuery(String query) {
        try {
            return getStatement().executeQuery(query);
        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException);
        }
    }

    public int executeUpdate(String query) {
        try {
            return getStatement().executeUpdate(query);
        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException);
        }
    }

    @Override
    public void close() {
        try {
            connection.close();
        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException);
        }
    }
}
