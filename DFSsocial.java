package xyz;

import java.util.*;

public class DFSsocial {
    private Map<String, List<String>> socialMap = new HashMap<>();

    public void addFriend(String person1, String person2) {
        socialMap.computeIfAbsent(person1, k -> new ArrayList<>()).add(person2);
        socialMap.computeIfAbsent(person2, k -> new ArrayList<>()).add(person1);
    }

    public List<String> findSocialCircle(String person) {
        Set<String> visited = new HashSet<>();
        List<String> result = new ArrayList<>();
        dfs(person, visited, result);
        return result;
    }

    private void dfs(String person, Set<String> visited, List<String> result) {
        if (visited.contains(person))
            return;
        visited.add(person);
        result.add(person);
        for (String friend : socialMap.getOrDefault(person, new ArrayList<>())) {
            dfs(friend, visited, result);
        }
    }

    public List<String> findSocialCircleIterative(String person) {
        Set<String> visited = new HashSet<>();
        List<String> result = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push(person);

        while (!stack.isEmpty()) {
            String current = stack.pop();
            if (!visited.contains(current)) {
                visited.add(current);
                result.add(current);
                for (String friend : socialMap.getOrDefault(current, new ArrayList<>())) {
                    stack.push(friend);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        DFSsocial network = new DFSsocial();
        network.addFriend("Alice", "Bob");
        network.addFriend("Alice", "Charlie");
        network.addFriend("Bob", "Diana");
        network.addFriend("Bob", "john");
        System.out.println("Recursive DFS from Alice: " + network.findSocialCircle("Alice"));
        System.out.println("Iterative DFS from Alice: " + network.findSocialCircleIterative("Alice"));

    }
}