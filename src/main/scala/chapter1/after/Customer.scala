package chapter1.after

class Customer(private var _name: String) {
  private val rentals = scala.collection.mutable.ListBuffer[Rental]()

  def addRental(rental: Rental) = {
    rentals += rental
  }

  def name = _name

  def statement() = {
    //var totalAmount = 0D
    //var frequentRenterPoints = 0
    var result = s"Rental Record for $name \n"
    rentals.foreach { each =>
      //我们可以去除thisAmount这个临时变量。临时变量往往引发问题，它们会导致大量参数被传来传去，
      //而这其实完全没有必要。你很容易跟丢它们，尤其在长长的函数中更少如此。当然我这么做也需要
      //付出性能上的代价。例如本例的费用被计算了两次。但是这很容易在Rental类中进行优化。而且如果
      //代码有合理的组织和管理。优化会有很好的效果。
      //var thisAmount: Double = each.getCharge()

      //add frequent renter points
      //frequentRenterPoints = each.getFrequentRenterPoints(frequentRenterPoints)
      //show figures for this rental
      result += s"\t${each.movie.title}\t${each.movie.getCharge(each.daysRented)}\n"
      //totalAmount += each.getCharge()
    }

    //add footer lines
    result += s"Amount owed is $getTotalAmount \n You earned $getTotalFrequentRenterPoints frequent renter points"
    result
  }

  //通过计算逻辑的提炼。可以完成一个htmlStatement(),并复用原来statement()内的所有计算。
  def htmlStatement() = {
    var result = s"<p>Rental Record for <font color = 'red'>$name</font><br/>\n"
    rentals.foreach { each => result += s"\t${each.movie.title}\t${each.movie.getCharge(each.daysRented)}<br/>\n" }
    result += s"Amount owed is $getTotalAmount \n You earned $getTotalFrequentRenterPoints frequent renter points</p>"
    result
  }

  private def getTotalAmount = {
    var totalAmount = 0D
    rentals.foreach(each => totalAmount += each.movie.getCharge(each.daysRented))
    totalAmount
  }

  private def getTotalFrequentRenterPoints = {
    var frequentRenterPoints = 0
    rentals.foreach(each => frequentRenterPoints += each.movie.getFrequentRenterPoints(each.daysRented))
    frequentRenterPoints
  }

}


