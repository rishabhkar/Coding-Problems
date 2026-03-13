# 1480. Running Sum of 1D Array

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/arrays/1480_running_sum_of_1d_array`
- Folder Name: `1480_running_sum_of_1d_array`
- Official Link: https://leetcode.com/problems/running-sum-of-1d-array/

## Problem Overview
Return the running total after each position in the array.

## Java Starter Signature
```java
public int[] runningSum(int[] nums)
```


## Suggested Test Cases
1. `nums = [1,2,3,4] -> [1,3,6,10]`
2. `nums = [1,1,1,1,1] -> [1,2,3,4,5]`
3. `nums = [3,1,2,10,1] -> [3,4,6,16,17]`

## What To Watch For
- Check small lengths like 0, 1, and 2 before assuming a longer scan is possible.
- Be careful with in-place updates so you do not overwrite values you still need to read.
- Watch for off-by-one errors when returning a new length or slicing a kept prefix.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RunningSumOf1DArray.java` contains the correct class name and Java method signature.
- `RunningSumOf1DArrayTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RunningSumOf1DArray.java` - blank Java starter solution
- `RunningSumOf1DArrayTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
