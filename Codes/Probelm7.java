
public class Probelm7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amountOfPrimes = 0, number =2;
		
		while(amountOfPrimes != 10001){
			if(isPrime(number)){
				amountOfPrimes++;
				System.out.println(number + " is Prime");
			}
			number++;
		}

	}
	public static boolean isPrime(int n){
		for(int i=2;i<n;i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}

}
