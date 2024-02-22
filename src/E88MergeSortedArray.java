public class E88MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[nums1.length];
        int pointer1 = 0;
        int pointer2 = 0;
        int i = 0;
        while (i < nums1.length) {
            if (pointer1 < m && pointer2 < n) {
                if (nums1[pointer1] <= nums2[pointer2]) {
                    System.out.println(nums1[pointer1]);
                    result[i] = nums1[pointer1];
                    pointer1++;
                } else {
                    result[i] = nums2[pointer2];
                    pointer2++;
                }
            } else {
                if (pointer1 == m) {
                    result[i] = nums2[pointer2];
                    pointer2++;
                } else {
                    result[i] = nums1[pointer1];
                    pointer1++;
                }
            }
            i++;
        }
        while (i > 0) {
            nums1[i - 1] = result[i - 1];
            i--;
        }
    }
}
