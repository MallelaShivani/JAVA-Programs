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

public class Graphbfs {

	public static void main(String[] args) {
		Map<String,List<String>>zoo=new HashMap<String, List<String>>();
		zoo.put("Entrance",Arrays.asList("Reptile House","Bird Sanctuary","Mammual Zone"));
		zoo.put("Reptile House",Arrays.asList("Snake pit") );
		zoo.put("Bird Sanctuary",Arrays.asList("Parrot Pivilion"));
		zoo.put("Mammual Zone", Arrays.asList("Lion den","ElephantEnclosure"));
		zoo.put("Snake pit",new ArrayList<String>());
		zoo.put("Parrot Pivilion",new ArrayList<String>());
		zoo.put("Lion den",new ArrayList<String>());
		zoo.put("ElephantEnclosure",new ArrayList<String>());
		System.out.println("explore the zoo starting from the entrance:");
		bfs(zoo,"Entrance");
	}
	public static void bfs(Map<String, List<String>> house,String Start) {
		Queue<String>queue=new LinkedList<>();
		Set<String>visited=new HashSet<>();
		queue.add(Start);
		visited.add(Start);
		while(!queue.isEmpty()) {
			String current=queue.poll();
			System.out.println("visited"+current);
			for(String neighbor:house.get(current)) {
				if(!visited.contains(neighbor)) {
					queue.add(neighbor);
					visited.add(neighbor);

}
			}
		}
	}
}

