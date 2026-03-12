# 26. Remove Duplicates from Sorted Array

## Difficulty

## Topics
- Array
- Two Pointers

## Problem Statement

Given an integer array `nums` sorted in non-decreasing order, remove the duplicates **in-place** such that each unique element appears only once.

The relative order of the elements must remain the same.

Let the number of unique elements be `k`.

Your task is to:

- modify the array `nums` in-place so that the first `k` elements contain the unique elements in sorted order
- return `k`

The elements beyond index `k - 1` do not matter.

---

## Function Signature
```text
int removeDuplicates(int[] nums)
```

---

## Expected Behavior

After calling the function:

* the returned value should be `k`
* the first `k` elements of `nums` should contain the unique values in sorted order

---

## Custom Judge

The solution will be tested using logic similar to the following:

```text
int[] nums = { /* input */ };          // Input array
int[] expectedNums = { /* expected */ };  // Expected answer

int k = removeDuplicates(nums);

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
```

If all assertions pass, the solution is accepted.

---

## Examples

### Example 1

**Input**

```text
nums = [1,1,2]
```

**Output**

```text
2, nums = [1,2,_]
```

**Explanation**

Your function should return `k = 2`, with the first two elements of `nums` being `1` and `2`.

It does not matter what values remain after index `k - 1`.

---

### Example 2

**Input**

```text
nums = [0,0,1,1,1,2,2,3,3,4]
```

**Output**

```text
5, nums = [0,1,2,3,4,_,_,_,_,_]
```

**Explanation**

Your function should return `k = 5`, with the first five elements of `nums` being `0`, `1`, `2`, `3`, and `4`.

It does not matter what values remain after index `k - 1`.

---

## Constraints

```text
1 <= nums.length <= 3 * 10^4
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order
```

---

## Notes

* The array must be modified **in-place**
* You must use only **O(1)** extra space
* Since the array is already sorted, duplicates will always appear next to each other

---

## Source

Copied from: [Remove Duplicates from Sorted Array - LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/)


If you want, I can also 

give you a cleaner **DSA repo-style README template** with sections like **Approach, Intuition, Dry Run, Code, and Complexity**.
