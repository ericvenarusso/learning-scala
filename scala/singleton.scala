// Singleton

object Counter {
	
	var count = 0

	def currentCount(): Long = {
		count += 1
		count
	}
}

Counter.currentCount
Counter.currentCount