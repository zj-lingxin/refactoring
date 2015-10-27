package moving_features_between_objects.extract_class

import moving_features_between_objects.extract_class.bad.Person
import moving_features_between_objects.extract_class.good.Telephone
import org.scalatest.{BeforeAndAfter, FunSuite}

class Test extends FunSuite with BeforeAndAfter {
  var personBad: Person = new Person
  var personGood: good.Person = new good.Person

  before {
    personBad.officeAreaCode = "0573"
    personBad.officeNumber = "87713396"
    personGood.telephone = new Telephone("0573", "87713396")
  }

  test("testGetTelephoneNumber") {
    assert(personBad.getTelephoneNumber() == personGood.getTelephoneNumber())
  }

}