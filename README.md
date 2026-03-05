# 🔁 Palindrome Checker Application
### Progressive Java Architecture & Algorithm Evolution Project

---

## 📌 Overview
The **Palindrome Checker Application** is a structured Java project that demonstrates the systematic evolution of palindrome validation techniques --- from foundational logic to advanced software design patterns and performance benchmarking.

This repository reflects a clean engineering progression:

**Basic Logic** → **Data Structures** → **Recursion** → **Object-Oriented Design** → **Strategy Pattern** → **Algorithm Benchmarking**

It is designed as both a data structures learning project and a software architecture maturity demonstration.

---

## 🚀 Use Case Evolution (UC1 -- UC13)

### 🔹 Level 1: Foundations
* **UC1 --- Application Entry & Welcome Message**
    * Application bootstrap, console-based execution, and environment verification.
* **UC2 --- Hard-Coded Palindrome Result**
    * Boolean result handling and conditional output demonstration.
* **UC3 --- String Reverse-Based Validation**
    * `StringBuilder.reverse()` and direct string comparison.
* **UC4 --- Character Array-Based Validation**
    * `toCharArray()` with two-pointer indexing logic for symmetric comparison.

### 🔹 Level 2: Data Structures Exploration
* **UC5 --- Stack-Based Palindrome Checker**
    * Uses `java.util.Stack` (LIFO) for reverse-order validation.
    * **Time:** $O(n)$ | **Space:** $O(n)$
* **UC6 --- Queue + Stack-Based Checker**
    * FIFO vs. LIFO comparison and behavioral contrast of DS operations.
* **UC7 --- Deque-Based Optimized Checker**
    * `ArrayDeque` for double-ended comparison.
    * **Time:** $O(n)$ | **Space:** $O(1)$
* **UC8 --- Linked List-Based Checker**
    * `LinkedList` node traversal and dynamic memory-based validation.

### 🔹 Level 3: Advanced Logic & Refinement
* **UC9 --- Recursive Palindrome Checker**
    * Base condition handling and call stack behavior analysis.
    * **Time:** $O(n)$ | **Space:** $O(n)$
* **UC10 --- Case-Insensitive & Space-Ignored Validation**
    * Regex preprocessing and input normalization.
    * *Example:* `"A man a plan a canal Panama"`

### 🔹 Level 4: Software Architecture
* **UC11 --- Object-Oriented Palindrome Service**
    * Encapsulation and Single Responsibility Principle (SRP).
    * Introduces `PalindromeChecker.java`.
* **UC12 --- Strategy Pattern Implementation**
    * `PalindromeStrategy` interface for runtime algorithm selection.
    * **Strategies:** `StackStrategy`, `TwoPointerStrategy`.
    * **Design Principle:** Open for extension, closed for modification.
* **UC13 --- Performance Benchmarking**
    * Uses `System.nanoTime()` for execution time measurement and algorithm comparison.

---

## 🏗 Final Project Structure

```text
App/src/
│
├── PalindromeCheckerApp.java   # Main Driver
├── PalindromeChecker.java      # Service Class
├── PalindromeStrategy.java     # Interface
├── StackStrategy.java          # Implementation A
└── TwoPointerStrategy.java     # Implementation B

```

* * * * *

📊 Complexity Comparison
------------------------

| Approach | Time Complexity | Space Complexity | Notes |
| --- | --- | --- | --- |
| **Reverse String** | O(n) | O(n) | Uses temporary reversed string |
| **Character Array** | O(n) | O(1) | Efficient two-pointer logic |
| **Stack** | O(n) | O(n) | Extra memory for stack nodes |
| **Queue + Stack** | O(n) | O(n) | Dual structure validation |
| **Deque** | O(n) | O(1) | Clean & optimized |
| **Linked List** | O(n) | O(n) | Node traversal overhead |
| **Recursion** | O(n) | O(n) | Call stack depth overhead |
| **Two Pointer** | O(n) | O(1) | Most memory efficient |

* * * * *

📈 Engineering Progression
--------------------------

This project intentionally mirrors real-world software growth:

1.  **Stage 1** --- Basic validation

2.  **Stage 2** --- Data structure exploration

3.  **Stage 3** --- Recursive approach

4.  **Stage 4** --- OOP refactoring

5.  **Stage 5** --- Strategy pattern architecture

6.  **Stage 6** --- Benchmark-driven evaluation

* * * * *

🛠 How to Run
-------------

1.  **Clone the repository:**

    Bash

    ```
    git clone https://github.com/Nishant-codess/PalindromeCheckerApp

    ```

2.  **Open** in your preferred IDE (IntelliJ / Eclipse / VS Code).

3.  **Navigate to:** `App/src/PalindromeCheckerApp.java`.

4.  **Run** the `main()` method.

* * * * *

👨‍💻 Author
------------

**Nishant Ranjan** *B.Tech CSE* *Backend Development - Algorithm Engineering - System Design*

<p align="center"> If you found this useful, consider ⭐ starring the repository. </p>
