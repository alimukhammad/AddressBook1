import java.util.ArrayList;

public class AddressBook{
    private ArrayList<Contact> contacts;
    
    public AddressBook(){
        this.contacts = new ArrayList<Contact>();
    }

    public void addContact(Contact contact){
        this.contacts.add(contact);
    }

    public void removeContact(Contact contact){
        this.contacts.remove(contact);
    }
    public void displayContacts(){
        for(Contact contact :this.contacts){
            System.out.println(contact.toString());
        }
    }
}