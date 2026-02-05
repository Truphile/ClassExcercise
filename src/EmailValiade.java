public class EmailValiade {

    public static boolean isValidateEmail(String email) {
        String pattern = "\\w+[a-z]*(@gmail\\.com)";
        return email.matches(pattern);

    }

}
