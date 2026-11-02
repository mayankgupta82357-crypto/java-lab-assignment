// Roll No: BCS2025477 | Assignment 13 | Question 2
// Reverse a word using charAt
public class Main {
    public static void main(String[] args) {
        String word = "Java";
        String reversed = "";
        for (int i = 0; i < word.length(); i++) {
            reversed = word.charAt(i) + reversed;
        }
        System.out.println("Reversed: " + reversed);
    }
}
