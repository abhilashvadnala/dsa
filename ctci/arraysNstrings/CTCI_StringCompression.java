package ctci.arraysNstrings;

public class CTCI_StringCompression {

    public static String stringCompression(String s) {
        int sLen = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sLen; i++) {
            char currChar = s.charAt(i);
            int currCharCount = 0;
            int j = i;
            while ((j < sLen) && (s.charAt(j) == currChar)) {
                currCharCount++;
                j++;
            }
            sb.append(currChar);
            sb.append(currCharCount);
            i = i + currCharCount - 1;
            currCharCount = 0;
        }
        return sb.toString().length() > sLen ? s : sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(stringCompression("Abhilash Vadnala"));
    }
}
