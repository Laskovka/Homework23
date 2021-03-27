package homework.slide34.dao;

import homework.slide34.databaseSettings.DatabaseConnector;
import homework.slide34.entities.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private static final String INSERT_USER = "INSERT INTO users (name, surname, address, mail, phone) VALUES (?, ?, ?, ?, ?)";
    private static final String UPDATE_USER = "UPDATE users SET name = ?, surname = ?, address = ?, mail = ?, phone = ? WHERE id_user = ?";
    private static final String SELECT_ID_OF_USER = "SELECT id_user FROM users WHERE name = ? AND surname = ? AND address = ? AND mail = ? AND phone = ?";
    private static final String DELETE_USER = "DELETE FROM users WHERE id_user = ?";

    public void insertUser(DatabaseConnector databaseConnector, User user) {
        try {
            PreparedStatement preparedStatement = getPreparedStatementUser(databaseConnector, user, INSERT_USER);
            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public void updateUser(DatabaseConnector databaseConnector, User oldUser, User newUser) {
        try {
            PreparedStatement preparedStatementOldUser = getPreparedStatementUser(databaseConnector, oldUser, SELECT_ID_OF_USER);

            PreparedStatement preparedStatementNewUser = getPreparedStatementUser(databaseConnector, newUser, UPDATE_USER);

            ResultSet resultSet = preparedStatementOldUser.executeQuery();
            while (resultSet.next()) {
                long idOldProduct = resultSet.getLong("id_user");
                preparedStatementNewUser.setLong(6, idOldProduct);
                preparedStatementNewUser.executeUpdate();
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public void deleteUser(DatabaseConnector databaseConnector, long id) {
        try {
            PreparedStatement preparedStatement = databaseConnector.getPrepareStatement(DELETE_USER);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    private PreparedStatement getPreparedStatementUser(DatabaseConnector databaseConnector, User user, String query) throws SQLException {
        PreparedStatement preparedStatement = databaseConnector.getPrepareStatement(query);
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getSurname());
        preparedStatement.setString(3, user.getAddress());
        preparedStatement.setString(4, user.getMail());
        preparedStatement.setString(5, user.getPhone());
        return preparedStatement;
    }
}
