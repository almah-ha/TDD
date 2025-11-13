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

    public String compress(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                result.append(chars[i - 1]).append(count);
                count = 1;
            }
        }

        result.append(chars[chars.length - 1]).append(count);
        return result.toString();
    }
}
