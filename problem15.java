import java.math.BigInteger;
 
 
public class problem15 {
    public static void main(String args[]){
        BigInteger n = BigInteger.valueOf(40);      // The total number of moves for any one path (right + down)
        BigInteger r = BigInteger.valueOf(20);      // The total number of right moves for any one path
         
        System.out.println(factorial(n).divide(factorial(r).multiply(factorial(n.subtract(r)))));
    }
     
    public static BigInteger factorial( BigInteger n )
    {
            if ( n.compareTo(BigInteger.ZERO) <= 0 ) { // base case
                return BigInteger.ONE;
            }
            else  {  // general case
                return ( n.multiply(factorial ( n.subtract(BigInteger.ONE)) ) );
            }
    }
}