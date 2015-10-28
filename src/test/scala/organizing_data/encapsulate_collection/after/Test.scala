package organizing_data.encapsulate_collection.after

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
    kent.setCourses(s)
    assert(2 == kent.numberOfCourses)
    val scala1 = new Course("scala", true)
    kent.addCourse(scala1)
    kent.addCourse(new Course("linux", false))
    assert(4 == kent.numberOfCourses)
    kent.removeCourse(scala1)
    assert(3 == kent.numberOfCourses)
    assert(1 == kent.numberOfAdvanceCourses)

    val s2 = scala.collection.mutable.Set[Course]()
    s2 += new Course("C++", false)
    s2 += new Course("Go", true)
    kent.addAllCourse(s2)
    assert(5 == kent.numberOfCourses)
  }
}
