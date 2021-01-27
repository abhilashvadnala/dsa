package ctci.arraysNstrings;

import java.util.HashMap;
import java.util.Map;

public class CTCI_CheckPermutation {
    
    public static void main(String[] args) {
        System.out.println(checkPermutation2("abcd", "abcd"));
    }

    public static boolean checkPermutation(String s1, String s2) {
        Map<Character, Integer> m1 = new HashMap<>();
        int s1Len = s1.length();
        for(int i = 0; i < s1Len; i++) {
            if(m1.containsKey(s1.charAt(i))) {
                m1.put(s1.charAt(i), m1.get(s1.charAt(i))+1);
            } else {
                m1.put(s1.charAt(i), 1);
            }
        }
        int s2Len = s2.length();
        for(int i = 0; i < s2Len; i++) {
            if((m1.containsKey(s2.charAt(i))) && (m1.get(s2.charAt(i)) > 0)) {
                m1.put(s2.charAt(i), m1.get(s2.charAt(i))-1);
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPermutation2(String s1, String s2) {
        return sortString(s1).equals(sortString(s2));
    }

    public static String sortString(String s) {
        char[] charArr = s.toCharArray();
        java.util.Arrays.sort(charArr);
        return new String(charArr);
    }

}
