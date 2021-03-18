import java.util.Scanner;
public class DoWhile {
  public static void main(String[] args) {
    String input = " ";
    while (!input.equals("quit")) {
      System.out.println("Input: "); {
        Scanner scanner = new Scanner(System.in);
        input = scanner.next().toLowerCase(); //because we dont know if the user is going to input lower cases or upper cases.
        System.out.println(input);
      }
//      do {
//        System.out.println("Input: ");
//        input = scanner.next().toLowerCase();
//        System.out.println(input);
//      } while (!input.equals("quit"));
    }}}

