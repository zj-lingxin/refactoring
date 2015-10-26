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
    import first_example.before._
    val customer = new Customer("Lucius")
    customer.addRental(new Rental(new Movie("西游记", Movie.CHILDREN), 2))
    customer.addRental(new Rental(new Movie("水浒传", Movie.REGULAR), 3))
    customer.addRental(new Rental(new Movie("琅琊榜",Movie.NEW_RELEASE), 3))
    println(customer.statement())
    customer.statement()
  }

  def goodMatchCode: String = {
    import first_example.after._
    import first_example.after.movie._
    val customer = new Customer("Lucius")
    customer.addRental(new Rental(new Movie("西游记", Movie.CHILDREN), 2))
    customer.addRental(new Rental(new Movie("水浒传", Movie.REGULAR), 3))
    customer.addRental(new Rental(new Movie("琅琊榜",Movie.NEW_RELEASE), 3))
    println(customer.statement())
    customer.statement()
  }
}
