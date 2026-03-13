# 1920. Build Array from Permutation

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/arrays/1920_build_array_from_permutation`
- Folder Name: `1920_build_array_from_permutation`
- Official Link: https://leetcode.com/problems/build-array-from-permutation/

## Problem Overview
Build a new array where each position uses nums[nums[i]].

## Java Starter Signature
```java
public int[] buildArray(int[] nums)
```


## Suggested Test Cases
1. `nums = [0,2,1,5,3,4] -> [0,1,2,4,5,3]`
2. `nums = [5,0,1,2,3,4] -> [4,5,0,1,2,3]`
3. `nums = [0,1,2] -> [0,1,2]`

## What To Watch For
- Check small lengths like 0, 1, and 2 before assuming a longer scan is possible.
- Be careful with in-place updates so you do not overwrite values you still need to read.
- Watch for off-by-one errors when returning a new length or slicing a kept prefix.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `BuildArrayFromPermutation.java` contains the correct class name and Java method signature.
- `BuildArrayFromPermutationTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `BuildArrayFromPermutation.java` - blank Java starter solution
- `BuildArrayFromPermutationTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
