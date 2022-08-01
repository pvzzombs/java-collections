//package jamon_bb_peso_denom;


import java.util.Scanner;
/**
 *
 * @author student
 */
public class Jamon_BB_peso_denom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] denom = {1000, 500, 200, 100, 50, 20, 10, 5, 1};
        int[] counts = new int[denom.length]; 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter amount: ");
        int money = sc.nextInt();
        for(int i=0; i<denom.length; i++){
            while(money >= denom[i]){
                money -= denom[i]; // money = money - denom[i];
                counts[i]++;
            }
        }
        
        for(int i=0; i<denom.length; i++){
            if(counts[i] > 0){
                System.out.println(counts[i] + " * " + denom[i]);
            }
        }
        
    }
    
}
