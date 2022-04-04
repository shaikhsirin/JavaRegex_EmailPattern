import java.util.ArrayList;

public class UserRegistration {
    public static void main(String[] args) {
        ArrayList<String> email = new ArrayList<>();
        UserInputOfEmails emails = new UserInputOfEmails();
        ValidationOfUserRegistration validationOf = new ValidationOfUserRegistration();
//      validationOf.validateFirstName("Sirin");
//      validationOf.validateLastName("Shaikh");
//      validationOf.validateEmailId("sirinshaikh942@gmail.com");
//      validationOf.validateMobileNumber("91 9699808095");
//      validationOf.validatePasswordRuleOne("sirin56@)+");
//      System.out.println(validationOf.validatePasswordRuleFour("sirA@2nhhjj21hg"));
        email = emails.userDataOfEmails();
        for(String e : email){
            validationOf.validateEmailId(e);
        }
    }
}

