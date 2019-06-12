trait Geometric {
	def height: Int
	def area: Int
	def perimeter: int
}

class Square (val size: Int) extends Geometric {

	def area: Int = size * size
	
	def perimeter: Int = size * 4
	
	def display: Unit = {
		println("Size = " + size)
		println("Area = " + area)
	}
}

val sqr = new Square(6)

val geom: Geometric = sqr

geom.area