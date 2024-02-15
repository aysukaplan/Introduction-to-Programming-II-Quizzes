import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        //reading from the file
        ArrayList<String> contactsLines = FileRead.readFile(args[0]);

        //creasting a contacts list consisits of contact objects
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        for(String line:contactsLines){
            String[] sepTab = line.split(" ");
            Contact c = new Contact(sepTab[0],sepTab[1],sepTab[2],sepTab[3]);
            contacts.add(c);
        }
        Contact.writeArrayList(contacts);
        Contact.writeArrayListLastName(contacts);
        Contact.writeHashSet(contacts);
        Contact.writeTreeSet(contacts);
        Contact.writeTreeSetOrderByLastName(contacts);
        Contact.writeHashMap(contacts);

    }
}