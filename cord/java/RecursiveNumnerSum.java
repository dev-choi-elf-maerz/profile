import java.util.Scanner;

public class RecursiveNumnerSum {
    
    	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int end = scan.nextInt();
		int answer = 0;
		answer = calAccSum(start, end);
	    System.out.println("Sum = " + answer);
	}

    public static int calculator(int start, int end) {
		
		if (start == end) {
			return start;
		}
		
		return start + calculator(start + 1, end);
	}
}


/*
 * 1 3
 * 1 + calculator(2, 3)
 *      2 + calculator(3, 3)
 *          3
 */