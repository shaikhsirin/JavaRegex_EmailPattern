import java.util.ArrayList;

public class UserRegistration {
    public static void main(String[] args) {
        ArrayList<String> email = new ArrayList<>();
        UserInputOfEmails emails = new UserInputOfEmails();
        ValidationOfUserRegistration validationOf = new ValidationOfUserRegistration();
//      validationOf.validateFirstName("Kiran");
//      validationOf.validateLastName("Kumar");
//      validationOf.validateEmailId("makamkiran95@gmail.com");
//      validationOf.validateMobileNumber("91 9666069291");
//      validationOf.validatePasswordRuleOne("kiran56@)+");
//      System.out.println(validationOf.validatePasswordRuleFour("kirA@2nhhjj21hg"));
        email = emails.userDataOfEmails();
        for(String e : email){
            validationOf.validateEmailId(e);
        }
    }
}

