import java.util.Scanner;

/**
 * This class is for validation of User registration
 * Taking user input and checking whether data is in correct format
 */
public class ValidationOfUserRegistration {
    //Scanner class to take the input from the user
    Scanner scanner = new Scanner(System.in);

    /**
     * this method is to check the first name whether its in correct format
     * i.e; minimum 3 characters and first letter should be capital letter
     *
     * @param firstName
     */
    public void validateFirstName(String firstName) {
        String regex = "^[A-Z][a-z]{2,}$";
        System.out.println(firstName.matches(regex));
    }

    /**
     * this method is to check whether the last name entered is correct
     * i.e; minimum 3 characters and first should be in caps
     *
     * @param lastName
     */
    public void validateLastName(String lastName) {
        String regex = "^[A-Z][a-z]{2,}$";
        System.out.println(lastName.matches(regex));

    }

    /**
     * this method is to check whether the emailId is in correct format
     *
     * @param emailId
     */
    public void validateEmailId(String emailId) {
        String regex = "^[A-Za-z0-9-+._]+@[a-z0-9]+(.[a-z]{2,3})+$";
        System.out.println(emailId.matches(regex));
    }

    /**
     * this method is to validate MobileNumber by country code space ten-digit number
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
    public boolean validatePasswordRuleOne(String password) {
        String regex = "^[A-Za-z0-9.-_@#$%&^*()+:?]{8,}$";
        return (password.matches(regex));
    }

    public boolean validatePasswordRuleTwo(String password) {
        String regex = "^(?=.*[A-Z])[A-Za-z0-9._@#$%&^*()+:?]{8,}$";
        return (password.matches(regex));
    }

    public boolean validatePasswordRuleThree(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9._@#$%&^*()+:?]{8,}$";
        return (password.matches(regex));
    }
    public boolean validatePasswordRuleFour(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[._@#$%&^*()+:?])[A-Za-z0-9._@#$%&^*()+:?]{8,}$";
        return (password.matches(regex));
    }
}