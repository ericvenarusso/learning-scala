// Functions

def max(x: Int, y: Int): Int = {
	if (x > y) x 
	else y
} 

def max2(x: Int, y: Int): Int = if (x > y) x else y

max(1,2)
max2(1,2)

// Anonymous functions and Literals

val b = 1 to 2

// b.foreach( (x:Int) => { println(x*x) })
b.foreach( x => println(x*x) )