package javaprogrm;

public class StringPalindrome {
	  
	  public static void main(String[] args) {
		
       String s1= "madam";
       String rev ="";
       
       for(int i=s1.length()-1; i>=0; i--)
       {
    	   rev=rev+s1.charAt(i);
       }
       if(s1.equals(rev))
       {
    	   System.out.println("palidrome sumber");
       }
       else 
       {
    	   System.out.println(" Not palidrome string");
       }
	   }
	

}
