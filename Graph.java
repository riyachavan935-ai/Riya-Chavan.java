import java.util.*;
public class Graph {
    Map<String,List<Route>> adjList=new HashMap<>();
    class Route{String to; int dist; Route(String t,int d){to=t;dist=d;}}
    public void addRoute(String f,String t,int d){
        adjList.computeIfAbsent(f,k->new ArrayList<>()).add(new Route(t,d));
        adjList.computeIfAbsent(t,k->new ArrayList<>()).add(new Route(f,d));
    }
    public Graph(){
        addRoute("Mumbai","Pune",150); addRoute("Mumbai","Thane",30);
        addRoute("Thane","Nashik",140); addRoute("Pune","Lonavala",70);
        addRoute("Mumbai","Lonavala",80); addRoute("Pune","Nagpur",700);
        addRoute("Nashik","Aurangabad",180);
    }
                }
