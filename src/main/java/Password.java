import static input.InputUtils.stringInput;

/**
 * Created by vq4988nx on 1/18/2018.
 */
public class Password {
    public static void main(String[] args) {
        String userPassword = stringInput("Enter the password");

        if (userPassword.equals("qwerty")) {
            System.out.println("Welcome, authorized user");

        } else {
            System.out.println("Access denied!");
        }

    }
}
