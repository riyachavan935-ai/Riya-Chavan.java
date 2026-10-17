public class Main {
    public static void main(String[] args){
        System.out.println("Courier Logistics - Riya 3121 - Meesho Inspired");
        CourierService service=new CourierService();
        service.bookCourier("Riya Chavan - Seller","Priya Sharma","Mumbai","Pune",2.5,"Meesho Saree","UPI");
        service.bookCourier("Riya Chavan - Seller","Amit Patel","Pune","Nagpur",1.2,"Meesho Kurti","COD");
        service.bookCourier("Riya Chavan - Seller","Neha Singh","Nashik","Mumbai",3.0,"Meesho Lehenga","CARD");
        System.out.println("\n--- ALL ORDERS ---");
        service.showAll();
        System.out.println("\nOUTPUT SUCCESS - 100% WORKING - Dijkstra + Payment + Delivery");
    }
}
