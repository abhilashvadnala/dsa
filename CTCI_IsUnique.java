public class CTCI_IsUnique {
    
    public static void main(String[] args) {
        System.out.println(isUniqueString2("abbilsh"));
    }

    /**
     * with using an ascii arr of size 128.
     * @param s
     * @return
     */
    public static boolean isUniqueString(String s) {
        int strLen = s.length();
        if(strLen > 128)
            return false;
        boolean[] arr = new boolean[128];
        for (int i = 0; i < strLen; i++) {
            if(arr[s.charAt(i)])
                return false;
            arr[s.charAt(i)] = true;
        }   
        return true;
    }

    /**
     * without using extra data structure
     * @param s
     * @return
     */
    public static boolean isUniqueString2(String str) {
        int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) return false;
			checker |= (1 << val);
		}
		return true;
    }

}
