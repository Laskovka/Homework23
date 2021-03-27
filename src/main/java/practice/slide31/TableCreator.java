package practice.slide31;

public class TableCreator {
    private static final String CREATE_STUDENT_TABLE = "" +
            "CREATE TABLE Student" +
            "(" +
            "student_id INT PRIMARY KEY AUTO_INCREMENT," +
            "first_name VARCHAR(50) NOT NULL," +
            "last_name VARCHAR(50) NOT NULL," +
            "data_of_birth  DATE" +
            ");";
    private static final String CREATE_MODULE_TABLE = "" +
            "CREATE TABLE Module" +
            "(" +
            "module_id INT PRIMARY KEY AUTO_INCREMENT," +
            "module_title VARCHAR(50) NOT NULL," +
            "level INT NOT NULL," +
            "credits INT NOT NULL DEFAULT 20" +
            ");";
    private static final String CREATE_REGISTRATION_TABLE = "" +
            "CREATE TABLE registration" +
            "(" +
            "student_id INT," +
            "module_id INT," +
            "result  NUMERIC," +
            "PRIMARY KEY(Student_id,module_id)," +
            "FOREIGN KEY (student_id) REFERENCES  Student (student_id)," +
            "FOREIGN KEY (module_id) REFERENCES Module(module_id)" +
            ");";
    public void createTableStudents(DatabaseConnector databaseConnector) {
        databaseConnector.executeUpdate(CREATE_STUDENT_TABLE);
    }

    public void createTableModules(DatabaseConnector databaseConnector) {
        databaseConnector.executeUpdate(CREATE_MODULE_TABLE);
    }

    public void createTableRegistrations(DatabaseConnector databaseConnector) {
        databaseConnector.executeUpdate(CREATE_REGISTRATION_TABLE);
    }
}
