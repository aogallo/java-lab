# Ejemplo tutor - Person como clase base

```java
public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
}
```

```java
public class Student extends Person {
    private String studentCode;
}
```

```java
public class Teacher extends Person {
    private String specialty;
}
```
