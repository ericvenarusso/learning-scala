// Colections 

// List
val colors = List[String]("red", "green", "blue")
// val colors = List("red", "green", "blue")

// Set
val pets = Set[String]("dog", "dog", "cat")
val petNow = scala.collection.mutable.Set("dog", "dog", "cat")

// Map
val petCount = Map("dog" -> 2, "cat" -> 1, "mice" -> 0)

// Acessing
val pets = Set[String]("mouse", "dog", "cat")
pets.tails

val petCount = Map("dog" -> 2, "cat" -> 1, "mice" -> 0)
petCount("dog")