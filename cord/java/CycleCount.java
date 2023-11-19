public class CycleCount {
    
    public static void main(String[] args) {
        
        int number = 52;
        int quotient = number;
        int temporary = 0;
        int count = 0;

        do {
            temporary = quotient / 10 + quotient % 10;
            quotient = quotient % 10 * 10 + temporary % 10;
            count++;
        } while (n != res);
        
        System.out.println(count);
    }
}



/*
* N이 주어졌을 때 N의 사이클의 길이를 구하시오
* 입력 : 26
* 정답: 4   (26시작 2+6 = 8, 68 6+8 = 14, 84 8+4= 12, 42 4+2 = 6, 26)
* 
* >> while, for
 */