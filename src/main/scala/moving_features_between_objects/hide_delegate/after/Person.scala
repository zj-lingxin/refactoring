package moving_features_between_objects.hide_delegate.after

class Person(val name: String) {
  private var department: Department = _

  def getManager() = {
    department.manager
  }

  def setManager(manager:Person) = {
    department = new Department(manager)
  }

}
