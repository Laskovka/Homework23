package homework.slide34.dao;

import homework.slide34.databaseSettings.DatabaseConnector;
import homework.slide34.entities.Category;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@Deprecated
public class CategoryDao {
    private static final String INSERT_CATEGORY = "INSERT INTO categories (name) VALUES (?)";

    public void insertCategory(DatabaseConnector databaseConnector, String name) {
        PreparedStatement preparedStatement = databaseConnector.getPrepareStatement(INSERT_CATEGORY);
        try {
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
