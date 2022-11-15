# cscd212-f22-inclass-junit


[JUnit](https://junit.org/junit5/)

Run before each test
```java
@BeforeEach
void setUp() {
    // your code
}
```

Test
```java
@Test
@DisplayName("Name of test")
void example() {
    // your code
    // some assert
}
```

Nested used to organize tests
```java
@Nested
class example {
    @Test
    //...
}
```

Some Assert we use
```java
assertEquals(Expected, Actual, Fail-Message);
assertEquals(0, Double.compare(Expected, Actual), Fail-Message); // When using doubles
assertTrue(Actual, Fail-Message);
assertFalse(Actual, Fail-Message);
assertNull(Actual, Fail-Message);
Throwable throwable = assertThrows(ExpectedException.class, () -> {
    // Actual, code that will throw exception
}, Fail-Message);
throwable.getMessage() // is the message with the exception
```
