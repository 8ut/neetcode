package level1arraysHashing;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] freq = new int[26];
        
        // Count the frequency of each character in s
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        
        // Decrement the frequency of each character in t
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
        }
        
        // Check if all frequencies are zero
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        
        return true;
    }
    
}
 