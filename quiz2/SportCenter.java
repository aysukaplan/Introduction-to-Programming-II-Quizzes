import java.util.ArrayList;
import java.util.Arrays;

public class SportCenter {
    public PersonalTrainer[] PTs;

    private String name;

    public SportCenter(String name) {
        this.name = name;
        this.PTs = new PersonalTrainer[]{};
    }

    public void addPT(PersonalTrainer pt) {
        ArrayList<PersonalTrainer> arrlist = new ArrayList<PersonalTrainer>(Arrays.asList(this.PTs));

        // Add the new element
        arrlist.add(pt);

        // Convert the Arraylist to array
        this.PTs = arrlist.toArray(this.PTs);
    }


    // returns an instance of type ”PersonalTrainer”
    public PersonalTrainer searchPT(String name, String surname) {
        PersonalTrainer pt1 = null;
        ArrayList<PersonalTrainer> arrlist = new ArrayList<PersonalTrainer>(Arrays.asList(this.PTs));
        for(PersonalTrainer pt : arrlist){
            if(pt.name.equals(name)& pt.surname.equals(surname)){
                pt1 = pt;
            }
        }
        return pt1;
    }
}
