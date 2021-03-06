//Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
//If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

//For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
//Evaluate the sum of all the amicable numbers under 10000.


public class AmicableNumber21 {
    
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i < 10000; i++) {
            int divSum = getProperDivisorsSum(i);
            if(i!=divSum && i==getProperDivisorsSum(divSum))
            {
                sum+=i;
            }
        }
        System.out.println(sum);
        
    }
    
    private static int getProperDivisorsSum(int num){
        int sum = 0;
        for (int j = 1; j < num; j++) {
            if(num%j==0){
                sum += j;
            }
        }
        return sum;
    }
}