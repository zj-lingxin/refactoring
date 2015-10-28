package organizing_data.encapsulate_collection.before

import org.scalatest.FunSuite

/**
 * Created by lingx on 2015/10/28.
 */
class Test extends FunSuite {

  test("Test") {
    val kent = new Person
    val s = scala.collection.mutable.Set[Course]()
    s += new Course("Java", false)
    s += new Course("Hadoop", true)
    kent.courses = s
    assert(2 == kent.courses.size)
    val scala1 = new Course("scala", true)
    kent.courses.add(scala1)
    kent.courses.add(new Course("linux", false))
    assert(4 == kent.courses.size)
    kent.courses.remove(scala1)
    assert(3 == kent.courses.size)
    assert(1 == kent.numberOfAdvanceCoruses)
  }

}
