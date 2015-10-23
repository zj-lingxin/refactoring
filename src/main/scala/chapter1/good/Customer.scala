package chapter1.good

class Customer(private var _name: String) {
  private val rentals = scala.collection.mutable.ListBuffer[Rental]()

  def addRental(rental: Rental) = {
    rentals += rental
  }

  def name = _name

  def statement() = {
    var result = s"Rental Record for $name \n"
    rentals.foreach { each => result += s"\t${each.movie.title}\t${each.getCharge()}\n"}
    result += s"Amount owed is $getTotalAmount \n You earned $getTotalFrequentRenterPoints frequent renter points"
    result
  }

  private def getTotalAmount = {
    var totalAmount = 0D
    rentals.foreach(each => totalAmount += each.getCharge())
    totalAmount
  }

  private def getTotalFrequentRenterPoints = {
    var frequentRenterPoints = 0
    rentals.foreach(each => frequentRenterPoints += each.getFrequentRenterPoints)
    frequentRenterPoints
  }

}


