package string;
public class ReverseString {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String str = "Java";
        System.out.println("Reversed: " + reverseString(str));
    }
}