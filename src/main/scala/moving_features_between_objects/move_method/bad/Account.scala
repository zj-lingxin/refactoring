package moving_features_between_objects.move_method.bad

class Account {
  /** 账户类型**/
  var _type: AccountType = _
  /** 已透支天数 **/
  var _daysOverdraw: Int = _

  /**
   * 透支金额计算规则
   * 假设有几种账户类型，每一种都有自己的“透支金额计算规则”，所以希望将overdraftCharge()移动到AccountType中
   */
  def overdraftCharge(): Double = {
    if (_type.isPremium) {
      var result = 10D
      if (_daysOverdraw > 7) result += (_daysOverdraw - 7) * 0.85
      result
    } else {
      _daysOverdraw * 1.75
    }
  }

  def bankCharge() = {
    var result = 4.5
    if(_daysOverdraw > 0) result += overdraftCharge()
    result
  }
}


