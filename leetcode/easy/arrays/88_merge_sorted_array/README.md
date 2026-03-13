# 88. Merge Sorted Array

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/arrays/88_merge_sorted_array`
- Folder Name: `88_merge_sorted_array`
- Official Link: https://leetcode.com/problems/merge-sorted-array/

## Problem Overview
Merge nums2 into nums1 in non-decreasing order using the space already reserved in nums1.

## Java Starter Signature
```java
public void merge(int[] nums1, int m, int[] nums2, int n)
```


## Suggested Test Cases
1. `nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 -> [1,2,2,3,5,6]`
2. `nums1 = [1], m = 1, nums2 = [], n = 0 -> [1]`
3. `nums1 = [0], m = 0, nums2 = [1], n = 1 -> [1]`

## What To Watch For
- Check small lengths like 0, 1, and 2 before assuming a longer scan is possible.
- Be careful with in-place updates so you do not overwrite values you still need to read.
- Watch for off-by-one errors when returning a new length or slicing a kept prefix.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MergeSortedArray.java` contains the correct class name and Java method signature.
- `MergeSortedArrayTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MergeSortedArray.java` - blank Java starter solution
- `MergeSortedArrayTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
