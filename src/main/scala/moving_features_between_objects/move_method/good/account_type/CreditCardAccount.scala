package moving_features_between_objects.move_method.good.account_type

/**
 * 信用卡帐户
 */
class CreditCardAccount extends AccountType{
  //假设可以返回true or false
  override def isPremium: Boolean = true

  def overdraftCharge(daysOverdraw: Int): Double = {
    if (isPremium) {
      var result = 10D
      if (daysOverdraw > 7) result += (daysOverdraw - 7) * 0.85
      result
    } else {
      daysOverdraw * 1.75
    }
  }
}
