# Multithreaded Task Scheduler (Java)

## 📌 Overview

This project is a multithreaded task scheduler built using core Java concurrency concepts. It supports parallel task execution, priority-based scheduling, and delayed/periodic task execution using thread pools.

---

## 🚀 Features

* Multithreaded task execution using thread pools
* Priority-based task scheduling
* Delayed task execution
* Periodic (repeating) task execution
* Task status tracking (PENDING, RUNNING, COMPLETED)
* Graceful shutdown of threads

---

## 🧠 Concepts Used

* Java Multithreading
* ExecutorService & ThreadPoolExecutor
* ScheduledExecutorService
* BlockingQueue (PriorityBlockingQueue)
* Synchronization & thread safety
* Producer–Consumer pattern

---

## 🏗️ Project Structure

```
src/
 ├── task/
 │     ├── Task.java
 │     ├── TaskStatus.java
 │
 ├── scheduler/
 │     ├── TaskScheduler.java
 │
 ├── main/
 │     ├── Main.java
```

---

## ⚙️ How It Works

* Tasks are created with a priority level
* Tasks are submitted to a thread pool
* A priority queue ensures higher priority tasks execute first
* Scheduled executor handles delayed and periodic tasks
* System shuts down gracefully after execution

---

## ▶️ How to Run

1. Clone the repository
2. Open in any Java IDE (IntelliJ / Eclipse)
3. Compile the project
4. Run the `Main` class

---

## 📊 Sample Output

```
Task 2 [Priority: 5] is RUNNING on pool-1-thread-1
Task 4 [Priority: 4] is RUNNING on pool-1-thread-2
Task 1 [Priority: 2] is RUNNING on pool-1-thread-3
Task 2 is COMPLETED on pool-1-thread-1
```

---

## 💡 Future Improvements

* Add REST API (Spring Boot integration)
* Add GUI dashboard (JavaFX)
* Persist tasks using database
* Add retry mechanism for failed tasks

---

## 📎 Author

Aryan Raj
