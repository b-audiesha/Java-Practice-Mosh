import java.util.Scanner;

public class WhileLoops {
  public static void main(String[] args) {
    String input = " ";
    while (!input.equals("quit")) {
      System.out.println("Input: "); {
        Scanner scanner = new Scanner(System.in);
        input = scanner.next().toLowerCase(); //because we dont know if the user is going to input lower cases or upper cases.
      }
    }}}

// using a for loop if you know how many times you want to repeat something, use a while loop if your not sure how many times you are going to enter something.
//create scanner outside of the while loop
