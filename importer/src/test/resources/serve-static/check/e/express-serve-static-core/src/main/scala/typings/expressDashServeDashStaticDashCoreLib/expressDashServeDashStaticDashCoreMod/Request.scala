package typings
package expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request
  extends expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request {
  var url: java.lang.String
}

object Request {
  @scala.inline
  def apply(url: java.lang.String): Request = {
    val __obj = js.Dynamic.literal(url = url)
  
    __obj.asInstanceOf[Request]
  }
}
