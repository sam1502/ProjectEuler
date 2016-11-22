//The sum of the squares of the first ten natural numbers is,
//12 + 22 + ... + 102 = 385
//The square of the sum of the first ten natural numbers is,
//(1 + 2 + ... + 10)2 = 552 = 3025
//Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class SumSquareDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,sum1=0,total=0;
		for(int i=0;i<=100;i++){
			sum = sum+(i*i);
			sum1 = sum1+i;
			total = sum1*sum1;
		}
		System.out.println("Sum of Squares of the numbers is"+sum);
		System.out.println("Square of Sum of Numbers is"+total);
		int Difference = total-sum;
		System.out.println("Difference is"+Difference);

	}

}
