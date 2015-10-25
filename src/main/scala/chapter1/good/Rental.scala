package chapter1.good

import chapter1.good.movie.Movie

/**
  * 租赁
  */
class Rental(var movie: Movie, var daysRented: Int) {


  def getFrequentRenterPoints = {
    movie.getFrequentRenterPoints(daysRented)
  }
}
