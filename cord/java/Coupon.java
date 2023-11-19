import java.util.Scanner;

public class Coupon {

    public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        int couponH = scanner.nextInt();
		int stampH= scanner.nextInt();
		int couponU = couponH;

        calculator(couponH, 0, stampH, 0);
    }

    public static void calculator(int couponU, int stampU, int stampH, int chicken) {
        if (couponU > 0) {
            couponU--;
            stampU++;
            chicken++;
            calculator(couponU, stampU, stampH, chicken);
            return;
        } 
        if (stampU > 0) {
            if (stampU / stampH == 0) {
                stampU -= stampH;
                couponU++;
                calculator(couponU, stampU, stampH, chicken);
            }
        }
        if (couponU == 0 && stampU / stampH == 0) {
            System.out.println(chicken);
        }
    }
}


/*
 * 치킨 한마리를 주문할 수 있는 치킨 쿠폰을 n장 가지고 있다. 
 * 치킨 한마리에 도장 한개를 찍어준다.
 * 도장 s개를 모으면 치킨 쿠폰 한장 교환가능하다.
 * 소지한 쿠폰으로 치킨을 몇마리 먹을수 있는지 구하시오.
 * (4, 3) (10, 3) 
 * 5 | 14
 * if c(4, 0, 3, 0)
 * if c(3, 1, 3, 1)
 * if c(2, 2, 3, 2)
 * if c(1, 3, 3, 3)
 * if c(0, 4, 3, 4)
 * else c(1, 1, 3, 5) 
 * if c(0, 2, 3, 5)
 * 
 * 
 */