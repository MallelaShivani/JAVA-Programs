package xyz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class SimpleBFS {
	public static void main(String [] args) {
		Map<String, List<String>> house=new HashMap<String, List<String>>();
		house.put("Living room",Arrays.asList("Kitchen","Bedroom","Study room"));
		house.put("Kitchen", Arrays.asList("Bathroom"));
		house.put("Bedroom", Arrays.asList("Balcony"));
		house.put("Study room",new ArrayList<String>());
		house.put("Bathroom", new ArrayList<String>());
		house.put("Balcony", new ArrayList<String>());
		System.out.println("Exploring the house using BFS starting from living room");
		bfs(house,"Living room");
	}
	public static void bfs(Map<String, List<String>> house,String StartRoom) {
		Queue<String>queue=new LinkedList<>();
		Set<String>visited=new HashSet<>();
		queue.add(StartRoom);
		visited.add(StartRoom);
		while(!queue.isEmpty()) {
			String currentroom=queue.poll();
			System.out.println("visited"+currentroom);
			for(String neighbor:house.get(currentroom)) {
				if(!visited.contains(neighbor)) {
					queue.add(neighbor);
					visited.add(neighbor);
				}
			}
			
	}
	}
}

	                                                         
