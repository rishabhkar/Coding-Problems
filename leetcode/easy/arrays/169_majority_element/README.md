# 169. Majority Element

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/arrays/169_majority_element`
- Folder Name: `169_majority_element`
- Official Link: https://leetcode.com/problems/majority-element/

## Problem Overview
Return the value that appears more than half the time in the array.

## Java Starter Signature
```java
public int majorityElement(int[] nums)
```


## Suggested Test Cases
1. `nums = [3,2,3] -> 3`
2. `nums = [2,2,1,1,1,2,2] -> 2`
3. `nums = [1] -> 1`

## What To Watch For
- Check small lengths like 0, 1, and 2 before assuming a longer scan is possible.
- Be careful with in-place updates so you do not overwrite values you still need to read.
- Watch for off-by-one errors when returning a new length or slicing a kept prefix.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `MajorityElement.java` contains the correct class name and Java method signature.
- `MajorityElementTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `MajorityElement.java` - blank Java starter solution
- `MajorityElementTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
