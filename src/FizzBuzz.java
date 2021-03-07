import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FizzBuzz {
  public static void main(String[] args) {
    Scanner fizzBuzz = new Scanner(System.in);
    System.out.println("Please Choose a Number : ");
    int number = fizzBuzz.nextInt();

    if (number % 5 == 0 && number % 3 == 0)
      System.out.println("FizzBuzz");
    else if (number % 5 == 0)
      System.out.println("Fizz");
    else if (number % 3 == 0)
      System.out.println("Buzz");
    else
      System.out.println(number);
  }
}

