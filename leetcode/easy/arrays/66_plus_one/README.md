# 66. Plus One

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/arrays/66_plus_one`
- Folder Name: `66_plus_one`
- Official Link: https://leetcode.com/problems/plus-one/

## Problem Overview
Add one to the large integer represented by the array of digits.

## Java Starter Signature
```java
public int[] plusOne(int[] digits)
```


## Suggested Test Cases
1. `digits = [1,2,3] -> [1,2,4]`
2. `digits = [4,3,2,1] -> [4,3,2,2]`
3. `digits = [9] -> [1,0]`

## What To Watch For
- Check small lengths like 0, 1, and 2 before assuming a longer scan is possible.
- Be careful with in-place updates so you do not overwrite values you still need to read.
- Watch for off-by-one errors when returning a new length or slicing a kept prefix.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `PlusOne.java` contains the correct class name and Java method signature.
- `PlusOneTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `PlusOne.java` - blank Java starter solution
- `PlusOneTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
