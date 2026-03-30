public class MedianOfTwoSortedArrays {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    ArrayList<Integer> merged = mergeArray(nums1, nums2);
    double median = findMedian(merged);
    return median;
  }

  public ArrayList<Integer> mergeArray(int[] nums1, int[] nums2) {

    ArrayList<Integer> merged = new ArrayList<Integer>();

    for (int val : nums1) {
      merged.add(val);
    }

    for (int val : nums2) {
      merged.add(val);
    }

    Collections.sort(merged);


    return merged;
  }

  public double findMedian(ArrayList<Integer> merged) {

    int len = merged.size();
    double median = 0.0;

    if (len % 2 == 0) {
      median = merged.get(len / 2).doubleValue() + merged.get((len / 2) - 1).doubleValue();
      median = median / 2;
      return median;
    } else {
      median = merged.get(len / 2).doubleValue();
      return median;
    }

  }
}
