package string;

public class RemoveWhitespace {
	
	    public static String removeWhitespace(String str) {
	        return str.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        String str = "Java Programming Language";
	        System.out.println("Result: " + removeWhitespace(str));
	    }
	}


