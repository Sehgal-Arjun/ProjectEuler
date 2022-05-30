import java.math.BigInteger;
 
public class problem16{
	private static int calcDigits(String s)
	{
		int sum = 0;
 
		for (int i = 0; i < s.length(); i++)
		{
			Character c = new Character(s.charAt(i));
			String z = c.toString();
			int j = Integer.parseInt(z);
			sum += j;
		}
 
		return sum;
	}
 
	public static void main(String[] args)
	{ 
		BigInteger n = BigInteger.valueOf(2);
		n = n.pow(1000);
		System.out.println(calcDigits(n.toString()));
	}
}