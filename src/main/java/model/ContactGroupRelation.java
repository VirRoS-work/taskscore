package model;

public class ContactGroupRelation {

    private int id;
    private int idContact;
    private int idContactGroup;

    public ContactGroupRelation(int id, int idContact, int idContactGroup) {
        this.id = id;
        this.idContact = idContact;
        this.idContactGroup = idContactGroup;
    }

    public int getId() {
        return id;
    }

    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    public int getIdContactGroup() {
        return idContactGroup;
    }

    public void setIdContactGroup(int idContactGroup) {
        this.idContactGroup = idContactGroup;
    }
}
