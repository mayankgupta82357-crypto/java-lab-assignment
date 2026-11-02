// Roll No: BCS2025477 | Assignment 13 | Question 3
// Check palindrome
public class Main {
    public static void main(String[] args) {
        String word = "racecar";
        String reversed = "";
        for (int i = 0; i < word.length(); i++) {
            reversed = word.charAt(i) + reversed;
        }
        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}
