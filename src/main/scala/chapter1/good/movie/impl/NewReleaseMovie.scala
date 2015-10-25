package chapter1.good.movie.impl

import chapter1.good.movie.Movie


class NewReleaseMovie(title: String) extends Movie(title) {

  override def getCharge(daysRented: Int): Double = (daysRented - 3) * 1.5

}
