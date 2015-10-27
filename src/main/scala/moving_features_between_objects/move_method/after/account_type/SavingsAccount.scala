package moving_features_between_objects.move_method.after.account_type

/**
 * 储蓄帐户
 */
class SavingsAccount extends AccountType {
  override def overdraftCharge(daysOverdraw: Int): Double = {
    if (isPremium) daysOverdraw * 1.85 else daysOverdraw * 1.75
  }
}
