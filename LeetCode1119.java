class LeetCode1119 {

    public static void main(String[] args) {
        System.out.println(removeVowels("leetcodeisacommunityforcoders"));
    }

    public static String removeVowels(String s) {
        int strLen = s.length();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strLen; i++) {
            // comapring with logical AND consumes more memory than switch case
            switch (s.charAt(i)) {
                case 'a':
                    break;
                case 'e':
                    break;
                case 'i':
                    break;
                case 'o':
                    break;
                case 'u':
                    break;
                default:
                    sb.append(s.charAt(i));
                    break;
            }
        }
        return sb.toString();
    }

}