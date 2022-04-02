public class UserRegistration {
    public static void main(String[] args) {
        ValidationOfUserRegistration validationOf = new ValidationOfUserRegistration();
        validationOf.validateFirstName("Sirin");
        validationOf.validateLastName("Shaikh");
        validationOf.validateEmailId("sirinshaikh942@gmail.com");
        validationOf.validateMobileNumber("91 96998080895");
        validationOf.validatePasswordRuleOne("sirin56@)+");
    }

}
