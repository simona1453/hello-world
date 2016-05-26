package testProject;

import java.util.Arrays;

public class TestClass {

	public static void main(String[] args) {

		String text = "this is a test string";
		 reverseString(text);
		 String[] text2 = refactorString(text);
		 System.out.println();
		 System.out.print(Arrays.toString(text2));
		 String output2= refactorString2(text);
		 System.out.print(output2);

	}

	public static void reverseString(String text) {
		int spacesNum = 0;
		for (int i = 0; i < text.toCharArray().length; i++) {

			if (text.toCharArray()[i] == ' ') {
				spacesNum++;
			}
		}

		String[] text2 = text.split(" ", spacesNum + 1);

		for (int j = text2.length - 1; j >= 0; j--) {

			System.out.print(text2[j] + " ");
		}

	}

	public static String[] refactorString(String text) {

		String[] text2 = text.split("\\s+");
		String[] output = new String[text2.length] ;

		
			for (int j = 0; j <= text2.length-1 ; j++) {
			 output [j] = text2 [text2.length -1 -j];
			 
			}	
		
			return output;
	}
	
	public static String refactorString2(String text) {

		String reverse="";
		String[] text2 = text.split("\\s+");
		for(String item:text2){
			reverse=item+" "+reverse;
		}
		
			return reverse.trim();
	}
}
