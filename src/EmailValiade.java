public class EmailValiade {

    public static boolean isValidateEmail(String email) {
        String pattern = "\\w+(@gmail\\.com)|\\w+[.\\-#]\\w+(@semicolon\\.africa)";
        return email.matches(pattern);

    }

}
