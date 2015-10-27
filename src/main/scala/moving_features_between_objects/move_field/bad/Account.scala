package moving_features_between_objects.move_field.bad

/**
 * 想把表示利率的_interestRate移到AccountType中
 */
class Account {
  /** 账户类型**/
  var _type: AccountType = _
  var _interestRate = 0.02
  def interestForAmountDays(amount: Double, days: Int) = _interestRate * amount * days / 365

 }


