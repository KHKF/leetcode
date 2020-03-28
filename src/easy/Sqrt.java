package easy;

public class Sqrt {
    public int mySqrt(int x) {
        if (x <= 3) {
            return 1;
        }
        int result;
        for (int i = 2; i < x; i++) {
            result = x / i;
            if (result >= i && result <= i + 1) {
                return result;
            }
        }
        return 1;
    }
}
