# 1920. Build Array from Permutation

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Topic: Arrays
- Bucket: Basic
- Folder: `1920_build_array_from_permutation`
- Official Link: https://leetcode.com/problems/build-array-from-permutation/

## Problem Description
The input array is a permutation of the numbers `0` through `n - 1`. Build a new array `ans` where each position `i` contains `nums[nums[i]]`.

## Input / Output Understanding
- Input: A permutation array `nums`, meaning every index from `0` to `n - 1` appears exactly once.
- Output: Return a new array `ans` defined by the rule `ans[i] = nums[nums[i]]`.

## Worked Examples
### Example 1
- Input: `nums = [0,2,1,5,3,4]`
- Output: `[0,1,2,4,5,3]`
- Why: Each answer slot is filled by using the current value as the next lookup index.

### Example 2
- Input: `nums = [5,0,1,2,3,4]`
- Output: `[4,5,0,1,2,3]`
- Why: Because the array is a permutation, every nested lookup is valid.

## Edge Cases Worth Testing
- A one-element permutation should map back to itself.
- Cycles of different lengths should still be handled correctly.
- The answer can reuse indices many times, but the input is always valid.
- A reverse permutation is still fully legal input.

## Implementation Notes
- This problem is mainly about careful indexing.
- A straightforward extra-array solution is perfect for the basic bucket.
- It builds confidence with nested array access patterns.

## Folder Contents
- `BuildArrayFromPermutation.java` — the main logic class
- `BuildArrayFromPermutationTest.java` — edge-focused regression tests
- `README.md` — problem notes and revision-friendly context
