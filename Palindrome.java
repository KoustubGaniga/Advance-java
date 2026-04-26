package string;

public class Palindrome {
	
	    public static boolean isPalindrome(String str) {
	        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        String reversed = new StringBuilder(str).reverse().toString();
	        return str.equals(reversed);
	    }

	    public static void main(String[] args) {
	        String str = "Madam, I'm Adam";
	        System.out.println("Is Palindrome: " + isPalindrome(str));
	    }
	}


