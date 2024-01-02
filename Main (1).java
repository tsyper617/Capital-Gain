import java.util.*;
import java.util.Scanner; 


public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in); 
      int q = 10;
      int option; 
      int day = 1;

      Queue newq = new Queue();
      
      while(q != 4){
        CapGain program = new CapGain();
        //program.mainMenuPrompt();
        //System.out.println("Select an option");
        option = sc.nextInt();
        
        if(option == 1){
          System.out.println("How much shares would you like to buy on day " + day + "?");
          int shares = sc.nextInt();
          System.out.println("At what price would you like to buy?");
          double price = sc.nextDouble();
          program.buy(day, shares, price);
          day += 1;
        }
        if(option == 2){
          System.out.println("How many shares would you like to sell from day?" + program.getSellDay());
          int shares = sc.nextInt();
          System.out.println("At what price would you like to sell?");
          double price = sc.nextDouble();
          program.sell(shares, price);
        }
        if(option == 3){
          System.out.println("Total Capital Gain of : $" + program.getTotalCapGain());
        }
        if(option == 4){
          q = 4;
        }
        
      }
      
      System.out.println("Program finished");
      
  }
}