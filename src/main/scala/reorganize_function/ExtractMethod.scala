package reorganize_function

/**
 * Extract Method 是最常用的重构方法之一。
 * 当看见一个过长的函数或者一段需要注释才能让人理解的用途的代码时，就需要将这段代码放入一个独立函数中。
 *
 * 简短和命名良好的函数的好处：
 * 1、函数的粒度小，可以增加函数复用的机会。
 * 2、会使高层函数读取来就像是一系列注释
 * 3、如果函数都是细粒度，那么函数的覆写也会更容易些。
 *
 * 做法：
 * 创造一个新函数，根据这个函数的意图来对它进行命名。(以它“做什么”来名命名，而不是以它“怎么做”来命名)。
 * => 即使你想要提炼的代码非常简单，例如只有一条消息或者一个函数调用，只要新函
 */
object ExtractMethod {


  //Replace Temp With Query
  var _quantity = 10
  var _itemPrice = 3.0
  //重构前
  def getPrice_ = {
    val basePrice = _quantity * _itemPrice
    var discountFactor: Double = 0.98
    if (basePrice > 1000) discountFactor = 0.95
    basePrice * discountFactor
  }

  //重构后
  def getPrice = basePrice * discountFactor
  private def discountFactor = if(basePrice > 1000) 0.95 else 0.98
  private def basePrice = _quantity * _itemPrice

  //重构前
  private val _primaryForce = 8
  private val _mass = 9.8
  private val _delay = 2

  def getDistanceTravelled_(time: Int) = {
    var result: Double = 0D
    val primaryAcc = _primaryForce / _mass
    var primaryTime = Math.min(time, _delay)
    result = 0.5 * primaryAcc * primaryTime * primaryTime
    var secondaryTime = time - _delay
    if (secondaryTime > 0) {
      var primaryVal = primaryAcc * _delay
      val secondaryAcc = (_primaryForce + secondaryTime) / _mass
      result += primaryVal * secondaryTime + 0.5 * primaryAcc * secondaryTime * secondaryTime
    }
    result
  }

  //重构后
  def getDistanceTravelled(time: Int) = {
    var result: Double = getAccTime(primaryAcc, primaryTime(time))
    if (secondaryTime(time) > 0) {
      result += (primaryAcc * _delay)* secondaryTime(time) + getAccTime(secondaryAcc(time),secondaryTime(time))
    }
    result
  }
  private def getAccTime(acc: Double,time: Double) = 0.5 * acc * time * time
  private def primaryAcc: Double = _primaryForce / _mass
  private def secondaryAcc(secondaryTime: Int): Double = primaryAcc +  secondaryTime / _mass
  private def primaryTime(time: Int): Double = Math.min(time, _delay)
  private def secondaryTime(time: Int): Double = time - _delay


  def main(args: Array[String]) {

  }
}
