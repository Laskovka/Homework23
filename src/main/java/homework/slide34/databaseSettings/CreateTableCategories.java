package homework.slide34.databaseSettings;

public class CreateTableCategories {
    private static final String CREATE_TABLE_CATEGORIES = "" +
            "CREATE TABLE Categories " +
            "(" +
            "id_category INT AUTO_INCREMENT PRIMARY KEY, " +
            "name varchar(55) NOT NULL UNIQUE" +
            ");";

    public static void createTableCategories(DatabaseConnector databaseConnector) {
        databaseConnector.executeUpdate(CREATE_TABLE_CATEGORIES);
    }
}
