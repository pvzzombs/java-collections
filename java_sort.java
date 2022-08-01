
import java.util.Scanner;

public class java_sort {
  void logo(){
    System.out.println("==========================================");
    System.out.println("       Name           Section    Activity ");
    System.out.println("------------------- ---------- -----------");
    System.out.println(" Miles MJ V. Jamon    CPE-1A     Sorting  ");
    System.out.println("==========================================");
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    java_sort obj = new java_sort();
    obj.logo();

    int[] arr = new int[5];

    System.out.print("Enter 5 numbers: ");

    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }

    // sorting algo
    for(int i=0; i<arr.length; i++){
      for(int j=i+1; j<arr.length; j++){
        if(arr[j] < arr[i]){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }

    System.out.print("The sorted numbers are: ");

    for(int q=0; q<arr.length; q++){
      System.out.print(arr[q]);
      if(q < arr.length-1){
        System.out.print(", ");
      }
    }
    
    System.out.println();

    sc.close();
  }
}
