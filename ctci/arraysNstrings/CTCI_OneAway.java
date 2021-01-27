package ctci.arraysNstrings;

public class CTCI_OneAway {
    
    public static void main(String[] args) {
        
    }

    public static boolean oneAway(String s1, String s2) {
        int s1Len = s1.length();
        int s2Len = s2.length();
        int edits = 0;
        int itr = Math.max(s1Len, s2Len);
        if(Math.abs(s1Len - s2Len) > 1) {
            return false;
        } else if(Math.abs(s1Len - s2Len) == 1) {
            // check for deletion
            
        } else if(Math.abs(s1Len - s2Len) == 0) {
            // check for replaced char
            // check for equal strings
            for(int i = 0; i < itr; i++) {
                if(s1.charAt(i) == s2.charAt(i)) continue;
                if(s1.charAt(i) != s2.charAt(i)) edits++;
            }
            if(edits <= 1) return true;
        } else {
            return false;
        }
        return false;
    }

}
