package level1arraysHashingEffecient;
import  java.util.*;

public class ContainsDuplicateEffecient {

    public boolean containsDuplicate(int[] nums) {
        // Create a HashMap to keep track of the number of occurrences of each number
        Map<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the number is already in the map, return true
            if (map.containsKey(nums[i])) {
                return true;
            }
            
            // Otherwise, add the number to the map with a count of 1
            map.put(nums[i], 1);
        }
        
        // If we reach the end of the array without finding a duplicate, return false
        return false;
    }
}

