package first_example.after.movie

/**
 * 这个程序的其余部分(Custmoer.Rental)并不知道我们使用了状态模式。
 * 使用状态模式的优势在于：如果我要修改任何与价格有关的行为，或者添加新的
 * 定价标准，或是加入其它取决于价格的行为，程序的修改会容易很多。
 */
class Movie() {
  var title: String = _
  private var price: Price = _

  def this(title: String, priceCode: Int) {
    this()
    this.title = title
    setPriceCode(priceCode)
  }

  def setPriceCode(arg: Int) = {
    arg match {
      case Movie.REGULAR => price = new RegularPrice
      case Movie.CHILDREN => price = new ChildrenPrice
      case Movie.NEW_RELEASE => price = new NewReleasePrice
      case _ => throw new IllegalArgumentException("Incorrect Price Code")
    }
  }

  def getPriceCode = price

  def getCharge(daysRented: Int): Double = {
    price.getCharge(daysRented)
  }

  def getFrequentRenterPoints(daysRented: Int) = {
    price.getFrequentRenterPoints(daysRented)
  }
}

object Movie {
  val REGULAR = 0
  val NEW_RELEASE = 1
  val CHILDREN = 2
}

