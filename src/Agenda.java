import java.util.*;
import java.util.stream.Collectors;

public class Agenda {

    Scanner scan = new Scanner(System.in);
    Map<String, ContactGroup> agenda = new TreeMap<>();


// metoda care sa verifice daca exista contactGroup pentru contactul pe care vrem sa il adaugam
//metoda sa adaugam contactul la contactGroup

    private void addContacts() {
        Contact contact = createContact();
        String firstLetter = contact.getLastName().substring(0, 1);
        ContactGroup contactGroup = agenda.get(firstLetter);
        if (contactGroup == null) {
            contactGroup = new ContactGroup();
            agenda.put(firstLetter, contactGroup);
            contactGroup.add(contact);
        }

        contactGroup.add(contact);

    }

    private Contact createContact() {
        System.out.println("Enter first name : ");
        String firstName = scan.next();

        System.out.println("Enter last name : ");
        String lastName = scan.next();

        System.out.println("Enter phone number : ");
        String num = scan.next();

        Contact contact = new Contact(firstName, lastName, new PhoneNumber("+040", num));

        return contact;

    }

    public void showMenu() {
        System.out.println("Agenda functions :");
        System.out.println("1.Show Contacts");
        System.out.println("2.Add Contact");
        System.out.println("3.Remove Contact");
        System.out.println("4.Search Contact ");
        System.out.println("5.Edit Contact");

        readMenuAnswer();
    }

    public void readMenuAnswer() {
        System.out.println("Please input your answer");
        int answer = scan.nextInt();

        menuChoice(answer);
    }

    public void menuChoice(int i) {

        switch (i) {

            case 1:
                printAgenda();
                showPrevoiusMenu();
                break;

            case 2:
                addContacts();
                showPrevoiusMenu();
                break;

            case 3:
                removeContact();
                showPrevoiusMenu();
                break;

            case 4:


                break;

            case 5:


                break;

        }

    }


    private void printAgenda() {
        System.out.println(agenda.entrySet()
                .stream()
                .map(e -> e.getKey() + "=\"" + e.getValue() + "\"")
                .collect(Collectors.joining(", ")));

    }

    public void showPrevoiusMenu() {
        System.out.println(" ");
        System.out.println("2. Back to menu ? Press 2.");
        int ans = scan.nextInt();
        if (ans == 2) {
            showMenu();
        }
    }


    private void removeContact() {
        Contact contactToRemove = createContact();
        String firstLetter = contactToRemove.getLastName().substring(0, 1);
        ContactGroup contactGroup = agenda.get(firstLetter);
        contactGroup.remove(contactToRemove);

    }

    private void searchContact(){
        Contact contactToSearch = createContact();
        String firstLetter = contactToSearch.getLastName().substring(0, 1);
        ContactGroup contactGroup = agenda.get(firstLetter);


    }

}
