package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n = in.nextInt();

		boolean[] sieve = new boolean[n];
		for (int i = 2; i < sieve.length; i++) 
		{
			sieve[i] = true;
		}

		for (int i = 2; i < n; i++ ) 
		{
			for(int j = i+i; j < n; j+=i) 
			{
				sieve[j] = false;

			}
		}
		//return all true values in boolean arr with their respective numerical placement
		for(int i = 2; i < n ; i++) 
		{
			if (sieve[i])
			{
				System.out.println(i);
			}
		}
	}
}
