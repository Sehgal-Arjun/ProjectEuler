import javax.sound.sampled.SourceDataLine;

public class problem14 {
    public static void main(String[] args) {
        int max = 1;
        int ans = 1;
        int [] t_cache = new int[1000000];

        for (int i = 2; i < 1000000; i++) {
            long n = i;
            int t = 0;
            do {
                ++t;
                if ((n & 1) == 0) {
                    n >>= 1;
                    if (n < i) {
                        t += t_cache[(int)n];
                        break;
                    }
                } else {
                    n = 3 * n + 1;
                }
            } while (true);
            t_cache[i] = t;
            if (t > max) {
                max = t;
                ans = i;
            }
        }
        System.out.println(ans);
    }
    
}