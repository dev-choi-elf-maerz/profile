import java.util.Scanner;

public class Mode {
 
    public static void main(String[] arge) {
        
        Scanner scanner = new Scanner(System.in);
        int[] inputNum = new int[10]; // 입력값

        for (int i = 0; i < inputNum.length; i++) {
            inputNum[i] = scanner.nextLine();
        }

        int [] mode = new int[10]; // 출현횟수
        
        for (int i = 0; i < mode.length; i++) {
            mode[inputNum[i]]++;
        }

        int modeNum = 0; 
        int modeCount = 0;

        for (int i = 0; i < mode.length; i++) {
            if (modeCount < mode[i]) {
                modeCount = mode[i];
                modeNum = i;
            }
        }

        System.out.println("Mode : " + modeNum + "Count : " + modeCount);

    }
    
}
/* 
- 최빈수를 구하라
- 가장 많이 출현한 수를 구하라

>> array, for

1 2 2 3 1 4 2 2 4 3
Mode :  2 Count : 4
 */
