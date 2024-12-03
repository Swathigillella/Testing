package NewJava;

public class PalindromeNumber{

	public static void main(String[] args) {
		
      int num=121;
      int org_num=num;
      int rev=0;
     
      while(num>0) {
    	  rev=rev*10+num%10;
    	  num=num/10;
      }
      System.out.println(org_num);
      System.out.println(rev);
      
      if(org_num==rev) {
    	  System.out.println("Number is a palindrome");
      }
      else {
    	  System.out.println("Number +is not a palindrome");
      }
	}

}
