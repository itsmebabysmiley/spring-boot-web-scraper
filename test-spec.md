# Unit tests specification

- This readme file provide you information that you need 
to understand all the 10 unitTest methods that we had 
created.
- This project contains only 10 unit tests.

## 1. testSaveUser

1. **Identify testable functions** : `saveUser`
2.  
   - **Identify parameters** : `user (User)`
   - **return types** : `User`
   - **return values**: `Object of User`
   - **exceptional behavior** :``
3. **Model the input domain**(The characteristics developed for this test case using the techniques from Input Space Partitioning. You must create **at least** one interface-based characteristic and **at least** one functionality-based characteristic for each test case.)  
   Characteristics:

| Characteristics   | b1                     | b2                              |
|-------------------|------------------------|---------------------------------|
| variables in user | no variable is assign. | at least one variable is assign |
| user is empty     | True                   | False                           |
4. Combine partitions to define test requirements - use 
the 5 approaches to find combinations of values (ACoC, ECC, PWC, BCC, MBCC). You must apply the 5 approaches to your 10 unit test cases (thus each approach will be used in 2 unit test cases).  
   Approaches : ACoC  
   Test requirements :  2x2 = 4
   (no variable is assign, True) invalid, (no variable is assign, False), (at least one variable is assign, True) invalid, (at least one variable is assign, False)
5. Derive test values and expected values. These are the 
values that you have to use when you implement test cases in JUnit.

| Test | user                                     | Expected result            |
|------|------------------------------------------|----------------------------|
| T1   |                                          |                            |
| T2   | new User()                               | can't save to DB.          |
| T3   |                                          |                            |
| T4   | new User(); user.setUsername("john1234") | save user name John to DB. |

## 2. testFindByUsername

1. **Identify testable functions** : `findByUsername`
2.
   - **Identify parameters** : `username(String)`
   - **return types** : `Optional<User>`
   - **return values**: `Object of Optional`
   - **exceptional behavior** :``
3. **Model the input domain**(The characteristics developed for this test case using the techniques from Input Space Partitioning. You must create **at least** one interface-based characteristic and **at least** one functionality-based characteristic for each test case.)  
   Characteristics:

| Characteristics          | b1   | b2    |
|--------------------------|------|-------|
| username is exists in DB | True | False |
| username is not empty    | True | False |
4. Combine partitions to define test requirements - use
   the 5 approaches to find combinations of values (ACoC, ECC, PWC, BCC, MBCC). You must apply the 5 approaches to your 10 unit test cases (thus each approach will be used in 2 unit test cases).  
   Approaches :   ACoC
   Test requirements :  2x2 = 4
   (True, True), (True, False), (False, True), (False, False)
   
6. Derive test values and expected values. These are the
   values that you have to use when you implement test cases in JUnit.

| Test | username | Expected result |
|------|----------|-----------------|
| T1   | "user"   | True            |
| T2   | ""       | Null            |
| T3   | "Payout" | Null            |
| T4   | ""       | Null            |

## 3. testFindByEmail

1. **Identify testable functions** : `findByEmail`
2.
   - **Identify parameters** : `email (String)`
   - **return types** : `Optional<User>`
   - **return values**: `Object of Optional`
   - **exceptional behavior** :``
3. **Model the input domain**(The characteristics developed for this test case using the techniques from Input Space Partitioning. You must create **at least** one interface-based characteristic and **at least** one functionality-based characteristic for each test case.)  
   Characteristics:

| Characteristics       | b1   | b2    |
|-----------------------|------|-------|
| email is exists in DB | True | False |
| email is not empty    | True | False |
4. Combine partitions to define test requirements - use
   the 5 approaches to find combinations of values (ACoC, ECC, PWC, BCC, MBCC). You must apply the 5 approaches to your 10 unit test cases (thus each approach will be used in 2 unit test cases).  
   Approaches :   ECC
   Test requirements : 2
   (True, True), (True, False), (False, True), (False, False)  
   (True, True), (False, True)

5. Derive test values and expected values. These are the
   values that you have to use when you implement test cases in JUnit.

| Test | email              | Expected result |
|------|--------------------|-----------------|
| T1   | "user@mail.com"    | True            |
| T@   | "payout@gmail.com" | False           |
|      |                    |                 |
|      |                    |                 |


## 4. testFindByTag

1. **Identify testable functions** : `findByTag`
2.
   - **Identify parameters** : `tag(String)`
   - **return types** : `Optional<Tag>`
   - **return values**: `Object of Optional`
   - **exceptional behavior** :``
3. **Model the input domain**(The characteristics developed for this test case using the techniques from Input Space Partitioning. You must create **at least** one interface-based characteristic and **at least** one functionality-based characteristic for each test case.)  
   Characteristics:

| Characteristics       | b1   | b2    |
|-----------------------|------|-------|
| email is exists in DB | True | False |
| email is not empty    | True | False |
4. Combine partitions to define test requirements - use
   the 5 approaches to find combinations of values (ACoC, ECC, PWC, BCC, MBCC). You must apply the 5 approaches to your 10 unit test cases (thus each approach will be used in 2 unit test cases).  
   Approaches :   
   Test requirements :

5. Derive test values and expected values. These are the
   values that you have to use when you implement test cases in JUnit.

| Test | user | Expected result |
|------|------|-----------------|
|      |      |                 |
|      |      |                 |
|      |      |                 |
|      |      |                 |


## 5.

1. **Identify testable functions** : ``
2.
   - **Identify parameters** : ``
   - **return types** : ``
   - **return values**: ``
   - **exceptional behavior** :``
3. **Model the input domain**(The characteristics developed for this test case using the techniques from Input Space Partitioning. You must create **at least** one interface-based characteristic and **at least** one functionality-based characteristic for each test case.)  
   Characteristics:

| Characteristics | b1  | b2  |
|-----------------|-----|-----|
|                 |     |     |
|                 |     |     |
4. Combine partitions to define test requirements - use
   the 5 approaches to find combinations of values (ACoC, ECC, PWC, BCC, MBCC). You must apply the 5 approaches to your 10 unit test cases (thus each approach will be used in 2 unit test cases).  
   Approaches :   
   Test requirements :

5. Derive test values and expected values. These are the
   values that you have to use when you implement test cases in JUnit.

| Test | user | Expected result |
|------|------|-----------------|
|      |      |                 |
|      |      |                 |
|      |      |                 |
|      |      |                 |

## 6.

1. **Identify testable functions** : ``
2.
   - **Identify parameters** : ``
   - **return types** : ``
   - **return values**: ``
   - **exceptional behavior** :``
3. **Model the input domain**(The characteristics developed for this test case using the techniques from Input Space Partitioning. You must create **at least** one interface-based characteristic and **at least** one functionality-based characteristic for each test case.)  
   Characteristics:

| Characteristics | b1  | b2  |
|-----------------|-----|-----|
|                 |     |     |
|                 |     |     |
4. Combine partitions to define test requirements - use
   the 5 approaches to find combinations of values (ACoC, ECC, PWC, BCC, MBCC). You must apply the 5 approaches to your 10 unit test cases (thus each approach will be used in 2 unit test cases).  
   Approaches :   
   Test requirements :

5. Derive test values and expected values. These are the
   values that you have to use when you implement test cases in JUnit.

| Test | user | Expected result |
|------|------|-----------------|
|      |      |                 |
|      |      |                 |
|      |      |                 |
|      |      |                 |

## 7.

1. **Identify testable functions** : ``
2.
   - **Identify parameters** : ``
   - **return types** : ``
   - **return values**: ``
   - **exceptional behavior** :``
3. **Model the input domain**(The characteristics developed for this test case using the techniques from Input Space Partitioning. You must create **at least** one interface-based characteristic and **at least** one functionality-based characteristic for each test case.)  
   Characteristics:

| Characteristics | b1  | b2  |
|-----------------|-----|-----|
|                 |     |     |
|                 |     |     |
4. Combine partitions to define test requirements - use
   the 5 approaches to find combinations of values (ACoC, ECC, PWC, BCC, MBCC). You must apply the 5 approaches to your 10 unit test cases (thus each approach will be used in 2 unit test cases).  
   Approaches :   
   Test requirements :

5. Derive test values and expected values. These are the
   values that you have to use when you implement test cases in JUnit.

| Test | user | Expected result |
|------|------|-----------------|
|      |      |                 |
|      |      |                 |
|      |      |                 |
|      |      |                 |

## 8.

1. **Identify testable functions** : ``
2.
   - **Identify parameters** : ``
   - **return types** : ``
   - **return values**: ``
   - **exceptional behavior** :``
3. **Model the input domain**(The characteristics developed for this test case using the techniques from Input Space Partitioning. You must create **at least** one interface-based characteristic and **at least** one functionality-based characteristic for each test case.)  
   Characteristics:

| Characteristics | b1  | b2  |
|-----------------|-----|-----|
|                 |     |     |
|                 |     |     |
4. Combine partitions to define test requirements - use
   the 5 approaches to find combinations of values (ACoC, ECC, PWC, BCC, MBCC). You must apply the 5 approaches to your 10 unit test cases (thus each approach will be used in 2 unit test cases).  
   Approaches :   
   Test requirements :

5. Derive test values and expected values. These are the
   values that you have to use when you implement test cases in JUnit.

| Test | user | Expected result |
|------|------|-----------------|
|      |      |                 |
|      |      |                 |
|      |      |                 |
|      |      |                 |

## 9.

1. **Identify testable functions** : ``
2.
   - **Identify parameters** : ``
   - **return types** : ``
   - **return values**: ``
   - **exceptional behavior** :``
3. **Model the input domain**(The characteristics developed for this test case using the techniques from Input Space Partitioning. You must create **at least** one interface-based characteristic and **at least** one functionality-based characteristic for each test case.)  
   Characteristics:

| Characteristics | b1  | b2  |
|-----------------|-----|-----|
|                 |     |     |
|                 |     |     |
4. Combine partitions to define test requirements - use
   the 5 approaches to find combinations of values (ACoC, ECC, PWC, BCC, MBCC). You must apply the 5 approaches to your 10 unit test cases (thus each approach will be used in 2 unit test cases).  
   Approaches :   
   Test requirements :

5. Derive test values and expected values. These are the
   values that you have to use when you implement test cases in JUnit.

| Test | user | Expected result |
|------|------|-----------------|
|      |      |                 |
|      |      |                 |
|      |      |                 |
|      |      |                 |

## 10.

1. **Identify testable functions** : ``
2.
   - **Identify parameters** : ``
   - **return types** : ``
   - **return values**: ``
   - **exceptional behavior** :``
3. **Model the input domain**(The characteristics developed for this test case using the techniques from Input Space Partitioning. You must create **at least** one interface-based characteristic and **at least** one functionality-based characteristic for each test case.)  
   Characteristics:

| Characteristics | b1  | b2  |
|-----------------|-----|-----|
|                 |     |     |
|                 |     |     |
4. Combine partitions to define test requirements - use
   the 5 approaches to find combinations of values (ACoC, ECC, PWC, BCC, MBCC). You must apply the 5 approaches to your 10 unit test cases (thus each approach will be used in 2 unit test cases).  
   Approaches :   
   Test requirements :

5. Derive test values and expected values. These are the
   values that you have to use when you implement test cases in JUnit.

| Test | user | Expected result |
|------|------|-----------------|
|      |      |                 |
|      |      |                 |
|      |      |                 |
|      |      |                 |

