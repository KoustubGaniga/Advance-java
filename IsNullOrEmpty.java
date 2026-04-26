package string;
public class IsNullOrEmpty {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[] args) {
        String str = "   ";
        System.out.println("Result: " + isNullOrEmpty(str));
    }
}