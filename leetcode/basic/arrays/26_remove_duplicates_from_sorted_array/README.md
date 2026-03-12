# 26. Remove Duplicates from Sorted Array

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Topic: Arrays
- Bucket: Basic
- Folder: `26_remove_duplicates_from_sorted_array`
- Official Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

## Problem Description
You are given a non-decreasing integer array. Compress it in place so that each distinct value appears only once at the front of the array, then return the count of unique values. Anything beyond the returned length is irrelevant for grading.

## Input / Output Understanding
- Input: A sorted integer array `nums` that may contain repeated values.
- Output: Return the number of unique elements, and ensure the first `k` positions of `nums` hold those unique values in sorted order.

## Worked Examples
### Example 1
- Input: `nums = [1,1,2]`
- Output: `2`, with the first two positions becoming `[1,2]`
- Why: The duplicate `1` is collapsed so only one copy remains in the kept prefix.

### Example 2
- Input: `nums = [0,0,1,1,1,2,2,3,3,4]`
- Output: `5`, with the first five positions becoming `[0,1,2,3,4]`
- Why: Every repeated block contributes a single representative to the final compacted prefix.

## Edge Cases Worth Testing
- An empty array should return `0` without failing.
- An array with one value should return `1` unchanged.
- All values the same should collapse to a single element.
- An already unique sorted array should keep its full length.

## Implementation Notes
- This is a classic in-place two-pointer problem.
- Because the array is already sorted, duplicates always appear next to each other.
- The kept prefix matters; values after the returned length do not.

## Folder Contents
- `RemoveDuplicatesFromSortedArray.java` — the main logic class
- `RemoveDuplicatesFromSortedArrayTest.java` — edge-focused regression tests
- `README.md` — problem notes and revision-friendly context
