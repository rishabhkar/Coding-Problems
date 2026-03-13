# 75. Sort Colors

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Primary Topic: Two Pointers
- Folder Path: `leetcode/medium/two_pointers/75_sort_colors`
- Folder Name: `75_sort_colors`
- Official Link: https://leetcode.com/problems/sort-colors/

## Problem Overview
Sort the array of 0s, 1s, and 2s in place without using library sort.

## Java Starter Signature
```java
public void sortColors(int[] nums)
```


## Suggested Test Cases
1. `nums = [2,0,2,1,1,0] -> [0,0,1,1,2,2]`
2. `nums = [2,0,1] -> [0,1,2]`
3. `nums = [0] -> [0]`

## What To Watch For
- Move the pointer that can actually improve the answer instead of advancing both blindly.
- Sorted input often enables duplicate skipping and targeted pointer motion.
- Test very small inputs because pointer crossings are a common source of bugs.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `SortColors.java` contains the correct class name and Java method signature.
- `SortColorsTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `SortColors.java` - blank Java starter solution
- `SortColorsTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
