package example

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

import biz.enef.angulate._

/**
 * Created by jp on 11/05/15.
 */
@JSExport
object NgApp extends JSApp {

  override def main(): Unit = {
    val module = angular.createModule("ngApp")
    module.controllerOf[CounterCtrl]
    module.controllerOf[CounterScopeCtrl]
  }
  
}
