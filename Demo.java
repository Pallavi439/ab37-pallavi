package Seleniumprogram;
import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String inputString = "c to java";
		        String outputString = capitalizeWords(inputString);
		        System.out.println(outputString);
		    }

		    public static String capitalizeWords(String input) {
		      StringBuffer b=new StringBuffer();
		      String[] word=input.split(input);
		      for(String words: word)
		      {
		    	 b.append(Character.toUpperCase(word.length)).append(word.toString(1)).append("");
		      }
			return input;
		      
		      
		    }}