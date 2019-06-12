// Class
class Square (val size: Int) {

	def area: Int = size * size
	
	def perimeter: Int = size * 4
	
	def display: Unit = {
		println("Size = " + size)
		println("Area = " + area)
	}
}

val sqr = new Square(6)

sqr.area
sqr.size
sqr.display