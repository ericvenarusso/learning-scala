case class Person (name: String, gender: String, age: Long)

val p1 = Person("John", "M", 45)
val p2 = Person("Mary", "F", 45)
val p3 = Person("John", "M", 45)

if (p1==p2) "Equal" else "Non-equal"
if (p1==p3) "Equal" else "Non-equal"