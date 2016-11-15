
public class EvenFibb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long fib1 = 1;
		long fib2 = 1;
		long result = 0;
		long sum = 0;
		 
		while (result < 4000000) {
		    if ((result % 2) == 0) {
		        sum += result;
		        System.out.println(sum);
		    }
		 
		    result = fib1 + fib2;
		    fib2 = fib1;
		    fib1 = result;
		}
		

	}

}
