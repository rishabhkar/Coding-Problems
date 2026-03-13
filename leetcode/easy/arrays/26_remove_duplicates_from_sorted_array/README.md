# 26. Remove Duplicates from Sorted Array

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/arrays/26_remove_duplicates_from_sorted_array`
- Folder Name: `26_remove_duplicates_from_sorted_array`
- Official Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

## Problem Overview
Remove repeated values from the sorted array in place and return the count of unique values kept at the front.

## Java Starter Signature
```java
public int removeDuplicates(int[] nums)
```


## Suggested Test Cases
1. `nums = [1,1,2] -> k = 2, prefix [1,2]`
2. `nums = [0,0,1,1,1,2,2,3,3,4] -> k = 5, prefix [0,1,2,3,4]`
3. `nums = [1,1,1,1] -> k = 1, prefix [1]`

## What To Watch For
- Check small lengths like 0, 1, and 2 before assuming a longer scan is possible.
- Be careful with in-place updates so you do not overwrite values you still need to read.
- Watch for off-by-one errors when returning a new length or slicing a kept prefix.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RemoveDuplicatesFromSortedArray.java` contains the correct class name and Java method signature.
- `RemoveDuplicatesFromSortedArrayTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RemoveDuplicatesFromSortedArray.java` - blank Java starter solution
- `RemoveDuplicatesFromSortedArrayTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
