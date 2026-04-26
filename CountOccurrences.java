package string;

public class CountOccurrences {
	
	    public static int countOccurrences(String main, String sub) {
	        int count = 0, index = 0;

	        while ((index = main.indexOf(sub, index)) != -1) {
	            count++;
	            index += sub.length();
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        String main = "java is fun java is powerful";
	        String sub = "java";
	        System.out.println("Occurrences: " + countOccurrences(main, sub));
	    }
	}

