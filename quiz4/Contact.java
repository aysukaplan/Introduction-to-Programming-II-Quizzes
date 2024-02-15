import java.io.IOException;
import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Contact implements Comparable<Contact>{
    private String socialSecurityNumber;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(String phoneNumber, String firstName, String lastName, String socialSecurityNumber ) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public static void writeArrayList(ArrayList<Contact> contacts) throws IOException {
        //contacts is the arraylist
        String fileName = "contactsArrayList.txt";
        try (FileWriter writer = new FileWriter(fileName, false);
             BufferedWriter bw = new BufferedWriter(writer)) {
            for (Contact c : contacts) {
                bw.append(c.getPhoneNumber());
                bw.append(" ");
                bw.append(c.getFirstName());
                bw.append(" ");
                bw.append(c.getLastName());
                bw.append(" ");
                bw.append(c.getSocialSecurityNumber());
                bw.append(" ");
                bw.newLine();
            }
        }
    }

    public static void writeArrayListLastName(ArrayList<Contact> contacts) throws IOException {

        ArrayList<Contact> contactsSortedByLastName = LastNameComparator.sortedArrayList(contacts);
        String fileName = "contactsArrayListOrderByLastName.txt";
        try (FileWriter writer = new FileWriter(fileName, false);
             BufferedWriter bw = new BufferedWriter(writer)) {
            for (Contact c : contactsSortedByLastName) {
                bw.append(c.getPhoneNumber());
                bw.append(" ");
                bw.append(c.getFirstName());
                bw.append(" ");
                bw.append(c.getLastName());
                bw.append(" ");
                bw.append(c.getSocialSecurityNumber());
                bw.append(" ");
                bw.newLine();
            }
        }
    }

    public static void writeHashSet(ArrayList<Contact> contacts) throws IOException{
        //Arraylist of the concats to hashset
        HashSet<Contact> hashSet = new HashSet<>(contacts);
        String fileName = "contactsHashSet.txt";
        try (FileWriter writer = new FileWriter(fileName, false);
             BufferedWriter bw = new BufferedWriter(writer)) {
            for (Contact c : hashSet) {
                bw.append(c.getPhoneNumber());
                bw.append(" ");
                bw.append(c.getFirstName());
                bw.append(" ");
                bw.append(c.getLastName());
                bw.append(" ");
                bw.append(c.getSocialSecurityNumber());
                bw.append(" ");
                bw.newLine();
            }
        }
    }

    public static void writeTreeSet(ArrayList<Contact> contacts) throws IOException{

        TreeSet<Contact> treeSet = new TreeSet<>(contacts);

        String fileName = "contactsTreeSet.txt";
        try (FileWriter writer = new FileWriter(fileName, false);
             BufferedWriter bw = new BufferedWriter(writer)) {
            for (Contact c : treeSet) {
                bw.append(c.getPhoneNumber());
                bw.append(" ");
                bw.append(c.getFirstName());
                bw.append(" ");
                bw.append(c.getLastName());
                bw.append(" ");
                bw.append(c.getSocialSecurityNumber());
                bw.append(" ");
                bw.newLine();
            }
        }
    }
    public static void writeTreeSetOrderByLastName(ArrayList<Contact> contacts) throws IOException{

        ArrayList<Contact> contactsSortedByLastName = LastNameComparator.sortedArrayList(contacts);

        //Arraylist of the concats to TREESET
        TreeSet<Contact> treeSet = new TreeSet<>(contactsSortedByLastName);

        String fileName = "contactsTreeSetOrderByLastName.txt";
        try (FileWriter writer = new FileWriter(fileName, false);
             BufferedWriter bw = new BufferedWriter(writer)) {
            for (Contact c : treeSet) {
                bw.append(c.getPhoneNumber());
                bw.append(" ");
                bw.append(c.getFirstName());
                bw.append(" ");
                bw.append(c.getLastName());
                bw.append(" ");
                bw.append(c.getSocialSecurityNumber());
                bw.append(" ");
                bw.newLine();
            }
        }
    }
    public static void writeHashMap(ArrayList<Contact> contacts) throws IOException{
        HashMap<String, Contact> hashMap = new HashMap<>();

        for (Contact c : contacts) {
            hashMap.put(c.getPhoneNumber(), c);
        }
        String fileName = "contactsHashMap.txt";
        try (FileWriter writer = new FileWriter(fileName, false);
             BufferedWriter bw = new BufferedWriter(writer)) {
            for (Map.Entry<String, Contact> entry : hashMap.entrySet()) {
                Contact c = entry.getValue();
                bw.append(c.getPhoneNumber());
                bw.append(" ");
                bw.append(c.getFirstName());
                bw.append(" ");
                bw.append(c.getLastName());
                bw.append(" ");
                bw.append(c.getSocialSecurityNumber());
                bw.append(" ");
                bw.newLine();
            }

        }

    }


    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
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

    public Contact() {
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(Contact o) {

        String l1 = this.getPhoneNumber();
        String l2 = o.getPhoneNumber();
        return l1.compareTo(l2);

    }
}
