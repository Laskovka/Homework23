package homework.slide34.databaseSettings;

public class CreateTableProducts {
    private static final String CREATE_TABLE_PRODUCTS = "" +
            "CREATE TABLE Products " +
            "(" +
            "id_product INT AUTO_INCREMENT PRIMARY KEY, " +
            "name varchar(50) NOT NULL, " +
            "id_category INT NOT NULL, " +
            "price varchar(100) NOT NULL, " +
            "FOREIGN KEY (id_category) REFERENCES Categories (id_category)" +
            ");";

    public static void createTableProducts(DatabaseConnector databaseConnector) {
        databaseConnector.executeUpdate(CREATE_TABLE_PRODUCTS);
    }
}
