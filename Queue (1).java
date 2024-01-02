class Queue
{
   class Node{
     
   int day;
   int amount;
   double prices;
   Node next;
  
   public Node(int day, int amount, double prices){
      this.day = day;
      this.amount = amount;
      this.prices = prices;
      this.next = null;
      }
   }
  
   Node front, end;
   int size;
  
   public Queue(){
   this.front = null;
   this.end = null;
   size = 0;
   }
  
   public void enqueue(int day, int amount, double prices){
   Node node = new Node(day, amount, prices);
  
   if(end == null){
   front = node;
   end = node;
   size++;
   return;
   }
  
   end.next = node;
   end = node;
   size++;
   }
  
   public int dequeue(){
   if(front == null){
   return -1;
   }
   Node temp = front;
   front = front.next;
   size--;
  
   if(front == null){
   end = null;
   }
  
   return temp.day;
   }
  
   public int size(){
   return this.size;
   }
  
   public int frontday(){
   if(!isEmpty()){
   return front.day;
   } else{
   return -1;
   }
   }
   
   public int endday(){
     if(!isEmpty()){
       return end.day;
     }
     else{
       return -1;
     }
   }
   
   public int frontamount(){
     if(!isEmpty()){
       return front.amount;
     }
     else{
       return -1;
     }
   }
   
   public double frontprices(){
     if(!isEmpty()){
       return front.prices;
     }
     else{
       return -1;
     }
   }
   
   public void substractamount(int amount){
     if(!isEmpty()){
       front.amount = front.amount - amount;
     }
   } 
  
   public boolean isEmpty(){
   return front == null;
   }
}

