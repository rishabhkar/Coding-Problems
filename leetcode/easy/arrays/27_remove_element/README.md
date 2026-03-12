# 27. Remove Element

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Topic: Arrays
- Bucket: Basic
- Folder: `27_remove_element`
- Official Link: https://leetcode.com/problems/remove-element/

## Problem Description
You are given an integer array `nums` and a value `val`. Remove every occurrence of `val` in place and return how many values remain. The kept values should occupy the first `k` positions; anything after that prefix can be ignored.

## Input / Output Understanding
- Input: An integer array `nums` plus the value `val` that should be removed wherever it appears.
- Output: Return the count of values not equal to `val`, with those kept values packed into the first `k` slots of the same array.

## Worked Examples
### Example 1
- Input: `nums = [3,2,2,3], val = 3`
- Output: `2`, with a valid kept prefix of `[2,2]`

### Example 2
- Input: `nums = [0,1,2,2,3,0,4,2], val = 2`
- Output: `5`, with a valid kept prefix of `[0,1,3,0,4]`

## Starter Template Status
This folder now contains a starter template, not a completed solution.

- `RemoveElement.java` keeps the class and method signature you need to implement.
- The method body is intentionally empty apart from a TODO comment and a default `return 0;`.
- `RemoveElementTest.java` is a lightweight smoke test scaffold you can expand after writing the real solution.

## Suggested Edge Cases To Implement Later
- An empty array should return `0` immediately.
- If every value equals `val`, the returned length should be `0`.
- If `val` never appears, the full array length should be returned.
- Values to keep may be negative or zero as well as positive.

## Folder Contents
- `RemoveElement.java` - starter class with the method signature to implement
- `RemoveElementTest.java` - starter smoke test scaffold
- `README.md` - problem statement and folder notes
