public class ColorfulGreeting {
    // ANSI escape codes for colors
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";

    public static void main(String[] args) {
        System.out.println(RED + "Hello," + RESET);
        System.out.println(GREEN + "Jyothika!" + RESET);
        System.out.println(BLUE + "Welcome to the world of Java." + RESET);
        System.out.println(PURPLE + "Keep coding with creativity!" + RESET);
    }
}