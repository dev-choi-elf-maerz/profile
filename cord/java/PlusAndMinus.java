import java.util.Scanner;

public class PlusAndMinus {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean flag = true;

        for (int i = 0; i < number; i++) {
            if (i == number) {
                System.out.println(i);
                break;
            }
                
            if (flag) {
                System.out.println(i + " + ");
            } else { 
                System.out.println(i + " - ");
            }    
            flag = !flag;    
               
        }
    }
}

/*
 * 입력된 숫자까지 +, -를 차례대로 반복하시오.
 * 입력: 5
 * 출력 1 + 2 - 3 + 4 - 5
 */
