# Ejemplo tutor - PreparedStatement

```java
String sql = "SELECT id, first_name, last_name, email FROM students WHERE id = ?";
PreparedStatement statement = connection.prepareStatement(sql);
statement.setInt(1, id);
```
