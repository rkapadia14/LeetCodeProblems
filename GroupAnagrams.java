import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagrams {
     public static List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String word: strs){
            char[] temp = word.toCharArray();
            Arrays.sort(temp);
            if(hm.containsKey(String.valueOf(temp)))
                hm.get(String.valueOf(temp)).add(word);
            else
            {
                List<String> list = new ArrayList<>();
                list.add(word);
                hm.put(String.valueOf(temp),list);
            }
        }
        return hm.values().stream().collect(Collectors.toList());
    }

    public static void main(String args[])
    {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> resultList = groupAnagrams(strs);
        System.out.println(resultList);
    }

}
