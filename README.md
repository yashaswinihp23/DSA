**TOP 20 DSA COMPLEXITY INTERVIEW QUESTIONS**

1️⃣ What is Time Complexity?
Time complexity tells how the runtime increases as input size (n) increases.

2️⃣ What is Space Complexity?
Space complexity tells how much extra memory an algorithm uses.

3️⃣ Explain Big O notation.
Big O expresses the upper bound of an algorithm.

Example:
O(n²), O(n), O(log n)

4️⃣ Why constants are ignored in Big O notation?
Because Big O focuses on growth rate, not actual speed.
O(2n) = O(n)

5️⃣ What is the complexity of accessing an array element?
O(1) — constant time.

6️⃣ What is the complexity of inserting into an ArrayList?
Operation	Time
| Operation    | Time                      |
| ------------ | ------------------------- |
| Add at end   | **O(1)** amortized        |
| Add at index | **O(n)** (shift elements) |

7️⃣ What is the time complexity of HashMap?
Operation	Average	Worst
| Operation | Average | Worst |
| --------- | ------- | ----- |
| put()     | O(1)    | O(n)  |
| get()     | O(1)    | O(n)  |

Worst case occurs when all keys go to the same bucket.

8️⃣ What is the complexity of binary search?
O(log n) — input is halved each step.

9️⃣ What is the complexity of Bubble Sort?
Worst & Average: O(n²)
Best: O(n) (if already sorted)

1️⃣0️⃣ What is the complexity of Merge Sort?
Time: O(n log n)
Space: O(n)

1️⃣1️⃣ What is the complexity of Quick Sort?
Average: O(n log n)
Worst: O(n²)
Space: O(log n) (recursive stack)

1️⃣2️⃣ What is the complexity of removing from a LinkedList?
If node reference known → O(1)
If searching needed → O(n)

1️⃣3️⃣ What is the complexity of searching in an unsorted array?
O(n) — must check each element.

1️⃣4️⃣ What is the complexity of searching in a sorted array?
With binary search → O(log n)

1️⃣5️⃣ What is the complexity of checking if a number exists in a HashSet?
O(1) average, O(n) worst.

1️⃣6️⃣ What is the complexity of BFS / DFS?
Time: O(V + E)
Space: O(V)

V = nodes, E = edges

1️⃣7️⃣ What is the complexity of Dijkstra's algorithm?
Using PriorityQueue (Java):

O(E log V)

1️⃣8️⃣ What is recursion space complexity?
Depends on depth of call stack

Example:
Factorial recursion → O(n) space

1️⃣9️⃣ What is the complexity of string concatenation in Java?
str1 + str2 creates new string → O(n)

Better: use StringBuilder → O(1) amortized append.

2️⃣0️⃣ What is amortized analysis?
Average complexity over many operations.

Example:
ArrayList resizing:
Most inserts → O(1)
Resize step → O(n)
Overall → O(1) amortized

# Fast Cheat Sheet

| Operation         | Complexity |
| ----------------- | ---------- |
| Array access      | O(1)       |
| Loop              | O(n)       |
| Nested loop       | O(n²)      |
| Binary Search     | O(log n)   |
| Merge Sort        | O(n log n) |
| BFS/DFS           | O(V+E)     |
| HashMap           | O(1)       |
| Tree traversal    | O(n)       |
| PriorityQueue ops | O(log n)   |
