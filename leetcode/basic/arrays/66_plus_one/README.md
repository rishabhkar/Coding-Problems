# 66. Plus One

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Topic: Arrays
- Bucket: Basic
- Folder: `66_plus_one`
- Official Link: https://leetcode.com/problems/plus-one/

## Problem Description
A non-negative integer is stored as an array of digits, most significant digit first. Add one to that integer and return the resulting digits array.

## Input / Output Understanding
- Input: An array `digits` where each element is a decimal digit and the array represents one whole number.
- Output: Return the digits of the number after increasing it by exactly one.

## Worked Examples
### Example 1
- Input: `digits = [1,2,3]`
- Output: `[1,2,4]`
- Why: Adding one changes only the final digit when there is no carry.

### Example 2
- Input: `digits = [9,9,9]`
- Output: `[1,0,0,0]`
- Why: A full carry creates a new leading digit.

## Edge Cases Worth Testing
- A single `9` should expand to two digits.
- Trailing runs of `9` require carry propagation.
- An input with no carry should only change the last digit.
- Leading zeroes are not expected in standard LeetCode input, but zero itself is valid.

## Implementation Notes
- Work from right to left because that is where the carry begins.
- Most cases finish as soon as a digit smaller than `9` is incremented.
- Only the all-9s case needs a new output array with extra length.

## Folder Contents
- `PlusOne.java` — the main logic class
- `PlusOneTest.java` — edge-focused regression tests
- `README.md` — problem notes and revision-friendly context
