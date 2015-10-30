package organizing_data.replace_type_code_with_statestrategy.before

//Empolyee的主构造函数接收类型码作为一个参数，所以需要将它替换成一个工厂函数
class Employee(var _type: Int) {
  var monthlySalary: Double = _
  var commission: Double = _
  var bonus: Double = _

  def payAmount(): Double = {
    _type match {
      case Employee.ENGINEER => monthlySalary
      case Employee.SALESMAN => monthlySalary + commission
      case Employee.MANAGER  => monthlySalary + bonus
      case _ => throw new RuntimeException("Incorrect Employee")
    }
  }
}

object Employee {
  val ENGINEER = 0
  val SALESMAN = 1
  val MANAGER = 2
}
