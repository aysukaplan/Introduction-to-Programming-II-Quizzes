import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class Write {
    public void writing(Stack stack, boolean boo)
            throws IOException {
        try (FileWriter writer = new FileWriter("octal.txt", true);
             BufferedWriter bw = new BufferedWriter(writer)) {
            String s = "";
            while (!stack.isEmpty()) {
                s = s + stack.top();
                stack.pop();
            }
            bw.append(s);
            if(boo){
                bw.newLine();
            }
        }
        }
    }

