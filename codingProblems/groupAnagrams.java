package codingProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagramsSolution(List.of("eat","tea","tan","ate","nat","bat")));
        System.out.println(groupAnagramsSolution(List.of("abc")));
    }

    public static List<List<String>> groupAnagramsSolution(List<String> list) {
        Map<String, List<String>> freq = new HashMap<>();

        for(String str : list) {

            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            freq.computeIfAbsent(sortedString, k -> new ArrayList<>()).add(str);
        }
        List<List<String>> answer = new ArrayList<>();
        freq.forEach((key, value) -> {
            answer.add(value);
        });
        
        return answer;
    }

}
