package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 118 杨辉三角
 */
public class PascalTriangle {
    public static void main(String[] args) {
        List<List<Integer>> generate = generate(5);
        generate.stream().forEach(list -> {
            list.stream().forEach(value -> System.out.println(value + " "));
            System.out.println("\n");
        });
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> subList = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    subList.add(1);
                } else {
                    subList.add(pascalTriangle.get(i - 2).get(j-1) + pascalTriangle.get(i - 2).get(j));
                }
            }
            pascalTriangle.add(subList);
        }
        return pascalTriangle;
    }
}
