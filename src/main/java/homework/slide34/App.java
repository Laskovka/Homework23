package homework.slide34;

import homework.slide34.dao.CategoryDao;
import homework.slide34.dao.OrderDao;
import homework.slide34.dao.ProductDao;
import homework.slide34.dao.UserDao;
import homework.slide34.databaseSettings.*;
import homework.slide34.entities.Category;
import homework.slide34.entities.Order;
import homework.slide34.entities.Product;
import homework.slide34.entities.User;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        DatabaseConnector databaseConnector = new DatabaseConnector();

        /*CreateTableCategories.createTableCategories(databaseConnector);
        CreateTableProducts.createTableProducts(databaseConnector);
        CreateTableUsers.createTableUsers(databaseConnector);
        CreateTableOrders.createTableOrders(databaseConnector);*/

        /*Category category = new Category(1);
        Product product = new Product("Cherry", category, 6545.42);
        ProductDao productDao = new ProductDao();
        productDao.insertProduct(databaseConnector, product);
        productDao.insertProduct(databaseConnector, product);
        productDao.insertProduct(databaseConnector, product);
        Product product1 = new Product("Apples", category, 6545.42);
        productDao.updateProduct(databaseConnector, product, product1);*/

        /*User user1 = new User("Alexander1", "Laskovskyi1", "pr1", "laskovskiu2017@gmail.com1", "+3809751045131");
        User user2 = new User("Alexander2", "Laskovskyi2", "pr2", "laskovskiu2017@gmail.com2", "+3809751045132");
        User user3 = new User("Alexander3", "Laskovskyi3", "pr3", "laskovskiu2017@gmail.com3", "+3809751045133");
        User user4 = new User("Alexander4", "Laskovskyi4", "pr4", "laskovskiu2017@gmail.com4", "+3809751045134");
        User user5 = new User("Alexander5", "Laskovskyi5", "pr5", "laskovskiu2017@gmail.com5", "+3809751045135");
        User user6 = new User("Alexander6", "Laskovskyi6", "pr6", "laskovskiu2017@gmail.com6", "+3809751045136");
        User user7 = new User("Alexander7", "Laskovskyi7", "pr7", "laskovskiu2017@gmail.com7", "+3809751045137");
        User user8 = new User("Alexander8", "Laskovskyi8", "pr8", "laskovskiu2017@gmail.com8", "+3809751045138");
        User user9 = new User("Alexander9", "Laskovskyi9", "pr9", "laskovskiu2017@gmail.com9", "+3809751045139");
        UserDao userDao = new UserDao();
        userDao.insertUser(databaseConnector, user1);
        userDao.insertUser(databaseConnector, user2);
        userDao.insertUser(databaseConnector, user3);
        userDao.insertUser(databaseConnector, user4);
        userDao.insertUser(databaseConnector, user5);
        userDao.insertUser(databaseConnector, user6);
        userDao.insertUser(databaseConnector, user7);
        userDao.insertUser(databaseConnector, user8);
        userDao.insertUser(databaseConnector, user9);
        userDao.deleteUser(databaseConnector, 7);
        userDao.deleteUser(databaseConnector, 5);
        User user10 = new User("Alexander10", "Laskovskyi10", "pr10", "laskovskiu2017@gmail.com10", "+38097510451310");
        userDao.updateUser(databaseConnector, user3, user10);*/

        /*Order order1 = new Order(1, 1, 40, "OK", Timestamp.valueOf(LocalDateTime.now()));
        Order order2 = new Order(2, 2, 40, "OK", Timestamp.valueOf(LocalDateTime.now()));
        Order order3 = new Order(3, 3, 40, "OK", Timestamp.valueOf(LocalDateTime.now()));
        Order order4 = new Order(4, 4, 40, "OK", Timestamp.valueOf(LocalDateTime.now()));
        Order order5 = new Order(6, 5, 40, "OK", Timestamp.valueOf(LocalDateTime.now()));
        OrderDao orderDao = new OrderDao();
        orderDao.insertOrder(databaseConnector, order1);
        orderDao.insertOrder(databaseConnector, order2);
        orderDao.insertOrder(databaseConnector, order3);
        orderDao.insertOrder(databaseConnector, order4);
        orderDao.insertOrder(databaseConnector, order5);
        Order order10 = new Order(6, 5, 40, "NOT OK", Timestamp.valueOf(LocalDateTime.now()));
        orderDao.updateOrder(databaseConnector, order3, order10);*/
    }
}
