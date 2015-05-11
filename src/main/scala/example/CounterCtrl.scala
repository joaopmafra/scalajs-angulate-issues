package example

import biz.enef.angulate.Controller

/**
 * Created by jp on 11/05/15.
 */
class CounterCtrl extends Controller {
  var count = 0

  // foo will be accessible from within the view only after a clean
  //var foo = "bar"

  def inc() = count += 1
  def dec() = count -= 1
}
