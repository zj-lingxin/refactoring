package moving_features_between_objects.move_method.after.account_type

abstract class AccountType {
  def isPremium: Boolean = false
  def overdraftCharge(daysOverdraw: Int): Double
}
