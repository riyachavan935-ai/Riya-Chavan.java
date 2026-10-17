public class Courier {
    int courierId; String trackingId; String senderName, receiverName;
    String fromCity, toCity; double weight; String productName;
    int originalDistance, optimizedDistance; double originalCost, finalCost;
    String status="BOOKED", paymentStatus="PENDING", paymentMethod;
    public Courier(int id,String tid,String sender,String receiver,String from,String to,double w,String prod){
        courierId=id; trackingId=tid; senderName=sender; receiverName=receiver;
        fromCity=from; toCity=to; weight=w; productName=prod;
    }
    public void setOptimized(int o,int op){originalDistance=o; optimizedDistance=op;}
    public void setCost(double o,double f){originalCost=o; finalCost=f;}
    public void setPayment(String m,String s){paymentMethod=m; paymentStatus=s;}
    public void display(){
        System.out.println(trackingId+" | "+productName+" | "+fromCity+"->"+toCity+" | Orig:"+originalDistance+"km Opt:"+optimizedDistance+"km | Rs."+finalCost+" | "+paymentMethod+" "+paymentStatus+" | "+status);
    }
                   }
