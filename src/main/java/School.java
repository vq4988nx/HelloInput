import static input.InputUtils.stringInput;

/**
 * Created by vq4988nx on 1/18/2018.
 */
public class School {
    public static void main(String[] args) {
        String college = stringInput("Which college do you attend?");

        if (college.equals("MCTC")) {
            System.out.println("Good Choice, MCTC!");
        } else {
            System.out.println("That's too bad.  You should go to MCTC");
        }
    }
}
