# 121. Best Time to Buy and Sell Stock

## Metadata
- Platform: LeetCode
- Difficulty: Easy
- Topic: Arrays
- Bucket: Basic
- Folder: `121_best_time_to_buy_and_sell_stock`
- Official Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

## Problem Description
Each array element represents the stock price on a given day. Choose one day to buy and a later day to sell so that the profit is maximized; if no profit is possible, return `0`.

## Input / Output Understanding
- Input: An array `prices` where `prices[i]` is the stock price on day `i`.
- Output: Return the best profit from one buy followed by one later sell.

## Worked Examples
### Example 1
- Input: `prices = [7,1,5,3,6,4]`
- Output: `5`
- Why: Buy at `1` and sell later at `6`.

### Example 2
- Input: `prices = [7,6,4,3,1]`
- Output: `0`
- Why: Because prices only fall, the best move is to avoid trading.

## Edge Cases Worth Testing
- A single day cannot produce a profit.
- Strictly decreasing prices should return `0`.
- The lowest buy price might appear after an early peak.
- Profit must respect time order: sell after buy, never before.

## Implementation Notes
- Track the lowest price seen so far while scanning once from left to right.
- At each day, compare the profit from selling today against the best answer so far.
- This is a core interview pattern for running minimum plus derived value.

## Folder Contents
- `BestTimeToBuyAndSellStock.java` — the main logic class
- `BestTimeToBuyAndSellStockTest.java` — edge-focused regression tests
- `README.md` — problem notes and revision-friendly context
