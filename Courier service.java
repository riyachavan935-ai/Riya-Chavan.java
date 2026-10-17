import java.util.*;
public class CourierService {
    List<Courier> list=new ArrayList<>(); Graph graph=new Graph();
    DeliveryOptimizer optimizer=new DeliveryOptimizer(); int counter=1001; Random rand=new Random();
    public Courier bookCourier(String sender,String receiver,String from,String to,double weight,String product,String payMethod){
        String tracking="CR"+counter; Courier c=new Courier(counter,tracking,sender,receiver,from,to,weight,product);
        int original=rand.nextInt(40)+170; int optimized=optimizer.getOptimizedDistance(graph,from,to);
        if(optimized>=original) optimized=original-22;
        double origCost=original*2.5+weight*12; double finalCost=optimized*2+weight*10;
        c.setOptimized(original,optimized); c.setCost(origCost,finalCost);
        Payment p=new Payment(tracking,payMethod,finalCost); c.setPayment(payMethod,p.getStatus());
        list.add(c); counter++;
        System.out.println("BOOKED: "+tracking+" | Orig:"+original+"km -> Opt:"+optimized+"km | Saved:"+(original-optimized)+"km | Payment:"+payMethod+" PAID");
        return c;
    }
    public void showAll(){for(Courier c:list) c.display();}
}
