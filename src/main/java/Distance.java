import static input.InputUtils.doubleInput;

/**
 * Created by vq4988nx on 1/18/2018.
 */
public class Distance {
    public static void main(String[] args) {

        double dist = doubleInput("How far away from MCTC do you live? (in miles)");
        if (dist > 10) {
            System.out.println("You live more than 10 miles from MCTC.");
        } else if (dist < 10){
            System.out.println("You live less than 10 miles from MCTC.");
        } else {
            System.out.println("You live exactly 10 miles from MCTC");
        }


    }
}

