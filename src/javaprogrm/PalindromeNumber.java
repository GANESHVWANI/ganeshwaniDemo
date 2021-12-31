package javaprogrm;

public class PalindromeNumber {
	  
	   public static void main(String[] args) {
		
		int n=414, s=0, c, r;
		 c=n;
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		
		if(c==s)
		{
			System.out.println("palindrome Number");
		}
		else
		{
			System.out.println("Not palidrome Number");
		}
	}

}
