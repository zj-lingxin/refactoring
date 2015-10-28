package organizing_data.change_value_to_reference.after

import org.scalatest.FunSuite

/**
 * Created by lingx on 2015/10/28.
 */
class OrderTest extends FunSuite {

  test("test") {

    val orderList = List[Order](new Order("lucius"), new Order("lucius"), new Order("Jim"))
    println(Order.numberOfOrdersFor(orderList,"lucius"))
    println(Customer.getAllCustomer)
  }

}
