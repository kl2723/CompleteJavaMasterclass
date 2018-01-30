public class Contacts {

    //this is where new contacts are created.
    //contact name and number.

    private String name, phoneNumber;

    public Contacts(String name, String phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacts createNewContact(String name, String phoneNumber){
        return new Contacts(name, phoneNumber);
    }
}
