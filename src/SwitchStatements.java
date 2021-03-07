public class SwitchStatements {
  public static void main(String[] args){
    int position = 1;
    switch(position) {
      case 1:
        System.out.println("You are currently in position one");
        break;

      case 2:
      System.out.println("You are currently in position two");

      default:
        System.out.println("Your are currently on hold for the next available representative");
        break;
    }
  }
}
