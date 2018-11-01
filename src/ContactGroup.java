import java.util.Set;
import java.util.TreeSet;

public class ContactGroup {

    private Set<Contact> contacts = new TreeSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactGroup that = (ContactGroup) o;

        return contacts != null ? contacts.equals(that.contacts) : that.contacts == null;
    }

    @Override
    public int hashCode() {
        return contacts != null ? contacts.hashCode() : 0;
    }


    public void add(Contact contact) {
        contacts.add(contact);
    }

    public void remove(Contact contact) {
        contacts.remove(contact);
    }

//    private TreeSet<Contact> linkContact(Contact contact){
//        for(Contact c : contacts){
//            if(c.getLastName().startsWith())
//        }
//    }

    @Override
    public String toString() {
        return "ContactGroup{" +
                "contacts=" + contacts +
                '}';
    }
}
