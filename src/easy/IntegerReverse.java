package easy;

//Given a 32-bit signed integer, reverse digits of an integer.
//
//        Example 1:
//
//        Input: 123
//        Output: 321
public class IntegerReverse {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            if (result < Integer.MAX_VALUE / 10 || result == Integer.MAX_VALUE / 10 && tail <= 7) {
                result = result * 10 + tail;
            }
            if (result > Integer.MIN_VALUE / 10 || result == Integer.MIN_VALUE / 10 && tail > -8) {
                result = result * 10 + tail;
            }
            x /= 10;
        }
        return result;
    }
}
