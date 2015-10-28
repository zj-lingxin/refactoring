package organizing_data.replace_type_code_with_subclasses.before

//Empolyee的主构造函数接收类型码作为一个参数，所以需要将它替换成一个工厂函数
class Employee(_type: String)
object Employee {
  val ENGINEER = 0
  val SALESMAN = 1
  val MANAGER = 2

}
