package ax.ha.it;

public class StringProcessor {
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return true;
        }
        String formattedInput = input.replaceAll("\\s+", "").toLowerCase();
        return formattedInput.equals(new StringBuilder(formattedInput).reverse().toString());
    }

}
