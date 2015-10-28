package organizing_data.replace_type_code_with_class.before

class Person(var bloodGroup: Int)

object Person {
  val O: Int = 0
  val A: Int = 1
  val B: Int = 2
  val AB: Int = 3
}

object Test {
  def main(args: Array[String]) {
    val p = new Person(Person.A)
    println(p.bloodGroup)
    p.bloodGroup = Person.B
  }
}