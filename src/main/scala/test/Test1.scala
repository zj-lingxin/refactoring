package test

/**
 * Created by lingx on 2015/10/23.
 */
object Test {

  def main(args: Array[String]) {
    println(testExtractMatch)
  }

  def testExtractMatch() = {
    goodMatchCode == badMatchCode
  }

  def badMatchCode: String = {
    import chapter1.bad.{Customer, Movie, Rental}
    val customer = new Customer("Lucius")
    customer.addRental(new Rental(new Movie("西游记", Movie.CHILDREN), 2))
    customer.addRental(new Rental(new Movie("水浒传", Movie.REGULAR), 3))
    customer.statement()
  }

  def goodMatchCode: String = {
    import chapter1.middle.{Customer, Movie, Rental}
    val customer = new Customer("Lucius")
    customer.addRental(new Rental(new Movie("西游记", Movie.CHILDREN), 2))
    customer.addRental(new Rental(new Movie("水浒传", Movie.REGULAR), 3))
    customer.statement()
  }
}
