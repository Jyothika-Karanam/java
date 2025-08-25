public class CreativeGreeting {
    public static void main(String[] args) {
        // ANSI escape codes for color
        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String BLUE = "\u001B[34m";
        final String RESET = "\u001B[0m";

        // Your creative message
        System.out.println(GREEN + "🌟 Welcome, Jyothika! 🌟" + RESET);
        System.out.println(BLUE + "You're on a mission to make web dev unforgettable." + RESET);
        System.out.println(RED + "Keep coding, keep shining, and never stop creating!" + RESET);
    }
}