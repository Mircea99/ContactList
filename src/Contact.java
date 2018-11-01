public class Contact implements Comparable<Contact> {

    private String firstName;
    private String lastName;
    private PhoneNumber number;

    public Contact(String firstName, String lastName, PhoneNumber number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public PhoneNumber getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (firstName != null ? !firstName.equals(contact.firstName) : contact.firstName != null) return false;
        if (lastName != null ? !lastName.equals(contact.lastName) : contact.lastName != null) return false;
        return number != null ? number.equals(contact.number) : contact.number == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {

        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number=" + number +
                '}';
    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }

//    @Override
//    public int compareTo(Contact contact) {
//
//        int first = contact.firstName.compareTo(firstName);
//        int last = contact.lastName.compareTo(lastName);
//
//        if (first == 0) {
//            return first;
//        }
//        if(last == 0) {
//            return last;
//        }
//        return first + last;
//    }

    @Override
    public int compareTo(Contact o) {
        int first = o.firstName.compareTo(firstName);


        if (first != 0) {
            return first;
        }

        int last = o.lastName.compareTo(lastName);
        if (last != 0) {
            return last;
        }


        return first + last;
    }


}
