package logicaloperators;
import java.util.Random;

public class CouponSimulation {
    public static void main(String[] args) {
        int N = 10;
        int totalRandomNumbers = generateDistinctCoupons(N);
        System.out.println("Total random numbers needed: " + totalRandomNumbers);
    }

    static int generateDistinctCoupons(int N) {
        boolean[] distinctCoupons = new boolean[N + 1];
        Random random = new Random();
        int totalRandomNumbers = 0;

        while (true) {
            int randomCoupon = random.nextInt(N) + 1;
            if (!distinctCoupons[randomCoupon]) {
                distinctCoupons[randomCoupon] = true;
                totalRandomNumbers++;
            }
            if (totalRandomNumbers == N) {
                break;
            }
        }

        return totalRandomNumbers;
    }
}
