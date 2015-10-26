package chapter1.before

class Customer(private var _name: String) {
  private val rentals = scala.collection.mutable.ListBuffer[Rental]()

  def addRental(rental: Rental) = {
    rentals += rental
  }

  def name = _name

  def statement() = {
    var totalAmount = 0D
    var frequentRenterPoints = 0
    var result = s"Rental Record for $name \n"
    rentals.foreach { each =>
      //把match语句提炼到独立的方法中比较好。首先找出函数内部的变量和参数。找到了2个：each和thisAmount。前者不会被修改，后者会被修改。
      //任何不会修改的变量都可以被当作参数传入到新的函数中，至于会被修改的变量，就要格外小心。如果只有一个变量会被修改，可以把它作为返回值。
      //thisAmount是一个临时变量，其值在每次循环起始处被设为0，并且在match语句之前不会变。所以可以把新的函数的返回值赋给它。
      var thisAmount = 0D
      each.movie.priceCode match {
        case Movie.REGULAR =>
          thisAmount += 2
          if (each.daysRented > 2) thisAmount += (each.daysRented - 2) * 1.5
        case Movie.NEW_RELEASE =>
          thisAmount += each.daysRented * 3
        case Movie.CHILDREN =>
          thisAmount += 1.5
          if (each.daysRented > 3) thisAmount += (each.daysRented - 3) * 1.5
      }

      //add frequent renter points
      frequentRenterPoints += 1
      //add bonus for a two day new release rental
      if (each.movie.priceCode == Movie.NEW_RELEASE && each.daysRented > 1) frequentRenterPoints += 1

      //show figures for this rental
      result += s"\t${each.movie.title}\t${thisAmount}\n"
      totalAmount += thisAmount
    }

    //add footer lines
    result += s"Amount owed is ${totalAmount} \n You earned ${frequentRenterPoints} frequent renter points"
    result
  }
}

