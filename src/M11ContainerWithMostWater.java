public class M11ContainerWithMostWater {
    public int maxArea(int[] height) {
//        int max = 0;
//        for (int i = 0; i < height.length - 1; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                max = Math.max(max, (j - i) * Math.min(height[i],height[j]));
//            }
//        }
//        return max;

        int left = 0, right = height.length - 1;
        int max = 0;
        while (left < right) {
            int width = right - left;
            int side = 0;
            if (height[left] <= height[right]) {
                side = height[left];
                left++;
            } else {
                side = height[right];
                right--;
            }
            max = Math.max(max, width * side);
        }
        return max;
    }
}
