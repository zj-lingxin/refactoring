package organizing_data.encapsulate_collection.after
import scala.collection.mutable._
class Person {
  private var courses = Set[Course]()

  def addAllCourse(args: Set[Course]) = {
    courses ++= args
  }

  def removeCourse(arg: Course) = {
    courses.remove(arg)
  }

  def setCourses(args: Set[Course]) = {
    args.foreach(addCourse(_))
  }

  def addCourse(arg: Course) = {
    courses.add(arg)
  }

  def numberOfAdvanceCourses = {
    courses.count(_.isAdvanced == true)
  }

  def numberOfCourses = {
    courses.size
  }

}

