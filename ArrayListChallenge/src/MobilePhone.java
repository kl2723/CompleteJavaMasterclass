import java.util.ArrayList;
public class MobilePhone{

    private ArrayList<Contacts> contacts;

    public MobilePhone(){
        this.contacts=new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts newContact){
        if(findContact(newContact.getName())>=0){
            System.out.println("Contact already exists");
            return false;
        }
        contacts.add(newContact);
        return true;
    }

    private int findContact(Contacts contact){
        return contacts.indexOf(contact);
    }

    public int findContact(String contactName) {
        for (int i =0; i<this.contacts.size(); i++) {
            Contacts contact = this.contacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }


    public boolean removeContact(Contacts contact){
        int foundPosition=findContact(contact);
        if(foundPosition<0){
            System.out.println(contact.getName()+" was not found");
            return false;
        }
        this.contacts.remove(foundPosition);
        System.out.println(contact.getName()+ " was deleted");
        return true;
    }


    public ArrayList<Contacts> getContacts() {
        return contacts;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int foundPosition=findContact(oldContact);
        if(foundPosition<0){
            System.out.println(oldContact.getName()+ " was not found.");
            return false;
        }else{
            contacts.set(foundPosition, newContact);
            System.out.println(oldContact.getName()+" was replaced with "+newContact.getName());
        }
        return true;
    }


    public String queryContact(Contacts contact){
        if(findContact(contact)>=0){
            return contact.getName(); }
        return null;
    }

    public Contacts queryContact(String name){
        int position=findContact(name);
        if(position>=0){
            return this.contacts.get(position);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List");
        for(int i=0; i<this.contacts.size(); i++){
            System.out.println((i+1)+"."+
                    this.contacts.get(i).getName()+ " ->"+
                    this.contacts.get(i).getPhoneNumber());
        }
    }

}