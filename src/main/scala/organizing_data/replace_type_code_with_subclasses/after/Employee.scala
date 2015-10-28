package organizing_data.replace_type_code_with_subclasses.after

//Empolyee的主构造函数接收类型码作为一个参数，所以需要将它替换成一个工厂函数
abstract class Employee(val _type: Int){
  def getType = {
    _type
  }
}

object Employee {
  val ENGINEER = 0
  val SALESMAN = 1
  val MANAGER = 2
  def create(_type: Int):Employee = {
    _type match {
      case ENGINEER => new Engineer
      case SALESMAN => new Salesman
      case MANAGER => new Manager
      case _ => throw new IllegalArgumentException("Incorrect type code value")
    }
  }
}
//除了 organizing_data.replace_type_code_with_subclasses.after 这个包中的类或包可以new Engineer，在其他类中不能new
class Engineer private [after] extends Employee(Employee.ENGINEER)
class Salesman private [after] extends Employee(Employee.SALESMAN)
class Manager  private [after] extends Employee(Employee.MANAGER)