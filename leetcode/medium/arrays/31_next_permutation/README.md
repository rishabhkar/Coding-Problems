# 31. Next Permutation

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Arrays
- Folder Path: `leetcode/medium/arrays/31_next_permutation`
- Folder Name: `31_next_permutation`
- Official Link: https://leetcode.com/problems/next-permutation/

## Problem Overview
Rearrange the array into the next lexicographically greater permutation, or the smallest order if none exists.

## Java Starter Signature
```java
public void nextPermutation(int[] nums)
```


## Suggested Test Cases
1. `nums = [1,2,3] -> [1,3,2]`
2. `nums = [3,2,1] -> [1,2,3]`
3. `nums = [1,1,5] -> [1,5,1]`

## What To Watch For
- Check small lengths like 0, 1, and 2 before assuming a longer scan is possible.
- Be careful with in-place updates so you do not overwrite values you still need to read.
- Watch for off-by-one errors when returning a new length or slicing a kept prefix.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `NextPermutation.java` contains the correct class name and Java method signature.
- `NextPermutationTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `NextPermutation.java` - blank Java starter solution
- `NextPermutationTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
