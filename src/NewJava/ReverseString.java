package NewJava;

public class ReverseString {

	public static void main(String[] args) {
		String a="Hello";
		String rev="";
		//method:1
		int len=a.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+a.charAt(i);
			
		}
		System.out.println("rev: "+rev);
		//method:2
		String b="Hello";
		String rev2="";
		int len2=b.length();
		char[]b2=b.toCharArray();
		for(int i=len2-1;i>=0;i--) {
			rev2=rev2+b2[i];
		}
		System.out.println("rev2 :"+rev2);
		
		String c="Hello";
		StringBuffer bc=new StringBuffer(c);
		System.out.println(bc.reverse());
		
		String d="Hello World";
		String[] arr=d.split(" ");
		StringBuilder sb3=new StringBuilder(arr[1].toString());
		StringBuilder g=sb3.reverse();
		String reverse=arr[0]+" "+g;
		System.out.println(reverse);

	}
	
   
}
