public class RegexProcessor {

    public static boolean isPhoneNumberValid(String phoneNumber) {
       String pattern = "(070\\d{8})";
        return phoneNumber.matches(pattern);
    }
}
