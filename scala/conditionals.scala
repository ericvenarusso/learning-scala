//Conditionals

val i: Int = 1
val j: Int = 2

/*
if (i>j) {
	println("i greater")
	} else {
	println("j greater")
	}
*/

val k: Int = if (i>j) i else j

// Match Expression

val monthNum: Int = 33

monthNum match{
	case 1 => println("January")
	case 2 => println("February")
	case 3 => println("March")
	case _ => println("Bad Month") // _ = Default case
}