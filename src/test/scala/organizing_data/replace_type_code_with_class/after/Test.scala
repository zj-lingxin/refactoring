package organizing_data.replace_type_code_with_class.after

import org.scalatest.FunSuite

/**
 * Created by lingx on 2015/10/28.
 */
class Test extends FunSuite {
  test("testBloodGroupCode") {
    val p = new Person(BloodGroup.A)
    println(p.bloodGroup.code)
    println(p.bloodGroupCode)
    p.bloodGroup = BloodGroup.A
    println(p.bloodGroupCode)
  }
}
