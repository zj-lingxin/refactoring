package organizing_data.change_value_to_reference.before

class Order(private var customerName: String){
  //Custmoer对象还是值对象。就算多份订单属于同一客户，但每个Order对象还是拥有各自的Customer对象。
  //改成每个客户名称对应一个Customer对象。
  private var _customer: Customer = new Customer(customerName)

  def setCustomerName(customerName: String) = {
    _customer = new Customer(customerName)
  }

  def getCustomerName = {
    _customer.name
  }
}

object Order {
  def numberOfOrdersFor(orders:List[Order],customerName: String): Int = {
    orders.count(_.getCustomerName == customerName)
  }
}