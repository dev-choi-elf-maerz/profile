import java.util.Scanner;

public class RecursiveFibonacci {
    
    public static int pibonacci(int number) {
        
        if (number == 1)
            return 1;
        if (number == 2)
            return 1;
        
        return pibonacci(number - 1) + pibonacci(number - 2);
    }

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		int answer = pibonacci(number);
		
		System.out.println(answer);
		
	}

}

/*
 * f(5) = f(4) + f(3) : 6
 *          1      6     
 * f(4) = f(3) + f(2) : 1
 *          2      5 
 * f(3) = f(2) + f(1) : 2
 *          3      4
 * f(2)
 *   5               : 1
 * f(3) = f(2) + f(1) : 2
 *          7      8
 */