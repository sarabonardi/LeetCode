import java.util.*;

public class PalindromeCheck {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int check = input.nextInt();
        if (isPalindrome(check) == true) {
            System.out.println("This number is a Palindrome.");
        }
        else {
            System.out.println("This number is not a Palindrome.");
        }
        //Runtime: 7 ms, faster than 64.43% of Java online submissions for Palindrome Number.
        //Memory Usage: 38.6 MB, less than 35.26% of Java online submissions for Palindrome Number.
    }
    public static boolean isPalindrome(int x) {
        String g = String.valueOf(x);
        int front = 0;
        int back = g.length() - 1;
        while (g.charAt(front) == g.charAt(back)) {
            if ((front == back) || (front > back)) {
                return true;
            }
            front ++;
            back --;
        } return false;
    }
}
