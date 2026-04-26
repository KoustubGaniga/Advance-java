package stringoperations;
public class Stringoperation3 {

    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("\nLength of str1: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("\nEquals: " + str1.equals(str3));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));
        System.out.println("CompareTo: " + str1.compareTo(str3));

        // 4. String Searching
        String sentence = "Java programming is fun";
        System.out.println("\nIndex of 'programming': " + sentence.indexOf("programming"));
        System.out.println("Contains 'fun': " + sentence.contains("fun"));

        // 5. Substring Operations
        System.out.println("\nSubstring (5, 16): " + sentence.substring(5, 16));
        System.out.println("Substring (5): " + sentence.substring(5));

        // 6. String Modification
        String modified = sentence.replace("fun", "awesome");
        System.out.println("\nModified String: " + modified);
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Lowercase: " + sentence.toLowerCase());

        // 7. Whitespace Handling
        String strWithSpaces = "   Java Programming   ";
        System.out.println("\nBefore Trim: '" + strWithSpaces + "'");
        System.out.println("After Trim: '" + strWithSpaces.trim() + "'");

        // 8. String Concatenation
        String concat = str1 + " " + str2;
        System.out.println("\nConcatenated String: " + concat);

        // 9. String Splitting
        String fruits = "Apple,Banana,Orange";
        String[] fruitArray = fruits.split(",");
        System.out.println("\nSplit Strings:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(4, " Language");
        sb.replace(0, 4, "Advanced");
        System.out.println("\nStringBuilder Result: " + sb);

        // 11. String Formatting
        String name = "Ravi";
        int age = 20;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("\nFormatted String: " + formatted);

        // 12. Email Validation using contains(), startsWith(), endsWith()
        String email = "Ravi@gmail.com";

        boolean isValid = email.contains("@") &&
                          (email.endsWith(".com") || email.endsWith(".in")) &&
                          !email.startsWith("@");

        System.out.println("\nEmail: " + email);
        System.out.println("Is Valid Email: " + isValid);
    }
}