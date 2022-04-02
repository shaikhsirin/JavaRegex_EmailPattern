import java.util.ArrayList;
public class UserInputOfEmails {
    ArrayList<String> list = new ArrayList<>();
    public ArrayList<String> userDataOfEmails() {
        list.add("abc@yahoo.com");
        list.add("abc-100@yahoo.com");
        list.add("abc.100@yahoo.com");
        list.add("abc111@abc.com");
        list.add("abc.100@yahoo.com.au");
        list.add("abc-100@yahoo.net");
        list.add("abc@1.com");
        list.add("abc@yahoo.com.com");
        list.add("abc+100@gmail.com");
        return list;

    }
}
