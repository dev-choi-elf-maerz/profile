import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {
        
           
        Scanner scanner = new Scanner(System.in);
        String strNum = scanner.next();
        int strNumLength = strNum.length();
        boolean flag = true;

        for (int i = 0; i < strNumLength/2; i++) {
            if (strNum.charAt(i) != (strNum.charAt(strNumLength-i-1))) {
                flag = flase;
            }
        }

        System.out.println("Palindrome nicht");
        
    }
}
