public class ForLoops {
  public static void main (String[]args){
    //System.out.println("Hello World"); // lets print it 5 times using a loop.
   // for(int i = 0; i < 5; i++) //i is less than five -> then increment by 1
      for(int i = 1; i <= 5; i++) //gets rid of the 0 index positions by setting to 1
        System.out.println("Hello World " + i);
      // the initialize number is where it starts like (5) 5 4 3 2 1
    for(int i = 5; i > 0; i--) //gets rid of the 0 index positions by setting to 1
      System.out.println("Hello World Reverse Order " + i);
  }
}
// if here is more than one statement then define another code block using {}
//1) initialize the loop with i = 0
//2) is this condition true ex: i < 5, if it is true because here i = 0 execute code
//3) if you add "+ i  it will concat Hello World i    i=number
