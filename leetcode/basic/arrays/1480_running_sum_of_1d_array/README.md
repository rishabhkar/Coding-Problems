# 1480. Running Sum of 1D Array

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Topic: Arrays
- Bucket: Basic
- Folder: `1480_running_sum_of_1d_array`
- Official Link: https://leetcode.com/problems/running-sum-of-1d-array/

## Problem Description
For each position in the array, compute the sum of all values from the beginning up to that position. Return the resulting running-sum array.

## Input / Output Understanding
- Input: An integer array `nums`.
- Output: An array where index `i` contains the sum of `nums[0]` through `nums[i]`.

## Worked Examples
### Example 1
- Input: `nums = [1,2,3,4]`
- Output: `[1,3,6,10]`
- Why: Each entry accumulates everything before it plus the current value.

### Example 2
- Input: `nums = [3,1,2,10,1]`
- Output: `[3,4,6,16,17]`
- Why: The prefix total keeps growing as you move right.

## Edge Cases Worth Testing
- A one-element array should return the same single value.
- Zeroes should preserve the current running total.
- Negative values can make the running total decrease.
- An empty array is easy to support even if the online judge does not usually send one.

## Implementation Notes
- This is one of the simplest prefix-sum style problems.
- A separate output array keeps the original data unchanged.
- It is great practice for translating index-based definitions into code.

## Folder Contents
- `RunningSumOf1DArray.java` — the main logic class
- `RunningSumOf1DArrayTest.java` — edge-focused regression tests
- `README.md` — problem notes and revision-friendly context
