//The sequence of triangle numbers is generated by adding the natural numbers
//So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28.
//The first ten terms would be:
//1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

//What is the value of the first triangle number to have over five hundred divisors?

//Project Euler Problem 12

public class Triangular_Number12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int TriangleNum = 0;
		boolean found = true;
		while(found == true){
			counter++;
			TriangleNum += counter;
			if(factors(TriangleNum) > 500){
				System.out.println(TriangleNum);
				found = false;
			}
		}
	}
	public static int factors(int n){
		int counter=0;
		int k = (int) Math.sqrt(n);
		for(int i=1;i<k+1;i++){
			if(n%i == 0){
				counter++;
			}
		}
		return 2*counter;
	}

}
