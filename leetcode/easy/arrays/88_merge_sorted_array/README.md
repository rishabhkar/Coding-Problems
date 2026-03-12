# 88. Merge Sorted Array

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Topic: Arrays
- Bucket: Basic
- Folder: `88_merge_sorted_array`
- Official Link: https://leetcode.com/problems/merge-sorted-array/

## Problem Description
Two sorted arrays are provided, but only the first one has enough trailing space to hold all values. Merge the second sorted array into the first array in non-decreasing order.

## Input / Output Understanding
- Input: Array `nums1` has length `m + n`, where its first `m` values are valid; `nums2` has `n` sorted values.
- Output: Modify `nums1` in place so it contains the full sorted merge of both input ranges.

## Worked Examples
### Example 1
- Input: `nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3`
- Output: `[1,2,2,3,5,6]` stored inside `nums1`
- Why: The trailing zeroes are just placeholders for the incoming merged values.

### Example 2
- Input: `nums1 = [0], m = 0, nums2 = [1], n = 1`
- Output: `[1]`
- Why: When `nums1` starts with no real values, it simply takes all of `nums2`.

## Edge Cases Worth Testing
- Either input range may be empty.
- Equal values must all be preserved.
- The second array may belong entirely before or after the first range.
- Negative values should merge correctly too.

## Implementation Notes
- Merging from the end avoids overwriting unread values in `nums1`.
- This is a standard two-pointer pattern on sorted data.
- The placeholders in `nums1` are not part of the sorted input region.

## Folder Contents
- `MergeSortedArray.java` — the main logic class
- `MergeSortedArrayTest.java` — edge-focused regression tests
- `README.md` — problem notes and revision-friendly context
