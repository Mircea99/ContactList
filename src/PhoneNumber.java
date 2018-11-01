public class PhoneNumber implements Comparable<PhoneNumber>{

    private String prefix;
    private String number;

    public PhoneNumber(String prefix, String number) {
        this.prefix = prefix;
        this.number = number;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "prefix='" + prefix + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public int compareTo(PhoneNumber o) {
        int number = o.number.compareTo(getNumber());
        if (number != 0) {
            return number;
        }

        int prefix = o.number.compareTo(getPrefix());
        if (prefix != 0) {
            return prefix;
        }


        return prefix + number;
    }
}
