# 🧠 DSA Time & Space Complexity — Top 20 Interview Questions

A clean and concise cheat sheet of the most commonly asked DSA complexity interview questions.

---

## 1️⃣ What is Time Complexity?
Time complexity describes **how the runtime of an algorithm increases** with the size of input `n`.

---

## 2️⃣ What is Space Complexity?
Space complexity measures **how much extra memory** an algorithm uses.

---

## 3️⃣ Explain Big O notation.
Big O notation represents the **upper bound** of an algorithm's growth rate.

Examples:  
`O(n²)`, `O(n)`, `O(log n)`

---

## 4️⃣ Why are constants ignored in Big O notation?
Because Big O tracks **growth**, not exact runtime.

Example:  
`O(2n)` → `O(n)`

---

## 5️⃣ What is the complexity of accessing an array element?
`O(1)` — constant time.

---

## 6️⃣ Time Complexity of inserting into an ArrayList

| Operation      | Time                |
| -------------- | ------------------- |
| Add at end     | **O(1)** amortized  |
| Add at index   | **O(n)** (shifting) |

---

## 7️⃣ Time Complexity of HashMap operations

| Operation | Average | Worst |
| --------- | ------- | ----- |
| put()     | O(1)    | O(n)  |
| get()     | O(1)    | O(n)  |

Worst case happens when all keys hash to the same bucket.

---

## 8️⃣ What is the complexity of Binary Search?
`O(log n)` — the input reduces by half each step.

---

## 9️⃣ What is the complexity of Bubble Sort?

- Worst: `O(n²)`
- Average: `O(n²)`
- Best: `O(n)` (already sorted)

---

## 1️⃣0️⃣ What is the complexity of Merge Sort?

- Time: `O(n log n)`
- Space: `O(n)`

---

## 1️⃣1️⃣ What is the complexity of Quick Sort?

- Average: `O(n log n)`
- Worst: `O(n²)`
- Space: `O(log n)` (recursion stack)

---

## 1️⃣2️⃣ What is the complexity of removing from LinkedList?

- If node reference is known → `O(1)`
- If search required → `O(n)`

---

## 1️⃣3️⃣ Searching in an unsorted array
`O(n)` — must check every element.

---

## 1️⃣4️⃣ Searching in a sorted array
Using Binary Search → `O(log n)`

---

## 1️⃣5️⃣ Checking element existence in HashSet
- Average: `O(1)`
- Worst: `O(n)`

---

## 1️⃣6️⃣ Time Complexity of BFS / DFS

- Time: `O(V + E)`
- Space: `O(V)`

Where:  
`V = vertices`, `E = edges`

---

## 1️⃣7️⃣ Time Complexity of Dijkstra’s Algorithm
Using PriorityQueue (Java):

`O(E log V)`

---

## 1️⃣8️⃣ What is recursion space complexity?
Depends on **maximum recursion depth**.

Example: factorial recursion → `O(n)` space.

---

## 1️⃣9️⃣ Time Complexity of String concatenation in Java
`str1 + str2` creates new string → `O(n)`

Better alternative: **StringBuilder.append()** → `O(1)` amortized.

---

## 2️⃣0️⃣ What is amortized analysis?
It measures **average cost over many operations**.

Example (ArrayList resizing):

- Most insertions → `O(1)`
- Occasional resize → `O(n)`
- Overall → **O(1) amortized**

---

# ⚡ Fast Complexity Cheat Sheet

| Operation         | Complexity   |
| ----------------- | ------------ |
| Array access      | O(1)         |
| Loop              | O(n)         |
| Nested loops      | O(n²)        |
| Binary Search     | O(log n)     |
| Merge Sort        | O(n log n)   |
| BFS / DFS         | O(V + E)     |
| HashMap           | O(1)*        |
| Tree traversal    | O(n)         |
| PriorityQueue ops | O(log n)     |

\* Average case

---

# ✨ End of Document
