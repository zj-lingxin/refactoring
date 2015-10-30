package organizing_data.replace_type_code_with_statestrategy.after

abstract class EmployeeType {
  var monthlySalary: Double = _
  var commission: Double = _
  var bonus: Double = _
  def getTypeCode: Int
  def payAmount(): Double
}

class Engineer extends EmployeeType {
  override def getTypeCode: Int = EmployeeType.ENGINEER

  override def payAmount(): Double = monthlySalary
}

class Salesman extends EmployeeType {
  override def getTypeCode: Int = EmployeeType.SALESMAN

  override def payAmount(): Double =  monthlySalary + commission
}

class Manager extends EmployeeType {
  override def getTypeCode: Int = EmployeeType.MANAGER

  override def payAmount(): Double =  monthlySalary + bonus
}

object EmployeeType {
  val ENGINEER = 0
  val SALESMAN = 1
  val MANAGER = 2
  def create(_type: Int) = {
    _type match {
      case EmployeeType.ENGINEER => new Engineer
      case EmployeeType.SALESMAN => new Salesman
      case EmployeeType.MANAGER  => new Manager
      case _ => throw new RuntimeException("Incorrect Employee")
    }
  }
}