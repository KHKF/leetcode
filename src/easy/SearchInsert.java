package easy;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;
        if (start < end) {
            return binarySearchPosition(nums, start, end, target);
        }
        return target <= start ? start : start + 1;
    }

    private int binarySearchPosition(int[] nums, int start, int end, int target) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return binarySearchPosition(nums, ++mid, end, target);
            } else {
                return binarySearchPosition(nums, start, mid - 1, target);
            }
        }
        return target <= start ? start : start + 1;
    }
}
