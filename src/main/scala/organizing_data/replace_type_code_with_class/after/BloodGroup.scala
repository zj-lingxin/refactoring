package organizing_data.replace_type_code_with_class.after

class BloodGroup private(val code: Int)

object BloodGroup {
  val O =  new BloodGroup(100)
  val A =  new BloodGroup(101)
  val B =  new BloodGroup(102)
  val AB =  new BloodGroup(103)
}
