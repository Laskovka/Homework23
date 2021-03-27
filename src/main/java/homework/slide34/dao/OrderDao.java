package homework.slide34.dao;

import homework.slide34.databaseSettings.DatabaseConnector;
import homework.slide34.entities.Order;
import homework.slide34.entities.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderDao {
    private static final String INSERT_ORDER = "INSERT INTO orders (id_user, id_product, count, status, date_of_create) VALUES (?, ?, ?, ?, ?)";
    private static final String UPDATE_ORDER = "UPDATE orders SET id_user = ?, id_product = ?, count = ?, status = ?, date_of_create = ? WHERE id_order = ?";
    private static final String SELECT_ID_OF_ORDER = "SELECT id_order FROM orders WHERE id_user = ? AND id_product = ? AND count = ? AND status = ? AND date_of_create = ?";

    public void insertOrder(DatabaseConnector databaseConnector, Order order) {
        try {
            PreparedStatement preparedStatement = getPreparedStatementOrder(databaseConnector, order, INSERT_ORDER);
            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public void updateOrder(DatabaseConnector databaseConnector, Order oldOrder, Order newOrder) {
        try {
            PreparedStatement preparedStatementOldOrder = getPreparedStatementOrder(databaseConnector, oldOrder, SELECT_ID_OF_ORDER);

            PreparedStatement preparedStatementNewOrder = getPreparedStatementOrder(databaseConnector, newOrder, UPDATE_ORDER);

            ResultSet resultSet = preparedStatementOldOrder.executeQuery();
            while (resultSet.next()) {
                long idOldProduct = resultSet.getLong("id_order");
                preparedStatementNewOrder.setLong(6, idOldProduct);
                preparedStatementNewOrder.executeUpdate();
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    private PreparedStatement getPreparedStatementOrder(DatabaseConnector databaseConnector, Order order, String query) throws SQLException {
        PreparedStatement preparedStatement = databaseConnector.getPrepareStatement(query);
        preparedStatement.setLong(1, order.getId_user());
        preparedStatement.setLong(2, order.getId_product());
        preparedStatement.setLong(3, order.getCount());
        preparedStatement.setString(4, order.getStatus());
        preparedStatement.setTimestamp(5, order.getDate_of_create());
        return preparedStatement;
    }
}
