package moving_features_between_objects.inline_class.after

class Person {
  var name: String = _
  //var telephone: Telephone = new Telephone("","")
  var officeAreaCode: String = _
  var officeNumber: String = _
  def getTelephoneNumber() = s"(${officeAreaCode})${officeNumber}"
}

