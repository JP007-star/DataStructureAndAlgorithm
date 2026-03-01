REAL-TIME SYSTEM DESIGN QUESTIONS (5+ YOE)
🧠 Memory Optimization
1-Your application is running out of memory under load.
-How will you identify the memory leak?
-What tools will you use?
2-How would you design an in-memory cache without causing OOM?
Eviction strategy?
TTL handling?
3-When would you avoid caching completely?

⚙️ Multithreading / Concurrency (Booking App Focus)
4-Design a seat booking system where multiple users book the same seat.
How do you avoid double booking?
5-How would you handle race conditions in a payment or booking flow?
Where would you use:
 Synchronized
 Locks
 Database transactions
6-How do you decide thread pool size in a high-traffic application?

📍 Proximity / Search Systems
7-Design a nearby search feature (restaurants / drivers / ATMs).
8-How do you store location data?
9-How do you query efficiently?
10-How would you scale proximity search for millions of users?
11-How do you keep location data fresh without overloading the system?

🚀 Performance & Scalability
12-Your booking API latency increased suddenly.
13-How will you debug?
14-How do you identify CPU vs memory vs DB bottleneck?
15-How would you design rate limiting for booking requests?

🗄️ Database & Consistency
16-How do you ensure data consistency across services in booking + payment?
17-When would you use optimistic vs pessimistic locking?
18-How do you handle partial failures in distributed transactions?

🧩 Trade-Off Questions (Very Important)
19-Cache vs DB — where to store seat availability?
20-In-memory vs distributed cache — when to choose what?
21-Strong consistency vs availability — what do you sacrifice?

🛠️ Production & Debugging
22-A production issue happened during peak booking time.
What are your first 30 minutes of actions?


CORE JAVA CODING QUESTIONS – MOST ASKED (5+ YEARS)
STRING & CHARACTER PROBLEMS (EVERY INTERVIEW)
1. Reverse a String without using reverse()
2. Check if a String is Palindrome
3. Find first non-repeated character in a String
4. Find first repeated character in a String
5. Count frequency of each character in a String
6. Check if two Strings are Anagrams
7. Remove duplicate characters from a String
8. Find longest substring without repeating characters
9. Check if String contains only digits
10. Capitalize first letter of each word

ARRAY & NUMBER LOGIC (TRAP QUESTIONS)
11. Find second largest number in an array
12. Find missing number in array 1..n
13. Find duplicate elements in an array
14. Sort array without using sort()
15. Find all pairs with given sum
16. Move all zeros to the end
17. Find largest and smallest element in single iteration
18. Check if array is rotated and sorted
19. Find intersection of two arrays
20. Find kth largest element

STREAM API (INTERVIEW GOLD)
21. Find frequency of elements using Streams
22. Find duplicate elements using Streams
23. Find first non-repeated character using Streams
24. Sort a list in reverse order using Streams
25. Find max and min using Streams
26. Convert List to Map
27. Group employees by department
28. Find highest salary employee per department
29. Sum of salaries using reduce()
30. Find second highest number using Streams

COLLECTIONS (5+ YOE FILTER)
31. Iterate HashMap in different ways
32. Sort HashMap by keys
33. Sort HashMap by values
34. Sort custom objects using Comparator
35. Comparable vs Comparator (with code)
36. Why HashMap allows one null key
37. How HashMap handles hash collisions
38. Internal working of HashMap (Java 8)
39. Fail-fast vs Fail-safe iterators
40. Why ConcurrentHashMap is faster

MULTITHREADING (REJECTION ZONE)
41. Print even and odd numbers using two threads
42. Producer-Consumer problem
43. Create thread using Runnable vs Thread
44. What happens if start() is called twice
45. Deadlock example and prevention
46. volatile keyword example
47. synchronized vs Lock
48. ExecutorService example
49. Callable vs Runnable
50. Thread-safe Singleton implementation

OOPS CODING (DESIGN THINKING)
51. Singleton class – all versions
52. Immutable class design
53. Overriding equals() and hashCode()
54. Why composition over inheritance
55. Interface vs Abstract class (Java 8+)
56. Diamond problem example
57. Factory design pattern
58. Builder design pattern
59. Strategy design pattern example
60. SOLID principles with code
JAVA CORE – MUST-ASK INTERVIEW QUESTIONS (5+ YEARS) Part-1
OOPS (Depth matters)
1. Abstraction vs Encapsulation (real project example)
2. Interface vs Abstract class (what changed after Java 8?)
3. How is multiple inheritance achieved in Java?
4. Why is composition preferred over inheritance?
5. Can we override a static method? Why?
6. Can a constructor be overridden?
7. What is the Diamond problem? How does Java solve it?
8. SOLID principles – Single Responsibility Principle in detail

OBJECT CLASS (Favorite trap area)
9. equals() vs ==
10. Why override hashCode() when equals() is overridden?
11. Can two objects have the same hashCode but not be equal?
12. What happens if hashCode changes after putting an object in HashMap?
13. Why is String immutable?
14. How does String pool work internally?
15. Difference between String, StringBuilder, and StringBuffer

MULTITHREADING (Interview killer)
16. What is thread safety?
17. synchronized vs ReentrantLock
18. volatile keyword – real use case
19. wait() vs sleep()
20. notify() vs notifyAll()
21. What is deadlock? Give an example.
22. How to prevent deadlock?
23. Thread lifecycle
24. Callable vs Runnable
25. Future vs CompletableFuture
26. How does thread pool work internally?
27. ExecutorService vs ForkJoinPool

COLLECTIONS (Most asked)
28. HashMap internal working (Java 8)
29. Why is HashMap not thread-safe?
30. ConcurrentHashMap internal working
31. HashMap vs Hashtable vs ConcurrentHashMap
32. Why does HashMap allow one null key?
33. TreeMap vs HashMap
34. How does sorting work in TreeMap?
35. Fail-fast vs Fail-safe iterators
36. Why is entrySet() faster than keySet()?
37. How to use a custom object as a Map key?
38. Comparable vs Comparator (real use case)

EXCEPTION HANDLING
39. Checked vs Unchecked exceptions
40. try-catch-finally execution order
41. Can finally block be skipped?
42. throw vs throws
43. When and why do you create custom exceptions?
44. Exception handling best practices in REST APIs

JVM / MEMORY (Senior filter)
45. JVM vs JRE vs JDK
46. Stack vs Heap
47. What goes into Metaspace?
48. Types of Garbage Collectors
49. Minor GC vs Major GC
50. How to debug memory leaks?
51. Causes of OutOfMemoryError
52. Why finalize() is deprecated?

JAVA 8 – INTERVIEW GOLD (5+ YEARS)
LAMBDA & FUNCTIONAL INTERFACE
1. What is a functional interface?
2. Is @FunctionalInterface mandatory?
3. Can a functional interface have default methods?
4. Why were lambdas introduced?
5. Lambda vs anonymous class

STREAM API (MOST IMPORTANT)
6. Stream vs Collection
7. Intermediate vs Terminal operations
8. map() vs flatMap()
9. filter() vs map()
10. findFirst() vs findAny()
11. limit() vs skip()
12. peek() – real use case
13. forEach vs forEachOrdered
14. reduce() explained with example
15. collect() – internal working
16. groupingBy() vs partitioningBy()
17. How to remove duplicates using Stream?
18. Parallel stream – when NOT to use?
19. Stream performance vs for-loop
20. Can we reuse a stream?
21. Lazy evaluation in streams

OPTIONAL (Tricky area)
22. Why Optional was introduced?
23. orElse vs orElseGet
24. Can Optional be null?
25. Is Optional Serializable?
26. Best practices for using Optional in APIs

DATE & TIME API
27. Date vs LocalDate
28. LocalDate vs LocalDateTime
29. ZonedDateTime – real use case
30. How to convert String to LocalDate?
31. Thread safety of Java 8 Date-Time API

DEFAULT & STATIC METHODS (Interfaces)
32. Why default methods were introduced?
33. Multiple interface default method conflict – how resolved?
34. Can a default method be overridden?
35. Static methods in interface – use case?

MOST COMMON SCENARIO QUESTIONS
36. You need a thread-safe cache – what will you use?
37. You need a sorted + fast lookup map – which one?
38. Handling large data with streams – approach?
39. How to design an immutable class?
40. How to make a singleton thread-safe?
41. How to write equals() and hashCode() correctly?
42. How do you debug a production issue?
43. How do you improve performance of existing code?
SPRING BOOT INTERVIEW QUESTIONS (0 to 6+ YEARS) Part-1
BASIC (Must-not-fail)
1. What is Spring Boot?
2. Why Spring Boot over Spring MVC?
3. What problems does Spring Boot solve?
4. What is auto-configuration?
5. What is @SpringBootApplication?
6. Difference between Spring and Spring Boot?
7. What is embedded server?
8. Which servers Spring Boot supports?
9. Default port of Spring Boot?
10. How to change server port?
11. What is starter dependency?
12. Why spring-boot-starter-parent?
13. application.properties vs application.yml
14. How to run Spring Boot application?
15. What is CommandLineRunner?
16. What is ApplicationRunner?
17. What is Actuator?
18. How to enable Actuator endpoints?
19. Difference between @Component and @Bean?
20. What is Dependency Injection?
INTERMEDIATE (Most rejections happen here)
21. What is auto-configuration internally?
22. How does Spring Boot decide which beans to create?
23. What is spring.factories?
24. What is @EnableAutoConfiguration?
25. What is @ConfigurationProperties?
26. Difference between @Value and @ConfigurationProperties?
27. How profiles work in Spring Boot?
28. How to activate profiles?
29. What is @Profile?
30. How to override auto-configured beans?
31. What is externalized configuration?
32. How environment variables work in Spring Boot?
33. What is @ConditionalOnProperty?
34. What is @ConditionalOnClass?
35. What is @ConditionalOnMissingBean?
36. How to disable auto-configuration?
37. What is exclude in @SpringBootApplication?
38. What is DevTools?
39. Hot reload vs Restart
40. Difference between WAR and JAR deployment?
REST + MVC (Daily use, but deep)
41. Difference between @Controller and @RestController?
42. Difference between @RequestParam and @PathVariable?
43. What is @RequestBody?
44. What is @ResponseBody?
45. How JSON conversion happens?
46. Role of Jackson in Spring Boot?
47. What is HttpMessageConverter?
48. How to handle validation in Spring Boot?
49. Difference between @Valid and @Validated?
50. How to create custom exception?
51. What is @ControllerAdvice?

SPRING BOOT INTERVIEW QUESTIONS – PART 2 (3 to 6+ YEARS)
REST + MVC (Advanced)
52. What is @ControllerAdvice?
53. What is global exception handling?
54. What is ResponseEntity?
55. How do you return proper HTTP status codes?
56. Difference between PUT and PATCH?
57. How does file upload work in Spring Boot?
58. How multipart request handling works?
59. How pagination works in Spring Boot?
60. How sorting works in Spring Boot?
61. How to handle CORS in Spring Boot?
DATA + JPA (VERY IMPORTANT)
62. Difference between JPA and Hibernate?
63. What is Spring Data JPA?
64. CrudRepository vs JpaRepository?
65. How transactions work internally?
66. What is @Transactional?
67. Transaction propagation types?
68. Transaction isolation levels?
69. Lazy vs Eager loading?
70. What is N+1 problem?
71. How to solve N+1 problem?
72. JPQL vs Native Query?
73. How @Query works?
74. Pagination with JPA?
75. Optimistic vs Pessimistic locking?
76. What is @Version?
77. Entity lifecycle states?
78. What is dirty checking?
79. Difference between save() and saveAndFlush()?
80. How auditing works in JPA?
81. How to handle large data efficiently?
SECURITY (5+ YOE KILLER QUESTIONS)
82. What is Spring Security?
83. How authentication works?
84. How authorization works?
85. JWT authentication flow?
86. Stateless vs Stateful authentication?
87. OAuth2 basics?
88. How to secure REST APIs?
89. Role-based access control?
90. Filter vs Interceptor?
91. What is CSRF?
92. CORS vs CSRF?
93. How password encoding works?
94. What is SecurityFilterChain?
95. How custom authentication works?
96. How to secure Actuator endpoints?
97. What is OncePerRequestFilter?
98. Session management in Spring Security?
99. Token expiration handling?
100. Refresh token flow?
101. Spring Security best practices?

SPRING BOOT INTERVIEW QUESTIONS – PART-3 (6+ YEARS)
MICROSERVICES + PRODUCTION

102. How does Spring Boot fit into microservices architecture?
103. What is Config Server?
104. What is Service Discovery?
105. What is Eureka and how it works?
106. What is Feign Client?
107. What is Circuit Breaker pattern?
108. What is Resilience4j?
109. What is API Gateway?
110. How rate limiting works?
111. What is distributed tracing?
112. Logging best practices in microservices?
113. What is centralized logging?
114. Monitoring using Spring Boot Actuator?
115. Health checks in production?
116. How to Dockerize a Spring Boot application?
117. Kubernetes readiness vs liveness probes?
118. What is blue-green deployment?
119. What is zero downtime deployment?
120. What is graceful shutdown?
121. How do you handle high traffic?

REAL INTERVIEW SCENARIOS (MOST IMPORTANT)

122. Application is slow in production – how will you debug?
123. How to identify memory leaks?
124. Production exception occurred – what steps will you take?
125. Database is slow – what changes will you do?
126. High CPU usage – how to debug?
127. Thread pool tuning – how and why?
128. Connection pool tuning?
129. Timeout handling strategies?
130. Retry mechanism design?
131. What are idempotent APIs?
132. Data consistency in microservices?
133. Rollback strategy in production?
134. Schema migration strategy?
135. How to maintain backward compatibility?
136. What is feature toggle?
137. How to version REST APIs?
138. How to handle breaking changes?
139. Scaling strategy in microservices?
140. Cache design approach?
141. Redis usage in production?
142. Cache eviction strategies?
143. Cache consistency problems?
144. Async processing in Spring Boot?
145. @Async vs CompletableFuture?
146. Kafka vs RabbitMQ?
147. Message retry strategies?
148. What is DLQ (Dead Letter Queue)?
149. Exactly-once processing?
150. Eventual consistency?
151. Describe a real production issue you solved.

SQL Part-1 BASICS Interview questions(They expect perfection) 
1.1 What is SQL?
 1.2 Difference between SQL & MySQL
 1.3 What are DDL, DML, DCL, TCL? (with examples)
 1.4 Difference between DELETE vs TRUNCATE vs DROP
 1.5 What is a Primary Key?
 1.6 Can a table have multiple primary keys?
 1.7 Primary Key vs Unique Key
 1.8 Can a Primary Key be NULL?
 1.9 What is a Foreign Key?
 1.10 What happens if a foreign key constraint fails?
 1.11 What is NOT NULL constraint?

🔗 2️ JOINS (Interviewers LOVE joins)
Weak joins = rejection guaranteed
2.1 Types of JOINs
 2.2 INNER JOIN vs LEFT JOIN
 2.3 LEFT JOIN vs RIGHT JOIN
 2.4 FULL OUTER JOIN — does MySQL support it?
 2.5 What is Self Join? (real-world example)
 2.6 JOIN vs Subquery — which is better & why?
 2.7 What happens if JOIN condition is missing?
 2.8 Fetch records present in one table but not another

📊 3️ GROUP BY & AGGREGATES (High frequency)
Logic clarity tested here 🧠
3.1 WHERE vs HAVING
 3.2 Can we use WHERE with aggregate functions?
 3.3 What is GROUP BY?
 3.4 Find second highest salary
 3.5 Find Nth highest salary
 3.6 Count duplicate records
 3.7 Fetch employees having same salary
 3.8 Find department-wise highest salary
 3.9 Can GROUP BY work without aggregate?

🪟 4️ WINDOW FUNCTIONS (5+ YOE 🔥)
Senior vs Junior separator ⚔️
4.1 What is a Window Function?
 4.2 ROW_NUMBER vs RANK vs DENSE_RANK
 4.3 Find duplicate records using window functions
 4.4 Fetch top 3 records per group
 4.5 GROUP BY vs Window Functions
 4.6 What is OVER() clause?
 4.7 Use of PARTITION BY
 4.8 Running total using SQL

⚙️ 5️ INDEXING (VERY IMPORTANT)
Wrong answer = performance killer ❌
5.1 What is an Index?
 5.2 Why do we need indexing?
 5.3 Types of indexes
 5.4 Clustered vs Non-clustered index
 5.5 Can a table have multiple clustered indexes?
 5.6 When index should NOT be used?
 5.7 Does index slow down INSERT/UPDATE?
 5.8 How index improves performance internally?
 5.9 Index vs Primary Key

🧾 6️ NORMALIZATION & DATABASE DESIGN
Real-world thinking required
6.1 What is normalization?
 6.2 Types of normalization (1NF–5NF)
 6.3 Difference between 2NF & 3NF
 6.4 What is denormalization?
 6.5 When do you denormalize?
 6.6 OLTP vs OLAP
 6.7 Star schema vs Snowflake schema

🔒 7️ TRANSACTIONS & ACID
Backend dev must-know 😬
7.1 What is a transaction?
 7.2 What is ACID?
 7.3 What is COMMIT & ROLLBACK?
 7.4 What is SAVEPOINT?
 7.5 What happens if system crashes during transaction?
 7.6 Can DDL be rolled back?
 7.7 Auto-commit — good or bad?

🔐 8️ LOCKING & ISOLATION LEVELS (Advanced)
Product companies love this 💀
8.1 What is locking?
 8.2 Types of locks
 8.3 What is dirty read?
 8.4 What is non-repeatable read?
 8.5 What is phantom read?
 8.6 Transaction isolation levels
 8.7 Default isolation level in MySQL / Postgres
 8.8 How to avoid deadlocks?
 
 SQL INTERVIEW QUESTIONS – PART 2 (Advanced + Real World)
⚡ 9️ PERFORMANCE & OPTIMIZATION (REAL INTERVIEW WEAPON)
This is where hiring managers get impressed 😎
9.1 How do you optimize slow SQL queries?
 9.2 How do you identify slow queries in production?
 9.3 What is an EXPLAIN plan and how do you read it?
 9.4 Difference between EXISTS vs IN
 9.5 Which is faster: JOIN or Subquery? (and WHY)
 9.6 How to optimize queries on very large tables?
 9.7 Pagination: OFFSET vs Keyset pagination
 9.8 Why SELECT * is considered bad practice?
 9.9 How do you handle millions of records efficiently?
👉 Expect follow-ups on indexes, execution plan, query cost

🧩 🔟 SCENARIO-BASED QUESTIONS (Deadly 🔥)
They test thinking, not SQL syntax
10.1 Fetch duplicate rows but keep only one
 10.2 Delete duplicate records safely
 10.3 Swap two column values without temp variable
 10.4 Find missing IDs in a sequence
 10.5 Fetch last 10 records without using LIMIT
 10.6 Employees who never got a salary hike
 10.7 Find highest salary without using MAX()
 10.8 Records common in two tables
 10.9 Records unique to each table
 10.10 Consecutive login days problem

🎯 1️⃣1️⃣ SQL IN REAL PROJECTS (Java / Spring Boot)
This decides L2 / L3 rounds
11.1 How is SQL used in your current project?
 11.2 How do you handle DB transactions in Spring Boot?
 11.3 What is the N+1 problem and how did you fix it?
 11.4 How indexing improved performance in your project?
 11.5 Deadlock issue you faced and how you resolved it
 11.6 Pagination strategy used in real APIs
 11.7 Data consistency vs performance — how do you balance?

