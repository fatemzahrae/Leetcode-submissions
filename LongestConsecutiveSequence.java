import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int longest = 0 ;
        
        HashSet<Integer> uniqueNums = new HashSet<Integer>();

        for (int i : nums){
            uniqueNums.add(i) ;
        }

        for (int i : uniqueNums){
            if (!uniqueNums.contains(i-1)){
                int length = 1 ;
                while (uniqueNums.contains(i+length)){
                    length++;
                }
                longest = Math.max(length,longest) ;
            }
        }

       
        return longest ;
    }
}
