# 53. Maximum Subarray

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/53_maximum_subarray`
- Folder Name: `53_maximum_subarray`
- Official Link: https://leetcode.com/problems/maximum-subarray/

## Problem Overview
Find the contiguous subarray with the largest possible sum.

## Java Starter Signature
```java
public int maxSubArray(int[] nums)
```


## Suggested Test Cases
1. `nums = [-2,1,-3,4,-1,2,1,-5,4] -> 6`
2. `nums = [1] -> 1`
3. `nums = [5,4,-1,7,8] -> 23`

## What To Watch For
- Check small lengths like 0, 1, and 2 before assuming a longer scan is possible.
- Be careful with in-place updates so you do not overwrite values you still need to read.
- Watch for off-by-one errors when returning a new length or slicing a kept prefix.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MaximumSubarray.java` contains the correct class name and Java method signature.
- `MaximumSubarrayTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MaximumSubarray.java` - blank Java starter solution
- `MaximumSubarrayTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
