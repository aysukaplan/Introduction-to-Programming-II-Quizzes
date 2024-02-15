import java.util.ArrayList;
import java.util.Arrays;

public class PersonalTrainer extends Person {

    public Member[] members;

    public String sportType;

    public PersonalTrainer(int id, String name, String surname, String sportType) {
        super(id, name, surname);
        this.sportType = sportType;
        this.members = new Member[]{};
    }

    // adds members to the specified PT
    public void addMember(Member member) {
        ArrayList<Member> arrlist = new ArrayList<Member>(Arrays.asList(this.members));

        // Add the new element
        arrlist.add(member);

        // Convert the Arraylist to array
        this.members = arrlist.toArray(this.members);

    }

    //Returns the fattest member PT has.
    public Member ReturnFattestMember() {
        Member mb1 = null;
        ArrayList<Member> arrlist = new ArrayList<Member>(Arrays.asList(this.members));
        double maxWeight = 0.0;
        for(Member mb : arrlist){
            if(mb.getWeight()>maxWeight){
                maxWeight = mb.getWeight();
                mb1=mb;
            }
        }
        return mb1;
    }

    //returns Member instance.
    public Member returnMember(int memberId) {
        Member mb1 = null;
        ArrayList<Member> arrlist = new ArrayList<Member>(Arrays.asList(this.members));
        for(Member mb : arrlist){
            if(mb.Id == (memberId)){
                mb1 = mb;
            }
        }
        return mb1;
    }

    //returns the count of specified PT’s members
    public int returnCountofMembers() {
        ArrayList<Member> arrlist = new ArrayList<Member>(Arrays.asList(this.members));
        return  arrlist.size();
    }
}
