public class TheTernaryOperator {
  public static void main(String[] args) {
    int income = 120_000;
    String className = income > 100_000 ? "First" : "Economy";
  }
}
//pre refactor with Ternary Statement
// int income = 120_000;
//    String className = "Economy";
//    if (income > 1000_000)
//      className = "First";
//    else
//      className = "Economy";
//  }
