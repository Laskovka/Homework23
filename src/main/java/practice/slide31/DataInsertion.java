package practice.slide31;

public class DataInsertion {
    private static final String INSERT_INTO_STUDENT_TABLE = "" +
            "INSERT INTO student (first_name, last_name, data_of_birth) VALUES " +
            "('Daniel', 'Radcliffe', '1995-04-23')," +
            "('Emma', 'Watson', '1994-07-15')," +
            "('Rupert', 'Grint', '1995-10-24');";
    private static final String INSERT_INTO_MODULE_TABLE = "" +
            "INSERT INTO module (module_title, level, credits) VALUES " +
            "('Math', 1, 30)," +
            "('Chemistry', 1, 15);";
    private static final String INSERT_INTO_REGISTRATION_TABLE = "" +
            "INSERT INTO registration (student_id, module_id) VALUES " +
            "(1, 1)";
    public void insertIntoTableStudents(DatabaseConnector databaseConnector) {
        databaseConnector.executeUpdate(INSERT_INTO_STUDENT_TABLE);
    }

    public void insertIntoTableModules(DatabaseConnector databaseConnector) {
        databaseConnector.executeUpdate(INSERT_INTO_MODULE_TABLE);
    }

    public void insertIntoTableRegistrations(DatabaseConnector databaseConnector) {
        databaseConnector.executeUpdate(INSERT_INTO_REGISTRATION_TABLE);
    }
}
