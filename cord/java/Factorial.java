import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
           
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt(); // 입력값
        int sumNum = 0;

        for (int i = 1; i < inputNum; i++) {
            sumNum *= i;
        }

        System.out.println(sumNum);

    }
}
