public class ReverseString {
    public static void main(String[] args) {
        String original = "DashboardMagic";
        String reversed = reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverse(String input) {
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString();
    }
}