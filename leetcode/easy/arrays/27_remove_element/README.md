# 27. Remove Element

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/arrays/27_remove_element`
- Folder Name: `27_remove_element`
- Official Link: https://leetcode.com/problems/remove-element/

## Problem Overview
Remove every occurrence of val in place and return how many values remain in the front of the array.

## Java Starter Signature
```java
public int removeElement(int[] nums, int val)
```


## Suggested Test Cases
1. `nums = [3,2,2,3], val = 3 -> k = 2, prefix [2,2]`
2. `nums = [0,1,2,2,3,0,4,2], val = 2 -> k = 5, prefix [0,1,3,0,4]`
3. `nums = [1], val = 1 -> k = 0, prefix []`

## What To Watch For
- Check small lengths like 0, 1, and 2 before assuming a longer scan is possible.
- Be careful with in-place updates so you do not overwrite values you still need to read.
- Watch for off-by-one errors when returning a new length or slicing a kept prefix.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `RemoveElement.java` contains the correct class name and Java method signature.
- `RemoveElementTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `RemoveElement.java` - blank Java starter solution
- `RemoveElementTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
