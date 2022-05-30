public class problem12 {

    final static int THRESHOLD = 500;

    public static void main(String[] args) {
        System.out.println(getTriangle());
    }

    public static long getTriangle() {
        int n = 1;
        long currentSum = 0;
        while (!hasOverXDivisors(currentSum, THRESHOLD)) {
            currentSum += n;
            n++;
        }
        return currentSum;
    }

    private static boolean hasOverXDivisors(long nr, int threshold) {
        if ( nr <= threshold ) {
            return false;
        }
        int divisors = 0;
        int i;
        int sqrt = (int) Math.sqrt(nr);
        for ( i = 1 ; i <= sqrt ; i++ ) {
            if ( nr % i == 0 ) {
                divisors+=2;           // E.g.: (2, n/2), (3, n/3)
            }
        }
        if ( sqrt*sqrt == nr ){        // it was counted twice
            divisors--;
        }
        if ( divisors > threshold ) {
            return true;
        }
        return false;
    }

}