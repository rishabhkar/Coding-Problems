public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int writeIndex = 0;
        for (int num : nums) {
            if (num != val) {
                nums[writeIndex] = num;
                writeIndex++;
            }
        }
        return writeIndex;
    }
}
