package organizing_data.replace_type_code_with_statestrategy.after

class Employee(var _type: Int) {
  var employeeType: EmployeeType = _

  def payAmount(): Double = {
    employeeType.payAmount()
  }

  def setType(arg: Int) = {
    employeeType = EmployeeType.create(arg)
  }
}
