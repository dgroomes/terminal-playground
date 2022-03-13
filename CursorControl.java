/**
 * Control the cursor.
 * <p>
 * For example, clear the line and move the cursor to the beginning of the line.
 * <p>
 * See https://en.wikipedia.org/wiki/ANSI_escape_code#CSI_(Control_Sequence_Introducer)_sequences
 */
public class CursorControl {

  public static void main(String[] args) throws InterruptedException {

    {
      System.out.print("Hello!");
    }

    {
      Thread.sleep(1000);
      System.out.print("\u001B[1;K");
      System.out.print("\u001B[1;G");
      System.out.print("Hello again!");
    }

    {
      Thread.sleep(1000);
      System.out.print("\u001B[1;K");
      System.out.print("\u001B[1;G");
      System.out.println("Goodbye!");
    }
  }
}
