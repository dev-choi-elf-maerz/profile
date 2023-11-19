import java.util.Scanner;

public class TowerOfHanoi {
    
    public static void hanoi(int numberOfRings, int from, int to, int pillar) {

        if (numberOfRings == 0) return;
        hanoi(numberOfRings - 1, from, to, pillar);
        System.out.println(form + "변에서 " + to + "로 옯긴다.");
        hanoi(numberOfRings - 1, pillar, to, from);

    }
    public static void main(String[] args) {
        
        
        int numberOfRings = 0;
        int from = 0;
        int to = 0;
        int pillar = 0;

        Scanner scanner = new Scanner(System.in);
        

    }
}
