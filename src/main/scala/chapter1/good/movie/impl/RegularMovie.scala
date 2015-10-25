package chapter1.good.movie.impl

import chapter1.good.movie.Movie

class RegularMovie(title: String) extends Movie(title) {

  override def getCharge(daysRented: Int): Double = {
    var result = 2D
    if (daysRented > 2) result += (daysRented - 2) * 1.5
    result
  }
}
