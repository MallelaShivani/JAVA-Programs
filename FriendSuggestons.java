package xyz;

import java.util.*;

public class FriendSuggestons {
    private Map<String, List<String>> network;

    public FriendSuggestons(Map<String, List<String>> network) {
        this.network = network;
    }

    public Map<String, Integer> getMutualFriendsCount(String person) {
        Set<String> directFriends = new HashSet<>(network.getOrDefault(person, new ArrayList<>()));
        Map<String, Integer> mutualCount = new HashMap<>();
        for (String friend : directFriends) {
            for (String foaf : network.getOrDefault(friend, new ArrayList<>())) {
                if (!foaf.equals(person) && !directFriends.contains(foaf)) {
                    mutualCount.put(foaf, mutualCount.getOrDefault(foaf, 0) + 1);
                }
            }
        }
        return mutualCount;
    }

    public List<String> suggestFriends(String person, int maxSuggestions) {
        Map<String, Integer> mutualFriends = getMutualFriendsCount(person);
        List<Map.Entry<String, Integer>> list = new ArrayList<>(mutualFriends.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        List<String> suggestions = new ArrayList<>();
        for (int i = 0; i < Math.min(maxSuggestions, list.size()); i++) {
            suggestions.add(list.get(i).getKey());
        }
        return suggestions;
    }

    public static void main(String[] args) {
        Map<String, List<String>> network = new HashMap<>();
        network.put("Alice", Arrays.asList("Bob", "Charlie"));
        network.put("Bob", Arrays.asList("Alice", "David", "Eve"));
        network.put("Charlie", Arrays.asList("Alice"));
        network.put("David", Arrays.asList("Bob"));
        network.put("Eve", Arrays.asList("Bob"));

        FriendSuggestons suggester = new FriendSuggestons(network);
        System.out.println(suggester.suggestFriends("Alice", 5));
    }
}