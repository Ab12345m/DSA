public class RevString1 {

    public static String RevString2 (String str) {
        if (str.isEmpty()) {
            return str;
        }

        return RevString2(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "GeeksforGeeks";
        System.out.println(RevString2(str));   
    }
}