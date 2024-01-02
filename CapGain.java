public class CapGain{
  
      public static double totalCapGain = 0.00;
      public static Queue newq = new Queue();
  
  public static void buy(int day, int numshares, double price){
        newq.enqueue(day, numshares, price);
        
  }
  
  public static void sell(int numshares, double price){
        
        double gainforday = numshares * (price - newq.frontprices());
        
        System.out.println("Gain for the day " + gainforday);
    
        totalCapGain += gainforday;
        newq.dequeue();
  }
  
  public static void mainMenuPrompt(){
        System.out.println("Main Menu");
        System.out.println("Option 1. Buy");
        System.out.println("Option 2. Sell");
        System.out.println("Option 3. Total Capital Gain So Far");
        System.out.println("Quit");
    }
    
  public static double getTotalCapGain(){
        return totalCapGain;
  }


}