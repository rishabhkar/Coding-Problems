# Coding Problems

A long-term coding practice repository for organizing problem solutions across multiple platforms in a clean, scalable, and interview-prep-friendly structure.

## Repository goals

- keep problems grouped by **platform** first
- normalize difficulty across platforms
- organize each difficulty by reusable **topic**
- keep each future problem self-contained in its own folder

## Structure

```text
coding-problems/
├─ _templates/
├─ _notes/
├─ _unsorted/
├─ leetcode/
├─ hackerrank/
├─ spoj/
├─ codeforces/
├─ codechef/
├─ geeksforgeeks/
├─ interviewbit/
├─ atcoder/
└─ cses/
```

Each platform follows this pattern:

```text
platform/
├─ basic/
├─ easy/
├─ medium/
├─ hard/
├─ advanced/
├─ contest/
└─ uncategorized/
```

Each difficulty contains reusable topic folders such as:

- arrays
- strings
- linked_list
- stack
- queue
- deque
- hash_map
- hash_set
- trees
- binary_tree
- binary_search_tree
- heap
- priority_queue
- graph
- trie
- recursion
- backtracking
- dynamic_programming
- greedy
- sliding_window
- two_pointers
- binary_search
- sorting
- matrix
- bit_manipulation
- math
- prefix_sum
- union_find
- monotonic_stack
- monotonic_queue
- linked_hash_map
- design
- implementation
- simulation
- intervals
- geometry
- number_theory
- segment_tree
- fenwick_tree
- topological_sort
- shortest_path
- bfs
- dfs
- uncategorized

## Future problem folder pattern

Later, each problem should live inside its own folder at the topic level using this naming style:

```text
problem_number_problem_name/
```

Examples:

- `1_two_sum`
- `206_reverse_linked_list`
- `102_binary_tree_level_order_traversal`

Each Java problem folder should stay self-contained and currently follow this lightweight layout:

- `README.md`
- one Java class for the problem logic
- one Java test class with edge-case coverage

A future problem folder may contain:

- `README.md`
- solution files
- notes
- test cases

## Utility folders

- `_templates/` → reusable starter material for future problem folders
- `_notes/` → general study notes, patterns, and revision material
- `_unsorted/` → temporary holding area before a problem is fully categorized

## Note about empty folders in Git

Git does not track empty directories by itself. To preserve this directory-only structure in the remote repository, placeholder `.gitkeep` files are used in empty folders where needed.
