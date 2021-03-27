package homework.slide34.dao;

import homework.slide34.databaseSettings.DatabaseConnector;
import homework.slide34.entities.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDao {
    private static final String INSERT_PRODUCT = "INSERT INTO products (name, id_category, price) VALUES (?, ?, ?)";
    private static final String UPDATE_PRODUCT = "UPDATE products SET name = ?, id_category = ?, price = ? WHERE id_product = ?";
    private static final String SELECT_ID_OF_PRODUCT = "SELECT id_product FROM products WHERE name = ? AND id_category = ? AND price = ?";

    public void insertProduct(DatabaseConnector databaseConnector, Product product) {
        PreparedStatement preparedStatement = databaseConnector.getPrepareStatement(INSERT_PRODUCT);
        try {
            preparedStatement.setString(1, product.getName());
            preparedStatement.setObject(2, product.getCategory().getId_category());
            preparedStatement.setDouble(3, product.getPrice());
            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public void updateProduct(DatabaseConnector databaseConnector, Product oldProduct, Product newProduct) {
        try {
            PreparedStatement preparedStatementOldProduct = databaseConnector.getPrepareStatement(SELECT_ID_OF_PRODUCT);
            preparedStatementOldProduct.setString(1, oldProduct.getName());
            preparedStatementOldProduct.setLong(2, oldProduct.getCategory().getId_category());
            preparedStatementOldProduct.setDouble(3, oldProduct.getPrice());

            PreparedStatement preparedStatementNewProduct = databaseConnector.getPrepareStatement(UPDATE_PRODUCT);
            preparedStatementNewProduct.setString(1, newProduct.getName());
            preparedStatementNewProduct.setLong(2, newProduct.getCategory().getId_category());
            preparedStatementNewProduct.setDouble(3, newProduct.getPrice());

            ResultSet resultSet = preparedStatementOldProduct.executeQuery();
            while(resultSet.next()) {
                long idOldProduct = resultSet.getLong("id_product");
                preparedStatementNewProduct.setLong(4, idOldProduct);
                preparedStatementNewProduct.executeUpdate();
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
