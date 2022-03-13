/**
 * Print some stylized text.
 *
 * Read about Java's support for embedding octal and unicode into string literals: https://stackoverflow.com/a/9543611
 */
public class StylizedText {
    public static void main(String[] args) {
        System.out.println("\033[0;31mThis is red text"); // "\033" is an octal number for 27 (the ASCII code for 'ESC')
        System.out.println("\u001B[0;31mThis is red text"); // "\u001B" is unicode. It includes the hexadecimal value for 27 (the ASCII code for 'ESC')
        System.out.println("\033[0mThis is normal text");
    }
}
