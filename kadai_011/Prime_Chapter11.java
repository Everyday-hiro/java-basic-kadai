package kadai_011;

public class Prime_Chapter11{
	public static void main(String[] args) {
		
		boolean[] PrimeNumber = new boolean[101];
		
		for(int i = 1; i < PrimeNumber.length; i++) {
			PrimeNumber[i]=true;
		}
		
		int numberDivide = 2;
		while(numberDivide < PrimeNumber.length) {
			for(int i =numberDivide + 1; i < PrimeNumber.length; i++) {
				if(i % numberDivide == 0) {
					PrimeNumber[i] = false;
					continue;
				}
			}
			
			numberDivide += 1;
		}
		
		for(int i = 2; i < PrimeNumber.length; i++) {
			if(PrimeNumber[i]) {
				System.out.println(i);
			}
		}
	}
}