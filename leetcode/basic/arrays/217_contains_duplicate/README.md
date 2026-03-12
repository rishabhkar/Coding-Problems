# 217. Contains Duplicate

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Topic: Arrays
- Bucket: Basic
- Folder: `217_contains_duplicate`
- Official Link: https://leetcode.com/problems/contains-duplicate/

## Problem Description
Decide whether any value appears at least twice in the array. Return `true` as soon as a duplicate exists; otherwise return `false`.

## Input / Output Understanding
- Input: An integer array that may be empty, unique, or contain repeated values.
- Output: Return `true` if one or more numbers appear more than once; otherwise return `false`.

## Worked Examples
### Example 1
- Input: `nums = [1,2,3,1]`
- Output: `true`
- Why: The value `1` appears twice.

### Example 2
- Input: `nums = [1,2,3,4]`
- Output: `false`
- Why: Every value is distinct, so there is no duplicate.

## Edge Cases Worth Testing
- Empty and one-element arrays must return `false`.
- Duplicates may be adjacent or far apart.
- Negative values and very large integers still count normally.
- All values the same should return `true` immediately.

## Implementation Notes
- A hash set is the clearest basic solution.
- If a number is already in the set, you can stop early.
- This problem is good practice for frequency checks and membership testing.

## Folder Contents
- `ContainsDuplicate.java` — the main logic class
- `ContainsDuplicateTest.java` — edge-focused regression tests
- `README.md` — problem notes and revision-friendly context
