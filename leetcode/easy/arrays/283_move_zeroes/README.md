# 283. Move Zeroes

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Topic: Arrays
- Bucket: Basic
- Folder: `283_move_zeroes`
- Official Link: https://leetcode.com/problems/move-zeroes/

## Problem Description
Rearrange the array in place so that every non-zero value keeps its relative order while all zeroes are moved to the end.

## Input / Output Understanding
- Input: An integer array that may contain zero, positive, and negative values.
- Output: Modify the same array so all non-zero values appear first in their original order, followed by all zeroes.

## Worked Examples
### Example 1
- Input: `nums = [0,1,0,3,12]`
- Output: `[1,3,12,0,0]`
- Why: The non-zero values stay in the same order while both zeroes slide to the back.

### Example 2
- Input: `nums = [0]`
- Output: `[0]`
- Why: A one-element array containing zero is already in valid form.

## Edge Cases Worth Testing
- Arrays with no zeroes should stay unchanged.
- Arrays made entirely of zeroes should also stay unchanged.
- Negative values count as non-zero values and must keep their order.
- Zeroes may appear at the front, middle, or end.

## Implementation Notes
- A write pointer can compact non-zero values first, then fill the remainder with zeroes.
- The problem is in-place, so avoid building a second array for this basic version.
- Stable ordering of non-zero values is part of the requirement.

## Folder Contents
- `MoveZeroes.java` — the main logic class
- `MoveZeroesTest.java` — edge-focused regression tests
- `README.md` — problem notes and revision-friendly context
