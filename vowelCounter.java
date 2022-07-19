/**
 * @author Jamon, Miles MJ
 * 
 */
import java.util.Scanner;

public class vowelCounter{
   /*
    * This program has  2 modes:
    * [DONE]The first mode is less strict
    * [TBD]The second mode assumes that the string is a pure word or phrase without containing any symbols
    */
  public int first(String str){
    int count = 0;
    for(int i=0; i<str.length(); i++){
      switch(str.toLowerCase().charAt(i)){
        case 'a': case 'e': case 'i': case 'o': case 'u':
          ++count;
          break;
      }
    }
    return count;
  }
  
/*   public int second(String str){
    return -1;
  } */
  public void run(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = sc.nextLine();
    int n = first(s);
    //int n = second(s);
    System.out.println("There are " + n + " vowels in the string \"" + s + "\".");
  }
  public static void main(String[] args){
    vowelCounter app = new vowelCounter();
    app.run();
  }
}