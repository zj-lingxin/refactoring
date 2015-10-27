package moving_features_between_objects.move_method.good.account_type

abstract class AccountType {
  def isPremium: Boolean = false
  def overdraftCharge(daysOverdraw: Int): Double
}
