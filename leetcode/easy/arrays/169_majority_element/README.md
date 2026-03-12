# 169. Majority Element

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Topic: Arrays
- Bucket: Basic
- Folder: `169_majority_element`
- Official Link: https://leetcode.com/problems/majority-element/

## Problem Description
Find the value that appears more than half the time in the array. The problem guarantees that such a majority element exists.

## Input / Output Understanding
- Input: An integer array `nums` with a guaranteed majority element.
- Output: Return the element whose frequency is strictly greater than `n / 2`.

## Worked Examples
### Example 1
- Input: `nums = [3,2,3]`
- Output: `3`
- Why: The value `3` appears two out of three times, which is more than half.

### Example 2
- Input: `nums = [2,2,1,1,1,2,2]`
- Output: `2`
- Why: Even though several values repeat, only `2` exceeds the half-way threshold.

## Edge Cases Worth Testing
- A one-element array trivially makes that value the majority.
- The majority value may be negative or zero.
- The majority can be concentrated early, late, or spread throughout the array.
- Because existence is guaranteed, the final candidate is always valid.

## Implementation Notes
- The Boyer-Moore voting algorithm is the standard O(1)-space approach.
- Pairs of different values cancel each other conceptually.
- This problem is a good example of turning frequency insight into a streaming method.

## Folder Contents
- `MajorityElement.java` — the main logic class
- `MajorityElementTest.java` — edge-focused regression tests
- `README.md` — problem notes and revision-friendly context
