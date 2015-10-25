package chapter1.good.movie.impl
import chapter1.good.movie._

class ChildrenMovie(title: String) extends Movie(title) {
  override def getCharge(daysRented: Int): Double = {
    var result = 1.5
    if (daysRented > 3) result += (daysRented - 3) * 1.5
    result
  }
}
