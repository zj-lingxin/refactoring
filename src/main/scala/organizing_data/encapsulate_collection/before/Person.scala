package organizing_data.encapsulate_collection.before

class Person {
  var courses: scala.collection.mutable.Set[Course] = _

  def numberOfAdvanceCoruses = {
    courses.count(_.isAdvanced == true)
  }

}

