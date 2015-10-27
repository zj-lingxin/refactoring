package moving_features_between_objects.move_method.good.account_type

/**
 * 个人支票帐户
 */
class CheckingAccount extends AccountType {
  override def overdraftCharge(daysOverdraw: Int): Double = {
    daysOverdraw * 1.75
  }
}
