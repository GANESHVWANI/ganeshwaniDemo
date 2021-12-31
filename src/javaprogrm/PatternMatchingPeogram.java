package javaprogrm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchingPeogram {
	
	    public static void main(String[] args) {
			
	    String s1 = "abcdefabcghiabc";
	    int count=0;
	    
	    Pattern p = Pattern.compile("abc");
	    Matcher m = p.matcher(s1);
	    
	    while(m.find())
	    {
	    	count++;
	    }
	    System.out.println(count);
		}

}
