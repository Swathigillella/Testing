package NewJava;

public class Factorial {

	public static void main(String[] args) {
		//5!=1*2*3*4*5
		int factorial=1;
		int num=5;
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		
		}
		System.out.println(factorial);
	}

}
