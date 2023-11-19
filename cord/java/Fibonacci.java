public class Fibonacci {
 
    public static void mian(String[] arge) {

        int[] numList = new int[100];
        numList[1] = 1;
        numList[2] = 1;

        for (int i = 0; i < numList.length; i++) {
            numList[i] = numList[i-1] + numList[i-2];
        }

        for (int i = 1; i < 10; i++) {
            System.out.println(numList[i] + " ");;
        }

        System.out.println();
        
        int pprevNum = 1;
        int prevNum = 1;
        System.out.println(pprevNum + " ");
        System.out.println(prevNum + " ");
    
        for (int i = 3; i < 10; i++) {
            int nNum = pprevNum + prevNum;
            System.out.println(nNum + " "); 

            pprevNum = prevNum;
            prevNum = nNum;
        }
    }
    
}

/*
- 피보나치 수열을 출력해라
- An = An-1 + An-2; n >= 3 
- 1 1 2 3 4 8 13 21 34 ...

>> Array, for
 */