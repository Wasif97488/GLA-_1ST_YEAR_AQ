package Lec38_02_Apr;

public class MostWaterContainers {

    public int maxArea(int[] height) {

        int i = 0, j = height.length - 1;
        int max = 0;

        while (i < j) {
            int hei = Math.min(height[i], height[j]);
            int area = (j - i) * hei;
            max = Math.max(max, area);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return max;
    }

    public static void main(String[] args) {
    	MostWaterContainers obj = new MostWaterContainers();

        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println(obj.maxArea(height));
    }
}
