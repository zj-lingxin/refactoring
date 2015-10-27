package moving_features_between_objects.move_field.after

class Account {
  var _type: AccountType = _
  def interestForAmountDays(amount: Double, days: Int) = _type._interestRate * amount * days / 365
 }


