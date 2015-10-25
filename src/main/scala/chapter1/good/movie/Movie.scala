package chapter1.good.movie


import chapter1.good.movie.impl.NewReleaseMovie

/**
 * 影片
 */
abstract class Movie(var title: String) {
  /**
   * 1、使用IDEA的Ctrl+Alt+M快捷键将amountFor这个方法提取出来了。
   * 如果不喜欢thisAmount这个参数，可以修改它。这里修改成result。
   * 改名之后，需要重新编译测试，确保没有破坏任何东西。
   * 2、这时，amountFor这个方法使用了来自Rental类的信息，却没有使用Customer类的信息。
   * 这立刻使我怀疑它们是否放错了位置。所以amountFor应该移到Rental类中。
   * 所以将amountFor从Customer类中移到Rental中
   * 3、当将这个amountFor这个函数移到Rental中后，这名字就不适用了,amountFor改成getCharge()。
   * 且参数也是不需要了。并且去掉private修饰符。要找出旧函数中中的引用点，修改掉后，进一步测试。
   */
  def getCharge(daysRented: Int): Double

  def getFrequentRenterPoints(daysRented: Int) = {
    if (isInstanceOf[NewReleaseMovie] && daysRented > 1) 2 else 1
  }
}


