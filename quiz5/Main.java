
import java.io.IOException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {
        Read r = new Read();
        Write w = new Write();
        r.reading(args[0]);
        ArrayList<String> arr = Read.decimalArray;
        for (String decimal :arr){
            Stack stack = new Stack();
            int intDecimal = Integer.parseInt(decimal);
            if (intDecimal == 0) {
                stack.push(0);
            }
            while (intDecimal > 0) {
                int digit = intDecimal % 8;
                stack.push(digit);
                intDecimal = intDecimal / 8;
            }
            boolean boo = true;
            if(arr.indexOf(decimal)== arr.size()-1){
                boo = false;
            }
            w.writing(stack,boo);
        }
    }
}
