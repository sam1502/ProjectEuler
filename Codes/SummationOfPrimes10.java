
public class SummationOfPrimes10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2000000;
		long sum = 0;
		for(int i=0;i<=num;i++){
			if(isPrime(i)){
				sum+=i;
			}
		}
		System.out.println("Sum is: "+sum);

	}
	static boolean isPrime(int n){
		if(n == 2){
			return false;
		}
		else if(n %2 == 0){
			return false;
		}
		for(int i=3;i*i<=n;i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
		
	}

}
