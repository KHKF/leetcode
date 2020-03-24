package easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x!=0 && x%10 == 0)) {
            return false;
        }
        int temp = x;
        int palindromeNumber = 0;
        while (temp > 0) {
            palindromeNumber = palindromeNumber * 10 + temp % 10;
            temp /= 10;
        }
        return palindromeNumber == x;
    }
}

