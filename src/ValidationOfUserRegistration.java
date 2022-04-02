import java.util.Scanner;
/**
 * This class is for validation of User registration
 * Taking user input and checking whether data is in correct format
 */
public class ValidationOfUserRegistration {
    Scanner scanner = new Scanner(System.in);

    public void validateFirstName(String sirin) {
        System.out.println("Enter the First Name");
        String firstName = scanner.next();
        String regex = "^[A-Z][a-z]{2,}$";
        System.out.println(firstName.matches(regex));
    }

    /**
     * this method is to check whether the last name entered is correct ot not
     *
     * @param shaikh
     */
    public void validateLastName(String shaikh) {
        System.out.println("Enter the Last Name");
        String lastName = scanner.next();
        String regex = "^[A-Z][a-z]{2,}$";
        System.out.println(lastName.matches(regex));

    }

    /**
     * this method is to check whether the emailId is in correct format
     *
     * @param s
     */
    public void validateEmailId(String s) {
        System.out.println("Enter the EmailId");
        String emailId = scanner.next();
        String regex = "^[A-Za-z0-9-._]{1,}+@+[a-z]{1,}+.+[a-z]$";
        System.out.println(emailId.matches(regex));
    }

    /**
     * this method is to validate Mobile number
     *
     * @param mobileNumber
     */
    public void validateMobileNumber(String mobileNumber) {
        String regex = "^[0-9]{2}+ +[0-9]{10}$";
        System.out.println(mobileNumber.matches(regex));
    }

    /**
     * this method is to check whether password has 8 or more characters
     *
     * @param password
     */
    public void validatePasswordRuleOne(String password) {
        String regex = "^[A-Za-z0-9.-_@#$%&^*()+:?]{8,}$";
        System.out.println(password.matches(regex));
    }
}