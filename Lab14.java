 class order{
    public static int NumberOfOreers;
    private String orderName;
    private double orderPrice;
    
    public order(String orderName,double orderPrice){
        this.orderName=orderName;
        this.orderPrice= orderPrice;
        NumberOfOreers++;
    }
    
    public String getOrderName(){
        return orderName;
    }
    public double getOrderPrice(){
        return orderPrice;
    }
    public static int getNumberOfOreers(){
        return NumberOfOreers;
    } 
}

public class Lab14 {

   public static double getBill( order [] orders){
       double total=0;
       for(order o : orders){
           total+=o.getOrderPrice();
       }
       return total;
   }
    public static void main(String[] args) {
      order [] orders =new order [2];
      orders [0]=new order ("Rice",30);
      orders [1]=new order ("Pasta",40);
      
      for(order o : orders){
          System.out.println("OrderName :"+o.getOrderName());
          System.out.println("OrderPrice :"+o.getOrderPrice());
      }
      System.out.println("Total Bill :"+getBill(orders));
      System.out.println("Number of orders :"+ order.getNumberOfOreers());
    } 
}
