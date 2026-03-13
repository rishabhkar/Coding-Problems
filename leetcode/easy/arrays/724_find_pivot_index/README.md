# 724. Find Pivot Index

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/arrays/724_find_pivot_index`
- Folder Name: `724_find_pivot_index`
- Official Link: https://leetcode.com/problems/find-pivot-index/

## Problem Overview
Return the index where the sum on the left equals the sum on the right, or -1 if none exists.

## Java Starter Signature
```java
public int pivotIndex(int[] nums)
```


## Suggested Test Cases
1. `nums = [1,7,3,6,5,6] -> 3`
2. `nums = [1,2,3] -> -1`
3. `nums = [2,1,-1] -> 0`

## What To Watch For
- Check small lengths like 0, 1, and 2 before assuming a longer scan is possible.
- Be careful with in-place updates so you do not overwrite values you still need to read.
- Watch for off-by-one errors when returning a new length or slicing a kept prefix.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `FindPivotIndex.java` contains the correct class name and Java method signature.
- `FindPivotIndexTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `FindPivotIndex.java` - blank Java starter solution
- `FindPivotIndexTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
