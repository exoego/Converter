package typings
package reactDashIconDashBaseLib.reactDashIconDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconBaseProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[reactLib.reactMod.ReactNs.ReactSVGElement] {
  var size: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object IconBaseProps {
  @scala.inline
  def apply(
    key: reactLib.reactMod.ReactNs.Key = null,
    ref: reactLib.reactMod.ReactNs.Ref[reactLib.reactMod.ReactNs.ReactSVGElement] = null,
    size: java.lang.String | scala.Double = null
  ): IconBaseProps = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconBaseProps]
  }
}
