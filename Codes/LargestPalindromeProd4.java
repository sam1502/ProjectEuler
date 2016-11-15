
public class LargestPalindromeProd4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product=1;
		int max=0;
		int current;
		
		for(int i=100;i<=1000;i++){
			for(int j=100;j<=1000;j++){
				product = i*j;
				if(isPalindrome(Integer.toString(product))){
					System.out.println(product);
					current=product;
					if(current > max){
						max = current;
					}
					
				}
			}
		}
		System.out.println("Maximum is= "+max);

	}
	public static boolean isPalindrome(String s){
		String str="";
		for(int i=s.length();i>0;i--){
			str += s.charAt(i-1);
			if(s.equals(str)){
				return true;
			}
				
		}
		return false;

	}
}
