import java.util.Scanner;

public class BreakContinue {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = "";
    while (!input.equals("quit")) {
      System.out.println("Input: ");
      input = scanner.next().toLowerCase();
      if (input.equals("quit"))
        break;
      System.out.println(input); // If the user types "quit " then break out of the loop, if they do not break out of the loop then  nothing is printed if you
      //type a number, it will output the input.
    }
  }
}

