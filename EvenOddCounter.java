/**
 * @author Jamon, Miles MJ
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;

public class EvenOddCounter{
  public void run(){
    Scanner sc = new Scanner(System.in);
    //int[] numbers = new int[10];
    ArrayList<Integer> odds = new ArrayList<Integer>();
    ArrayList<Integer> evens = new ArrayList<Integer>();
    int el, ol;
    System.out.println("[QUESTION] Enter 10 numbers: ");
    for(int i=0; i<10; i++){
      int temp = 0;
      boolean flag = false;
      while(!flag){
        try{
          temp = sc.nextInt();
          flag = true;
        }catch(Exception e){
          System.out.println("[ERROR] I expect a valid integer :(");
          sc.nextLine();
        }
      }
      if(temp % 2 == 0){
        //even
        evens.add(temp);
      }else{
        //odd
        odds.add(temp);
      }
    }
    
    el = evens.size();
    ol = odds.size();
    System.out.println();
    if(el > 0){
      System.out.println("There " + (el == 1 ? "is " : "are ") + el + " even " + (el == 1 ? "number." : "numbers."));
      System.out.print("The even " + (el == 1 ? "number" : "numbers") + (el == 1 ? " is: " : " are: "));
      for(int i=0; i<el; i++){
        System.out.print(evens.get(i));
        if(i < el-1){
          System.out.print(", ");
        }
      }
      System.out.println();
    }else{
      System.out.println("There are no even numbers in the given list.");
    }

    if(ol > 0){
      System.out.println("There " + (ol == 1 ? "is " : "are ") + ol + " odd " + (ol == 1 ? "number." : "numbers."));
      System.out.print("The odd " + (ol == 1 ? "number" : "numbers") + (ol == 1 ? " is: " : " are: "));
      for(int i=0; i<ol; i++){
        System.out.print(odds.get(i));
        if(i < ol-1){
          System.out.print(", ");
        }
      }
      System.out.println();
    }else{
      System.out.println("There are no odd numbers in the given list.");
    }
    
  }
  
  public static void main(String[] args){
    EvenOddCounter app = new EvenOddCounter();
    app.run();
  }
}