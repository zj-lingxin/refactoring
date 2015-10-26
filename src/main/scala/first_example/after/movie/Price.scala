package first_example.after.movie
abstract class Price {
  def getPriceCode: Int

  def getCharge(daysRented: Int): Double

  def getFrequentRenterPoints(daysRented: Int) = 1
}


class ChildrenPrice extends Price {
  def getPriceCode: Int = Movie.CHILDREN

  def getCharge(daysRented: Int): Double = if (daysRented > 3) 1.5 + (daysRented - 3) * 1.5 else 1.5
}

class NewReleasePrice extends Price {
  override def getPriceCode: Int = Movie.NEW_RELEASE

  def getCharge(daysRented: Int): Double = daysRented * 3

  override def getFrequentRenterPoints(daysRented: Int): Int = if (daysRented > 1) 2 else 1//if (daysRented > 1) 2 else 1
}

class RegularPrice extends Price {
  override def getPriceCode: Int = Movie.REGULAR

  def getCharge(daysRented: Int): Double = if (daysRented > 2) 2 + (daysRented - 2) * 1.5 else 2
}
