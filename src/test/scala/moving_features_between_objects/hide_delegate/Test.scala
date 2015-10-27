package moving_features_between_objects.hide_delegate

import moving_features_between_objects.hide_delegate.before.Department
import org.scalatest.{BeforeAndAfter, FunSuite}

/**
 * Created by lingx on 2015/10/27.
 */
class Test extends FunSuite with BeforeAndAfter {
  val johnB = new moving_features_between_objects.hide_delegate.before.Person("John")
  val johnA = new moving_features_between_objects.hide_delegate.after.Person("John")
  before{
    johnB.department = new Department(new moving_features_between_objects.hide_delegate.before.Person("zhengc"))
    johnA.setManager(new moving_features_between_objects.hide_delegate.after.Person("zhengc"))
  }

  test("testDepartment") {
    assert(johnB.department.manager.name == johnA.getManager().name)
  }


}
