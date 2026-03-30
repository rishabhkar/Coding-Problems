public class ContainerWithMostWater {
  public int maxArea(int[] height) {

    // Case 1: Null array.
    if (height == null) return 0;

    // Case 2: Less than 2 lines -> no container.
    if (height.length < 2) return 0;

    // Case 3: Two pointers.
    int left = 0;
    int right = height.length - 1;
    int maxArea = 0;

    while (left < right) {

      int currentArea = Math.min(height[left], height[right]) * (right - left);
      maxArea = Math.max(maxArea, currentArea);

      if (height[right] < height[left]) right--;
      else left++;
    }

    return maxArea;
  }
}
