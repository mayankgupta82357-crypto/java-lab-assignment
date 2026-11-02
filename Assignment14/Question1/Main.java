// Roll No: BCS2025477 | Assignment 14 | Question 1
// Count vowels
public class Main {
    public static void main(String[] args) {
        String s = "programming";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ("aeiou".indexOf(ch) >= 0) count++;
        }
        System.out.println("Vowels: " + count);
    }
}
