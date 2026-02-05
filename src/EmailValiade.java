public class EmailValiade {

    public static boolean isValidateEmail(String email) {
        String pattern = "\\w+[a-z]*(@gmail\\.com)|\\w+[.\\-#]\\w+[a-z]*(@semicolon\\.africa)";
        return email.matches(pattern);

    }

}
