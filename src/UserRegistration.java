public class UserRegistration {
    public static void main(String[] args) {
        ValidationOfUserRegistration validationOf = new ValidationOfUserRegistration();
       // validationOf.validateFirstName("Sirin");
        //validationOf.validateLastName("Shaikh");
        //validationOf.validateEmailId("sirinshaikh942@gmail.com");
        //validationOf.validateMobileNumber("91 96998080895");
        //validationOf.validatePasswordRuleOne("sirin56@)+");
        System.out.println(validationOf.validatePasswordRuleTwo("sirAnhhjjhg"));
        System.out.println(validationOf.validatePasswordRuleThree("kirAnhhjj1hg"));
        System.out.println(validationOf.validatePasswordRuleFour("sirA@2nhhjj21hg"));
    }

}
