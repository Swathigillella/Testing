package NewJava;

public class PalindromeString {

	public static void main(String[] args) {
		String a="Hello";
		String rev="";
		//method:1
		int len=a.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+a.charAt(i);

		}
		System.out.println("rev: "+rev);
		if(a==rev) {
			System.out.println(a+"is a palindrome");
		}
			else {
				System.out.println(a+" "+"is not  a palindrome");

			}
		}

	}


