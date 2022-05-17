package com.abc;

import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Pattern p=Pattern.compile(".s");
//        Matcher m=p.matcher("as");
//        boolean b=m.matches();
//        System.out.println(b);
          boolean b=Pattern.compile(".s").matcher("as").matches();
          System.out.println(b);
		  boolean result=Pattern.matches(".s", "2s");//true
		  System.out.println(result);
		  boolean result1=Pattern.matches(".s", "na");//false
		  System.out.println(result1);
		  boolean result2=Pattern.matches("[897][0-9a-zA-Z]{6}","8976abc" );
		  System.out.println(result2);
		  boolean result3=Pattern.matches("\\D","M");//non digits
		  System.out.println(result3);
		  boolean result4=Pattern.matches("\\d","1");//only digits
		  System.out.println(result4);
		  boolean result5=Pattern.matches("[879]+","879879");//879 comes one or more times but not other than 879
		  System.out.println(result5);
	}

}
