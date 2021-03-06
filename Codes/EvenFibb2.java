//Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.


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
