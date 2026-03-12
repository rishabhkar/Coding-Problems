# 724. Find Pivot Index

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Topic: Arrays
- Bucket: Basic
- Folder: `724_find_pivot_index`
- Official Link: https://leetcode.com/problems/find-pivot-index/

## Problem Description
Find the leftmost index where the sum of values on the left equals the sum of values on the right. If no such index exists, return `-1`.

## Input / Output Understanding
- Input: An integer array that can include positive numbers, negative numbers, and zero.
- Output: Return the first valid pivot index, or `-1` if the array has no pivot.

## Worked Examples
### Example 1
- Input: `nums = [1,7,3,6,5,6]`
- Output: `3`
- Why: The left sum `1 + 7 + 3` equals the right sum `5 + 6`.

### Example 2
- Input: `nums = [1,2,3]`
- Output: `-1`
- Why: No position balances the array.

## Edge Cases Worth Testing
- A one-element array has pivot index `0`.
- If multiple pivots exist, return the leftmost one.
- Negative numbers can still balance correctly.
- A pivot may sit at the beginning or the end because an empty side sums to zero.

## Implementation Notes
- Keep the total sum and a running left sum while scanning once.
- For index `i`, the right sum is `total - leftSum - nums[i]`.
- This is a beginner-friendly use of prefix-sum thinking.

## Folder Contents
- `FindPivotIndex.java` — the main logic class
- `FindPivotIndexTest.java` — edge-focused regression tests
- `README.md` — problem notes and revision-friendly context
