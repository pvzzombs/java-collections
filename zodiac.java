package zodiac;

import java.util.Scanner;

public class zodiac {
    
    public String figureZodiac(int month, int day){
        switch(month){
            case 1:
                if(day < 20){
                    return "Capricornus";
                }else{
                    return "Aquarius";
                }
            case 2:
                if(day < 19){
                    return "Aquarius";
                }else{
                    return "Pisces";
                }
            case 3:
                if(day < 21){
                    return "Pisces";
                }else{
                    return "Aries";
                }
            case 4:
                if(day < 20){
                    return "Aries";
                }else{
                    return "Taurus";
                }
            case 5:
                if(day < 21){
                    return "Taurus";
                }else{
                    return "Gemini";
                }
            case 6:
                if(day < 22){
                    return "Gemini";
                }else{
                    return "Cancer";
                }
            case 7:
                if(day < 23){
                    return "Cancer";
                }else{
                    return "Leo";
                }
            case 8:
                if(day < 23){
                    return "Leo";
                }else{
                    return "Virgo";
                }
            case 9:
                if(day < 23){
                    return "Virgo";
                }else{
                    return "Libra";
                }
            case 10:
                if(day < 24){
                    return "Libra";
                }else{
                    return "Scorpius";
                }
            case 11:
                if(day < 22){
                    return "Scorpius";
                }else{
                    return "Sagittarius";
                }
            case 12:
                if(day < 22){
                    return "Sagittarius";
                }else{
                    return "Capricornus";
                }
        }
        return "Error";
    }
    
    public boolean checkIfValid(int month, int day){
        if(month < 1 || month > 12){
            return false;
        }
        if(day < 1 || day > 31){
            return false;
        }
        switch(month){
            case 2:
                if(day > 29){
                    return false;
                }else{
                    return true;
                }
            case 4: case 6: case  9: case 11:
                if(day > 30){
                    return false;
                }else{
                    return true;
                }
        }
        return true;
    }

    public boolean quit(Scanner sc){
        String temp;
        while(true){
            System.out.print("Do you want to continue? [y/n]");
            temp = sc.nextLine().toLowerCase().trim();
            if(temp.length() > 1 || temp.length() < 1){
                System.out.println("[ERROR] Invalid choice");
                continue;
            }
            if(temp.charAt(0) != 'y' && temp.charAt(0) != 'n'){
                System.out.println("[ERROR] Invalid choice");
                continue;
            }
            
            
            return temp.charAt(0) == 'n';
        }
    }

    public void run(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("January = 1");
            System.out.println("February = 2");
            System.out.println("March = 3");
            System.out.println("April = 4");
            System.out.println("May = 5");
            System.out.println("June = 6");
            System.out.println("July = 7");
            System.out.println("August = 8");
            System.out.println("September = 9");
            System.out.println("October = 10");
            System.out.println("November = 11");
            System.out.println("December = 12");

            System.out.println("Enter Month :");
            int month = Integer.valueOf(sc.nextLine());
            System.out.println("Enter Day : ");
            int day = Integer.valueOf(sc.nextLine());
            
            if(!checkIfValid(month, day)){
                System.out.println("[ERROR] Invalid date.");
                continue;
            }

            System.out.println("The zodiac sign is " + figureZodiac(month, day));
            
            if(quit(sc)){
                break;
            }
        }
    }

    public static void main(String[] args) {
        zodiac app = new zodiac();
        app.run();
    }
}
