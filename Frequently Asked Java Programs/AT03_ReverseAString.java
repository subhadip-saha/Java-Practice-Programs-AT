//Program 03: Reverse A String | 3 Ways of Reverse a String

public class AT03_ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ABCD";			//it is a string or word.
		String rev = "";	//empty string
		
		//Logic 1: using charAt - charAt()
		
		/*int len = str.length();
		for(int i = len - 1; i >= 0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println("Reverse string: " + rev);*/
		
		
		//Logic 2: using character array - toCharArray()
		
		/*char[] ch = str.toCharArray();
		int len = ch.length;
		
		for(int i = len - 1; i >= 0; i--)
		{
			rev = rev + ch[i];
		}
		System.out.println("Reverse string: " + rev);*/
		
		
		//Logic 2: using StringBuffer class
		
		StringBuffer sbf = new StringBuffer(str);		//at first we have to convert the word/string into StringBuffer object 
		StringBuffer rev2 = sbf.reverse();
		
		System.out.println("Reverse string: " + rev2);
		
		//or directly, System.out.println(sbf.reverse());
		
	}

}
