package homework.slide34.databaseSettings;

public class CreateTableUsers {
    private static final String CREATE_TABLE_USERS = "" +
            "CREATE TABLE Users " +
            "(" +
            "id_user INT AUTO_INCREMENT PRIMARY KEY, " +
            "name varchar(30) NOT NULL, " +
            "surname varchar(30) NOT NULL, " +
            "address varchar(255) NOT NULL, " +
            "mail varchar(50) NOT NULL, " +
            "phone varchar(50) NOT NULL" +
            ");";

    public static void createTableUsers(DatabaseConnector databaseConnector) {
        databaseConnector.executeUpdate(CREATE_TABLE_USERS);
    }
}
