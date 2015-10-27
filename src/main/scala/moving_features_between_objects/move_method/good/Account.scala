package moving_features_between_objects.move_method.good

import moving_features_between_objects.move_method.good.account_type.AccountType

/**
 *
 */
class Account {
  /** 账户类型 **/
  var _type: AccountType = _

  /**
   * 透支天数
   *考虑源类中的特性是否要随着目标函数而搬移。这里的 _daysOverdraw 随着每个账户(Account)的不同而变化。所以仍旧保留在该类中
   */
  var _daysOverdraw: Int = _

  def bankCharge() = {
    var result = 4.5
    //改成调用AccountType的overdraftCharge()方法
    if (_daysOverdraw > 0) result += _type.overdraftCharge(_daysOverdraw)
    result
  }
}


