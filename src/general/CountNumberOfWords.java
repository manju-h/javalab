package general;

import java.util.StringTokenizer;

public class CountNumberOfWords {
	static int i,c=0,res;
	public static void main(String[] args) {
		String inputString = "   manchester united is also known as red devil ";
	System.out.println(wordcount(inputString));
	}
	 static int wordcount(String s)
	    {
	        char ch[]= new char[s.length()];      //in string especially we have to mention the () after length
	        for(i=0;i<s.length();i++)
	        {
	            ch[i]= s.charAt(i);
	            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
	            c++;
	        }
	        return c;
	    }
	 
	 static int wordcount_usingTokens(String inputString) {
		 String delim = " ";
		 StringTokenizer tokens = new StringTokenizer(inputString, delim);
		 
		 return tokens.countTokens();
	 }
}
