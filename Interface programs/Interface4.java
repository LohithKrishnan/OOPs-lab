import java.util.*;

interface StringOperations {
    void Concatenate(String str1, String str2);
    void Reverse(String str);
    void UpperCase(String str);
    void LowerCase(String str);
}

class StringManipulator implements StringOperations {
    public void Concatenate(String str1, String str2) {
        System.out.println("Concatenated: " + str1 + str2);
    }

    public void Reverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }

    public void UpperCase(String str) {
        System.out.println("Uppercase: " + str.toUpperCase());
    }

    public void LowerCase(String str) {
        System.out.println("Lowercase: " + str.toLowerCase());
    }
}

class Interface4 {  
    public static void main(String[] args) {
        StringOperations strOps = new StringManipulator();
        strOps.Concatenate("Hello", "World");
        strOps.Reverse("Java");
        strOps.UpperCase("hello");
        strOps.LowerCase("WORLD");
    }
}

