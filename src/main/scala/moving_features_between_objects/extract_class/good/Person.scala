package moving_features_between_objects.extract_class.good

/**
 * 在这个例子中，我们可以将电话号码相关的行为分离到一个独立类中
 */
class Person {
  var name: String = _
  var telephone: Telephone = new Telephone("","")

  def getTelephoneNumber() = s"(${telephone.officeAreaCode})${telephone.officeNumber}"
  def getOfficeNumber = telephone.officeNumber

}

