# 80. Remove Duplicates from Sorted Array II

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/80_remove_duplicates_from_sorted_array_ii`
- Folder Name: `80_remove_duplicates_from_sorted_array_ii`
- Official Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

## Problem Overview
Remove extra duplicates from the sorted array so that each value appears at most twice.

## Java Starter Signature
```java
public int removeDuplicates(int[] nums)
```


## Suggested Test Cases
1. `nums = [1,1,1,2,2,3] -> k = 5, prefix [1,1,2,2,3]`
2. `nums = [0,0,1,1,1,1,2,3,3] -> k = 7, prefix [0,0,1,1,2,3,3]`
3. `nums = [1,1] -> k = 2, prefix [1,1]`

## What To Watch For
- Check small lengths like 0, 1, and 2 before assuming a longer scan is possible.
- Be careful with in-place updates so you do not overwrite values you still need to read.
- Watch for off-by-one errors when returning a new length or slicing a kept prefix.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RemoveDuplicatesFromSortedArrayII.java` contains the correct class name and Java method signature.
- `RemoveDuplicatesFromSortedArrayIITest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RemoveDuplicatesFromSortedArrayII.java` - blank Java starter solution
- `RemoveDuplicatesFromSortedArrayIITest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
