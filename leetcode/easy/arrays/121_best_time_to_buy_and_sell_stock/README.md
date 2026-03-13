# 121. Best Time to Buy and Sell Stock

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Primary Topic: Arrays
- Folder Path: `leetcode/easy/arrays/121_best_time_to_buy_and_sell_stock`
- Folder Name: `121_best_time_to_buy_and_sell_stock`
- Official Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

## Problem Overview
Find the maximum profit from one buy followed by one sell, or return 0 if no profit is possible.

## Java Starter Signature
```java
public int maxProfit(int[] prices)
```


## Suggested Test Cases
1. `prices = [7,1,5,3,6,4] -> 5`
2. `prices = [7,6,4,3,1] -> 0`
3. `prices = [2,4,1] -> 2`

## What To Watch For
- Check small lengths like 0, 1, and 2 before assuming a longer scan is possible.
- Be careful with in-place updates so you do not overwrite values you still need to read.
- Watch for off-by-one errors when returning a new length or slicing a kept prefix.

## Starter File Status
This folder is prepared as a starter workspace for solving the problem yourself.

- `BestTimeToBuyAndSellStock.java` contains the correct class name and Java method signature.
- `BestTimeToBuyAndSellStockTest.java` contains scaffold test-case notes that you can convert into real assertions after implementing the solution.
- `README.md` gives you a quick revision-friendly summary before you start coding.

## Folder Contents
- `BestTimeToBuyAndSellStock.java` - blank Java starter solution
- `BestTimeToBuyAndSellStockTest.java` - starter test scaffold
- `README.md` - detailed problem notes and folder guide
