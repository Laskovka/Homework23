package practice.slide31;

public class App {
    public static void main(String[] args) {
        DatabaseConnector databaseConnector = new DatabaseConnector();

        /*TableCreator tableCreator = new TableCreator();
        tableCreator.createTableStudents(databaseConnector);
        tableCreator.createTableModules(databaseConnector);
        tableCreator.createTableRegistrations(databaseConnector);
*/
        /*DataInsertion dataInsertion = new DataInsertion();
        dataInsertion.insertIntoTableStudents(databaseConnector);
        dataInsertion.insertIntoTableModules(databaseConnector);
        dataInsertion.insertIntoTableRegistrations(databaseConnector);*/

        DBReader dbReader = new DBReader();
        dbReader.selectInformation(databaseConnector, 1);
    }
}
