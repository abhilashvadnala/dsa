package ctci.arraysNstrings;

import java.util.HashMap;
import java.util.Map;

public class CTCI_PalindromePermutation {

    public boolean isPalindromePermutation(String s) {
        // 1. check for 
        int sLen = s.length();
        if(sLen == 1)
            return true;
        Map<Character, Integer> freq = new HashMap<Character, Integer>();
        for(int i = 0; i < sLen; i++) {
            char currChar = s.charAt(i);
            if(freq.containsKey(currChar)) {
                freq.put(currChar, freq.get(currChar)+1);
            } else {
                freq.put(currChar, 1);
            }
        }
        if((sLen & 1) == 1) {
            
        } else {

        }
        return false;
    }
    
}
