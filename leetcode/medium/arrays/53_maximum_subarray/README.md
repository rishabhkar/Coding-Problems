# 53. Maximum Subarray

## Metadata
- Platform: LeetCode
- Difficulty: Medium
- Topic: Arrays
- Bucket: Basic
- Folder: `53_maximum_subarray`
- Official Link: https://leetcode.com/problems/maximum-subarray/

## Problem Description
Given an integer array, find the contiguous subarray with the largest possible sum and return that sum. The chosen subarray must contain at least one element.

## Input / Output Understanding
- Input: An integer array that can contain positive values, negative values, and zero.
- Output: Return the maximum sum obtainable from any non-empty contiguous slice of the array.

## Worked Examples
### Example 1
- Input: `nums = [-2,1,-3,4,-1,2,1,-5,4]`
- Output: `6`
- Why: The best contiguous block is `[4,-1,2,1]`, which sums to `6`.

### Example 2
- Input: `nums = [5,4,-1,7,8]`
- Output: `23`
- Why: The whole array is the best subarray in this case.

## Edge Cases Worth Testing
- If all numbers are negative, the answer is the least negative single element.
- A one-element array must return that element.
- Large positive streaks after an early dip should still be considered.
- Zero can itself be the best answer when every other option is negative.

## Implementation Notes
- Kadane’s algorithm keeps the best running subarray ending at each position.
- This is foundational for later DP and prefix-style reasoning.
- The problem is about contiguity, not arbitrary subsets.

## Folder Contents
- `MaximumSubarray.java` — the main logic class
- `MaximumSubarrayTest.java` — edge-focused regression tests
- `README.md` — problem notes and revision-friendly context
