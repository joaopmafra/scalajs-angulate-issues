package example

import biz.enef.angulate.{Scope, ScopeController}

import scala.scalajs.js

/**
  * Created by jp on 11/05/15.
  */
class CounterScopeCtrl($scope: CounterScope) extends ScopeController {
  $scope.count = 0
  $scope.foo = "bar"

  $scope.inc = () => $scope.count += 1
  $scope.dec = () => $scope.count -= 1
}

trait CounterScope extends Scope {
  var count: Int = js.native
  var foo: String = js.native

  var inc : js.Function = js.native
  var dec : js.Function = js.native
}
