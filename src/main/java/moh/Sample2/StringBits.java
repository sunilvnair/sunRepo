package moh.Sample2;

import net.sourceforge.htmlunit.corejs.javascript.regexp.SubString;

public class StringBits {

	public static void main(String[] args) {
		
			System.out.println("Start");
			stringBits("sunil");
		}
	public static String stringBits(String str) {
	String retStr = "";
	String myVar  = "";
	int strLen =str.length();
	System.out.println(strLen);
	for (int i=0;i<strLen;i++){
		myVar = myVar + str.substring(i,i+2);
		System.out.println(myVar);
	}
	retStr =myVar;
	return retStr;
}
	
}




	
