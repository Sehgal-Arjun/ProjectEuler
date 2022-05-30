import java.util.*;

class problem10{
    public static void main(String[] args) {
        List<Long> primes = new ArrayList<>();
        primes.add(2L);
        primes.add(3L);
        long primeSum = 5;

        for (long primeCandidate = 5; primeCandidate < 2000000; primeCandidate = primeCandidate + 2) {
            boolean isCandidatePrime = true;
            double sqrt = Math.sqrt(primeCandidate);
            for (int i = 0; i < primes.size(); i++) {
                Long prime = primes.get(i);
                if (primeCandidate % prime == 0) {
                    isCandidatePrime = false;
                    break;
                }
                if (prime > sqrt) {
                    break;
                }
            }
            if (isCandidatePrime) {
                primes.add(primeCandidate);
                primeSum += primeCandidate;
            }
        }
        System.out.println(primes.size());
        System.out.println(primeSum);    
    }

}