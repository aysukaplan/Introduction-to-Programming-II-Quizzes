import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.*;

public class LastNameComparator extends Contact implements Comparable<Contact>{

    public LastNameComparator(String socialSecurityNumber, String firstName, String lastName, String phoneNumber) {
        super(socialSecurityNumber, firstName, lastName, phoneNumber);
    }




    public static ArrayList<Contact> sortedArrayList(ArrayList<Contact> arr){
        ArrayList<Contact> ar = new ArrayList<>();
        ar.addAll(arr);
        Collections.sort(ar, new Comparator<Contact>() {
            @Override
            public int compare(Contact o1, Contact o2) {
                String l1 = o1.getLastName();
                String l2 = o2.getLastName();
                return l1.compareTo(l2);
            }
        });
        return ar;
    }
    @Override
    public int compareTo(Contact o) {
        String l1 = this.getLastName();
        String l2 = o.getLastName();
        return l1.compareTo(l2);
    }
}
