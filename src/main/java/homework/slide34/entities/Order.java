package homework.slide34.entities;

import java.sql.Timestamp;

public class Order {
    private long id_order;
    private long id_user;
    private long id_product;
    private long count;
    private String status;
    private Timestamp date_of_create;

    public Order(long id_order, long id_user, long id_product, long count, String status, Timestamp date_of_create) {
        this.id_order = id_order;
        this.id_user = id_user;
        this.id_product = id_product;
        this.count = count;
        this.status = status;
        this.date_of_create = date_of_create;
    }

    public Order() {
    }

    public Order(long id_user, long id_product, long count, String status, Timestamp date_of_create) {
        this.id_user = id_user;
        this.id_product = id_product;
        this.count = count;
        this.status = status;
        this.date_of_create = date_of_create;
    }

    public long getId_order() {
        return id_order;
    }

    public void setId_order(long id_order) {
        this.id_order = id_order;
    }

    public long getId_user() {
        return id_user;
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public long getId_product() {
        return id_product;
    }

    public void setId_product(long id_product) {
        this.id_product = id_product;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getDate_of_create() {
        return date_of_create;
    }

    public void setDate_of_create(Timestamp date_of_create) {
        this.date_of_create = date_of_create;
    }
}
