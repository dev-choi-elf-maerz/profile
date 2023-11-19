import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] arge) {
           
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt(); // 입력값
        int[] binary = new int[100];
        int i = 0;
        
        while (inputNum > 0) {
            binary[i] = inputNum % 2;
            inputNum /= 2;
            i++;
        }
        i--;
        for (; i >= 0; i--) {
            System.out.println(binary[i]);
        }

    }
    
}


/* 
 *  Decimal to binary conversion
 * - 10진수를 2진수로 변환하시오
 * - 19 = 10011
 * 
 * >> array, while, for
 */