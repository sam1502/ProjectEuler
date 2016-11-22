//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//a2 + b2 = c2
//For example, 3(2) + 4(2) = 9 + 16 = 25 = 5(2).
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.

public class PyhtagoreanTriplet9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<1000;i++){
			for(int j=i+1;j<1000;j++){
				int c = 1000 - i - j;
				if(i * i + j * j == c*c){
					System.out.println("Answer is "+i*j*c);
				}
			}
		}

	}

}
