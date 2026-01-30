public class MoveX {

    public static void PrintX(String str, int count, int idx,String newString) {
        
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
       
        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;

            PrintX(str, count, idx+1, newString);
        } else {
            newString += currChar;
            PrintX(str, count, idx+1, newString);   
        }
    }
    
    public static void main(String[] args) {
        String str = "axbcxxd";
        PrintX(str, 0, 0, "");
       
    }
}
