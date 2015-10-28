package organizing_data.change_value_to_reference.after

//将主构造器声明为private
class Customer private(val name: String)

object Customer {
  private val customers = scala.collection.mutable.Map[String,Customer]()

  //定义一个工厂函数
  def getCustomer(name: String): Customer = {
    if(!customers.contains(name)){
      customers += name -> new Customer(name)
    }
    customers(name)
  }
  def getAllCustomer = customers
}
