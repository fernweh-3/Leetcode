public class M162FindPeakElement {
    public int findPeakElement(int[] nums) {
        return binarySearch(0, nums.length - 1, nums);
    }

    public int binarySearch(int start, int end, int[] nums) {
        if (start == end) return start;
        else if (start + 1 == end) return nums[start] > nums[end] ? start : end;
        else {
            while (start < end) {
                int mid = (start + end) / 2;
                if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) return mid;
                else if (nums[mid] < nums[mid - 1]) return binarySearch(start, mid, nums);
                else if (nums[mid] < nums[mid + 1]) return binarySearch(mid, end, nums);
            }
        }
        return -1;
    }
}
