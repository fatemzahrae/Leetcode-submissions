import java.util.*;

public class TopFrequent {
   
    public static void addElement(HashMap<Integer, Integer> hash, Integer key){
        if (!hash.containsKey(key)){
            hash.put(key, 1);
        } else {
            hash.put(key, hash.get(key) + 1);
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (Integer num : nums) {
            addElement(hash, num);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hash.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, 
                               Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).getKey();
        }
        
        return ans;
    }
}
