/**
 * Make a bell sound in the terminal!
 */
public class BellSound {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Make a bell sound (🔔 turn your volume up!) by sending the ASCII code identified by the number 7 to the terminal");

        {
            System.out.println("Once!");
            System.out.write(7);
            System.out.flush();
            Thread.sleep(800);
        }

        {
            // This is the same thing. Binary is rarely used in Java source code, but if you are doing something low-level
            // toying with ASCII and using a visual aid like this ASCII table (https://en.wikipedia.org/wiki/ASCII#/media/File:USASCII_code_chart.png)
            // which has binary values on the X and Y axes, then it can be educational to use binary.
            System.out.println("Twice!");
            System.out.write(0b00000111);
            System.out.flush();
            Thread.sleep(800);
        }

        {
            // This is the same thing. Hexadecimal values are often used in source code to express terminal control
            // characters.
            System.out.println("A third time!");
            System.out.write(0x7);
            System.out.flush();
            Thread.sleep(800);
        }

        {
            // This is the same thing. Unicode values are often used in source code to express terminal control
            // characters.
            System.out.println("A fourth time!");
            System.out.write('\u0007');
            System.out.flush();
            Thread.sleep(800);
        }

        {
            // This is the same thing. Unicode characters can be conveniently expressed in string constants in Java code.
            System.out.println("\u0007A fifth and final bell!");
        }

        System.out.println("This code is known as a 'control character', as are all codes in the decimal range 0-31. Read more about control characters on Wikipedia: https://en.wikipedia.org/wiki/ASCII#Control_characters");
    }
}
