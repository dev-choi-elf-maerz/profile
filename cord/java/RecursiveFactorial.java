import java.util.Scanner;

public class RecursiveFactorial {
    
    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int ans = 0;
		ans = calculator(input);		
		System.out.println(ans);
	
	}

    public static int calculator(int i) {
		
		if (i == 1 ) {
			return 1;
		}
		
		return i * calculator(i - 1);
	}

}


/*
 * 3 * calculator(2)
 *      2 * calculator(1)
 *          1
 * = 6
 */