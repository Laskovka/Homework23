package practice.slide31;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBReader {
    private static final String SELECT_BY_ID = "" +
            "SELECT student.first_name, student.last_name, module.module_title, registration.result " +
            "FROM student " +
            "INNER JOIN " +
            "registration ON student.student_id = registration.student_id " +
            "INNER JOIN " +
            "module ON module.module_id = registration.module_id " +
            "WHERE student.student_id = ";
    public void selectInformation(DatabaseConnector databaseConnector, int value) {
        try {
            System.out.println(databaseConnector.executeQuery(SELECT_BY_ID + value).next());
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
