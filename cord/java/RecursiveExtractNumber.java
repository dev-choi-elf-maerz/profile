import java.util.Scanner;

public class RecursiveExtractNumber {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        calculator(number);
    }

    public static void calculator(int number) {

        if (number / 10 == 0) {
            System.out.println(number);
            return;
        }  

        calculator(number / 10);
        System.out.println(number % 10);
    }
}


/*
 * 입력된 수를 높은 자릿수 부터 출력하시오
 * 2312
 * 
 * 2
 * 3
 * 1
 * 2
 */