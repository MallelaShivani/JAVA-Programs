package xyz;

import java.util.*;
public class SimpleDfs {
	private Map<String, List<String>> homeMap=new HashMap<String, List<String>>();
	private Set<String>visited=new HashSet<String>();
	public void addRoom(String room ,String ConnectedRoom) {
	homeMap.computeIfAbsent(room,k ->new ArrayList<>()).add(ConnectedRoom);
	homeMap.computeIfAbsent(ConnectedRoom,k ->new ArrayList<>()).add(room);
	}
	public void dfs(String currentroom) {
		if(visited.contains(currentroom))
			return;
		visited.add(currentroom);
		System.out.println("visited:"+currentroom);
		for(String neighbor:homeMap.getOrDefault(currentroom, new ArrayList<>())) {
				dfs(neighbor);
	}
	}

	public static void main(String[] args) {
		SimpleDfs home=new SimpleDfs();
		home.addRoom("LivingRoom","Kitchen");
		home.addRoom("LivingRoom","Bedroom");
		home.addRoom("Bedroom","Bathroom");
		System.out.println("DFS traversal starting from living room:");
		home.dfs("LivingRoom");
		
		

	}

}
