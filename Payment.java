public class Payment {
    String trackingId, method; double amount; String status="SUCCESS";
    public Payment(String tid,String m,double amt){
        trackingId=tid; method=m; amount=amt;
        System.out.println("PAYMENT SUCCESS: "+tid+" Rs."+amt+" via "+m+" - PAID");
    }
    public String getStatus(){return status;}
      }
