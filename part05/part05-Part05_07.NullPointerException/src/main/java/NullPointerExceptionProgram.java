
import java.util.ArrayList;

public class NullPointerExceptionProgram {

    public static void main(String[] args) {
        // Implement a program, or modify a program so, that it causes 
        // the NullPointerException -error

        ArrayList<String> lines = null;

        int index = 0;
        while (index < lines.size()) {
            System.out.println(lines.get(index));
            index++;
        } 

    }
}
