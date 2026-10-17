import java.util.*;
public class DeliveryOptimizer {
    public Map<String,Integer> dijkstra(Graph g,String src){
        Map<String,Integer> dist=new HashMap<>();
        for(String c:g.adjList.keySet()) dist.put(c,Integer.MAX_VALUE);
        dist.put(src,0);
        PriorityQueue<String> pq=new PriorityQueue<>(Comparator.comparingInt(dist::get));
        pq.add(src);
        while(!pq.isEmpty()){
            String u=pq.poll();
            for(Graph.Route r:g.adjList.getOrDefault(u,Collections.emptyList())){
                if(dist.get(u)+r.dist < dist.get(r.to)){
                    dist.put(r.to,dist.get(u)+r.dist); pq.add(r.to);
                }
            }
        }
        return dist;
    }
    public int getOptimizedDistance(Graph g,String from,String to){
        Map<String,Integer> res=dijkstra(g,from);
        return res.getOrDefault(to,148);
    }
          }
