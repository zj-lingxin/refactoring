package moving_features_between_objects.inline_class.before

class Person {
  var name: String = _
  var telephone: Telephone = new Telephone("","")

  def getTelephoneNumber() = s"(${telephone.officeAreaCode})${telephone.officeNumber}"
  def getOfficeNumber = telephone.officeNumber
}

