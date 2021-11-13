package week3.day1;

public class ReplaceString {
	public static void main(String[] args) {
		String str = "I am working with Java8";
		String replace = str.replace("8","11");
		System.out.println("8 replaced by 11 : "  +  replace);
		String concat = str.concat("#");
		System.out.println("concat with string  : "  +  concat);
		String substring = str.substring(5, 14);
		System.out.println("print the characters from 5 to 14  : "  +  substring);
		
		
	}

}
