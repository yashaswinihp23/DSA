
# 📘 DSA Time & Space Complexity — Interview Guide

This file contains all essential **DSA complexity theory** + **20 most asked interview questions** in one clean markdown guide.

---

## ❓ What is Time Complexity?

Time complexity tells **how fast an algorithm runs** as input size `n` grows.

### Common Time Complexities

| Complexity     | Example              | Meaning                     |
| -------------- | -------------------- | --------------------------- |
| **O(1)**       | Access array element | Constant time               |
| **O(log n)**   | Binary Search        | Input decreases by half     |
| **O(n)**       | Loop from 1 to n     | Linear                      |
| **O(n log n)** | Merge Sort           | Logarithmic levels × n work |
| **O(n²)**      | Nested loops         | Quadratic                   |
| **O(2ⁿ)**      | Subset/Recursion     | Exponential                 |
| **O(n!)**      | Permutations         | Worst                       |

---

## ❓ What is Space Complexity?

Space complexity tells **how much extra memory** an algorithm uses.

### Examples

* `int a = 10;` → **O(1)**
* array of size `n` → **O(n)**
* recursion depth `n` → **O(n)**

---

# ⭐ Basic Interview Prep

## 1. What is Big-O Notation?

Big‑O represents the **upper bound** of time complexity.
Example:

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

➡️ **O(n)**

---

## 2. What is Big‑Ω (Omega)?

Represents the **best‑case** complexity.
Example: Best case in linear search → element at index 0 → **Ω(1)**.

---

## 3. What is Big‑Θ (Theta)?

Tight bound — both best and worst cases same.
Example: Printing array → **Θ(n)**.

---

# ⭐ Most Asked Coding Round Questions (20 Qs)

## **1. What is the time complexity of Binary Search?**

**O(log n)** — the array is halved each step.

## **2. What is the complexity of Merge Sort?**

* Time: **O(n log n)**
* Space: **O(n)**

## **3. What is the complexity of Quick Sort?**

* Best/Average: **O(n log n)**
* Worst (pivot worst each time): **O(n²)**
* Space: **O(log n)** recursion

## **4. Time Complexity of HashMap operations?**

* Average: **O(1)**
* Worst: **O(n)** (collision → linked list)

## **5. What is the complexity of searching in a Balanced BST?**

**O(log n)**

## **6. Time complexity of array insert at middle?**

**O(n)** (shift elements)

## **7. Time complexity of linked list insert at head?**

**O(1)**

## **8. Time complexity of linked list searching?**

**O(n)**

## **9. Space complexity of recursion?**

Depth `n` → **O(n)**

## **10. Complexity of BFS and DFS?**

* Time: **O(V + E)**
* Space: **O(V)**

## **11. Complexity of Dijkstra using Priority Queue?**

**O(E log V)**

## **12. Complexity of Heap operations?**

* Insert: **O(log n)**
* Remove max/min: **O(log n)**
* Build Heap: **O(n)**

## **13. Complexity of Two‑Pointer Technique?**

**O(n)**

## **14. Complexity of Sliding Window?**

**O(n)**

## **15. Complexity of HashSet operations?**

* Average: **O(1)**
* Worst: **O(n)**

## **16. Complexity of String concatenation using `+` in Java?**

**O(n²)** because strings are immutable.
Use `StringBuilder` → **O(n)**.

## **17. Complexity of removing from ArrayList middle?**

**O(n)**

## **18. Complexity of removing from LinkedList head?**

**O(1)**

## **19. What is Amortized Time Complexity?**

Example: ArrayList resize doubling → average **O(1)** per insert.

## **20. Complexity of Selection Sort?**

**O(n²)** always.

---

# ⭐ Real Interview Example Questions with Code

## 👉 Example 1: Find Max Element

Time: **O(n)**
Space: **O(1)**

```java
int findMax(int[] arr) {
    int max = arr[0];
    for (int i : arr) max = Math.max(max, i);
    return max;
}
```

---

## 👉 Example 2: Check if array has duplicate

Using HashSet: **O(n)** time, **O(n)** space

```java
boolean hasDuplicate(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    for (int n : arr) if (!set.add(n)) return true;
    return false;
}
```

---

## 👉 Example 3: Reverse Linked List

Time: **O(n)**, Space: **O(1)**

```java
ListNode reverse(ListNode head) {
    ListNode prev = null;
    while (head != null) {
        ListNode next = head.next;
        head.next = prev;
        prev = head;
        head = next;
    }
    return prev;
}
```

---

# Final Summary Table

| Topic                   | Complexity |
| ----------------------- | ---------- |
| Array search            | O(n)       |
| Binary Search           | O(log n)   |
| Sorting (Optimal)       | O(n log n) |
| BFS/DFS                 | O(V+E)     |
| HashMap Insert          | O(1) avg   |
| ArrayList Insert Middle | O(n)       |
| LinkedList Insert Head  | O(1)       |
| Recursion Depth         | O(n)       |

---
