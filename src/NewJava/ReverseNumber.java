package NewJava;

public class ReverseNumber {

	public static void main(String[] args) {
	int num=12330456;
//		int rev=0;
//		while(num>0) {
//			rev=rev*10+num%10;
//			num=num/10;
//					}
//
//		System.out.println(rev);
		//Method 2:
   StringBuffer sb=new StringBuffer(String.valueOf(num));
   System.out.println(sb.reverse());

         StringBuilder sb2=new StringBuilder(String.valueOf(num));
         //sb2.append(num);
         System.out.println(sb2.reverse());
	}

}
