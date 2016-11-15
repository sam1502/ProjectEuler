//The prime factors of 13195 are 5, 7, 13 and 29.

//What is the largest prime factor of the number 600851475143 ?


import java.util.*;
public class LargestPrimeFactor3 {
	
	static List<Long> factors(long num){
	 ArrayList<Long> factors = new ArrayList<Long>();
	for(long i=2;i<=num;i++){
		while(num % i==0){
			factors.add(i);
			
			num/= i;
		}
	}
	return factors;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Long lon : factors(600851475143L))
		{
			System.out.println(lon);
			
		}

	}

}
