package homework.slide34.databaseSettings;

public class CreateTableOrders {
    private static final String CREATE_TABLE_ORDERS = "" +
            "CREATE TABLE Orders " +
            "(" +
            "id_order INT AUTO_INCREMENT PRIMARY KEY, " +
            "id_user INT NOT NULL, " +
            "id_product INT NOT NULL, " +
            "count INT NOT NULL, " +
            "status varchar(30) NOT NULL, " +
            "date_of_create TIMESTAMP NOT NULL, " +
            "FOREIGN KEY (id_user) REFERENCES Users (id_user) ON DELETE NO ACTION, " +
            "FOREIGN KEY (id_product) REFERENCES Products (id_product) ON DELETE NO ACTION" +
            ");";

    public static void createTableOrders(DatabaseConnector databaseConnector) {
        databaseConnector.executeUpdate(CREATE_TABLE_ORDERS);
    }
}
