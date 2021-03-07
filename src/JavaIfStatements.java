public class JavaIfStatements {
  public static void main(String[] args) {
    int temp = 30;
    if (temp > 30) {
      System.out.println("Its a Hot Day");
      System.out.println("Drink Water");
    } else if (temp > 85 && temp >= 65) {
      System.out.println("Beautiful weather we are having");
      System.out.println("Make sure and enjoy it");
    // best practice to add extra braces for more than one statement
  } else {
    System.out.println("Guess you better pack your coats, its a cold day");
  }
}
}


// If temp is hotter than 80
//Its a hot day, Drink Plenty of Water
//Otherwise it its between 79 and 65, its a nice day.
//Otherwise, its cold.
