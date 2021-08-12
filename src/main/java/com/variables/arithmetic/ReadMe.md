# Arithmetic in Java

### Binary operators:
- `+` - plus/addition
- `-` - minus/subtraction
- `*` - multiply 
- `/` - divide
- `%` - remainder (returns the remainder)

```java
System.out.println(6 / 4);
```
- displays 1 instead of 1.5 because both of them are integers and therefore the results are also integer. This means that it disregards all the numbers behind the decimal point.

#### To fix that:
```java
System.out.println((double)6 / 4);
```
- Now it displays 1.5.
- converts `6` (integer) to `6.0` (double). Any arithmetic between an integer and a double will result in a double.

```java
System.out.println(5 % 2);
```
- displays the remainder i.e. 1.
