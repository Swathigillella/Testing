package NewJava;

public class OddNum {

	public static void main(String[] args) {
		int num=1345790;
	
		int rem = num%10;
		int even_count=0;
		int odd_Count=0;
		while(num>0) {
			rem=num%10;
			
			if(rem/2==0) {
				even_count++;
			}
			else {
				odd_Count++;
			}
			num=num/10;
		}
		System.out.println("evencount"+even_count);
		System.out.println("oddcount"+odd_Count);
}


	}

