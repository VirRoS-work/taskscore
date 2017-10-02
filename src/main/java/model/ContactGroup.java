package model;

public class ContactGroup {

    private int Id;
    private String title;
    private String description;

    public ContactGroup(int id, String title, String description) {
        Id = id;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return Id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
