package easy.arrays._88_merge_sorted_array;

public class MergeSortedArray {
  public void merge(int[] nums1, int m, int[] nums2, int n) {

    // Case 1: If m and n equal to 0 (bypassing constraints) -> No need to do anything (nums1 will be evaluated)
    // Case 2: If only n equal to 0 -> No need to do anything (nums1 will be evaluated)

    // Case 3: Usual case mentioned in the question
    int reader1 = m - 1;
    int reader2 = n - 1;
    int writer = m + n - 1;

    while (reader1 >= 0 && reader2 >= 0) {

      if (nums1[reader1] < nums2[reader2]) {
        nums1[writer] = nums2[reader2];
        reader2--;
        writer--;
      } else if (nums1[reader1] > nums2[reader2]) {
        nums1[writer] = nums1[reader1];
        reader1--;
        writer--;
      } else {
        nums1[writer] = nums2[reader2];
        reader2--;
        writer--;
      }
    }

    while (reader2 >= 0) {
      nums1[writer] = nums2[reader2];
      reader2--;
      writer--;
    }

  }
}
