package homework.slide34.entities;

public class Category {
    private long id_category;
    private String name;

    public Category(long id_category, String name) {
        this.id_category = id_category;
        this.name = name;
    }

    public Category(long id_category) {
        this.id_category = id_category;
    }

    public Category() {
    }

    public long getId_category() {
        return id_category;
    }

    public void setId_category(long id_category) {
        this.id_category = id_category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
