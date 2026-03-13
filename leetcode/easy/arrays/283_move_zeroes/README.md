# 283. Move Zeroes

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/arrays/283_move_zeroes`
- Folder Name: `283_move_zeroes`
- Official Link: https://leetcode.com/problems/move-zeroes/

## Problem Overview
Move every zero to the end while keeping the relative order of non-zero values.

## Java Starter Signature
```java
public void moveZeroes(int[] nums)
```


## Suggested Test Cases
1. `nums = [0,1,0,3,12] -> [1,3,12,0,0]`
2. `nums = [0] -> [0]`
3. `nums = [4,0,5,0,0,3,0,1] -> [4,5,3,1,0,0,0,0]`

## What To Watch For
- Check small lengths like 0, 1, and 2 before assuming a longer scan is possible.
- Be careful with in-place updates so you do not overwrite values you still need to read.
- Watch for off-by-one errors when returning a new length or slicing a kept prefix.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MoveZeroes.java` contains the correct class name and Java method signature.
- `MoveZeroesTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MoveZeroes.java` - blank Java starter solution
- `MoveZeroesTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
