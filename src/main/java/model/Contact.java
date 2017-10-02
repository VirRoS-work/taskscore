package model;

public class Contact {

    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(int id, String firstName, String lastName, String foneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = foneNumber;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFoneNumber() {
        return phoneNumber;
    }

    public void setFoneNumber(String foneNumber) {
        this.phoneNumber = foneNumber;
    }
}
