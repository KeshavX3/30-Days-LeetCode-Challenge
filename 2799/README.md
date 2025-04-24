# 🎯 LeetCode Problem 2799: Count Complete Subarrays

<div align="center">
  <img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium">
  <img src="https://img.shields.io/badge/Topic-Array-blue" alt="Topic: Array">
  <img src="https://img.shields.io/badge/Approach-Brute%20Force-orange" alt="Approach: Brute Force">
</div>

## 📝 Problem Description
Given an array of integers, we need to count the number of complete subarrays. A complete subarray is defined as a contiguous subarray that contains all unique elements present in the original array.

## 🧠 Algorithm Approach
### Step 1: Identify Unique Elements
- First, we need to find all unique elements in the array
- This helps us know what elements must be present in a complete subarray

### Step 2: Count Complete Subarrays
- We need to check all possible subarrays
- For each subarray, we verify if it contains all unique elements
- If it does, we increment our count

## 🔍 Dry Run Example
Let's take an example array: `[1, 3, 1, 2, 2]`

### Step 1: Find Unique Elements
```plaintext
Array: [1, 3, 1, 2, 2]
Unique Elements: {1, 2, 3}
Total Unique Elements = 3
```

### Step 2: Check All Subarrays
| Start Index | Subarray | Status | Reason |
|------------|----------|--------|--------|
| 0 | [1] | ❌ | Missing 2,3 |
| 0 | [1,3] | ❌ | Missing 2 |
| 0 | [1,3,1] | ❌ | Missing 2 |
| 0 | [1,3,1,2] | ✅ | Complete |
| 0 | [1,3,1,2,2] | ✅ | Complete |
| 1 | [3] | ❌ | Missing 1,2 |
| 1 | [3,1] | ❌ | Missing 2 |
| 1 | [3,1,2] | ✅ | Complete |
| 1 | [3,1,2,2] | ✅ | Complete |
| 2 | [1] | ❌ | Missing 2,3 |
| 2 | [1,2] | ❌ | Missing 3 |
| 2 | [1,2,2] | ❌ | Missing 3 |
| 3 | [2] | ❌ | Missing 1,3 |
| 3 | [2,2] | ❌ | Missing 1,3 |
| 4 | [2] | ❌ | Missing 1,3 |

### 📊 Final Count
Total complete subarrays = 4
1. `[1,3,1,2]`
2. `[1,3,1,2,2]`
3. `[3,1,2]`
4. `[3,1,2,2]`

## ⚡ Complexity Analysis
### Time Complexity
- Finding unique elements: O(n)
- Checking all subarrays: O(n²)
- **Overall Time Complexity: O(n²)**

### Space Complexity
- Storing unique elements: O(n)
- **Overall Space Complexity: O(n)**

## 📸 Screenshots
### LeetCode Question
image.png

### Submission Results
image.png

## 💡 Notes
- This is a brute-force approach suitable for small input sizes
- For larger arrays, consider optimizing with a sliding window technique
- The solution should handle edge cases like:
  - Single element arrays
  - Arrays with all identical elements
  - Arrays with all unique elements

<div align="center">
  <sub>Made with ❤️ for LeetCode</sub>
</div> 