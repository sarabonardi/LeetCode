import java.lang.*;

public class WaterContainer {
    public static void main(String args[]) {
        int[] check = {1, 5, 7, 8, 3, 9};
        System.out.println("Max area is: " + maxArea(check));
        //Runtime: 1662 ms, faster than 5.01% of Java online submissions for Container With Most Water.
        //Memory Usage: 40.4 MB, less than 47.03% of Java online submissions for Container With Most Water.
    }
    public static int maxArea(int[] height) {
        int max = 0;
        int area = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                if (height[i] <= height[j]) {
                    area = (Math.abs(j - i) * height[i]);
                    if (area > max) {
                        max = area;
                    }
                }
            }
        }
        return max;
    }
}
