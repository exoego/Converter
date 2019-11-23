package typings.react.reactMod

import japgolly.scalajs.react.vdom.VdomNode
import typings.react.Anon_Html
import typings.react.reactStrings.foo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLProps[T]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T] {
  var defaultValue: foo
  var onChange: foo
  var `type`: foo
  var value: foo
}

object HTMLProps {
  @scala.inline
  def apply[T](
    defaultValue: foo,
    onChange: foo,
    `type`: foo,
    value: foo,
    accept: String = null,
    acceptCharset: String = null,
    children: VdomNode = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    ref: japgolly.scalajs.react.raw.React.Ref = null
  ): HTMLProps[T] = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, onChange = onChange, value = value)
    __obj.updateDynamic("type")(`type`)
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (acceptCharset != null) __obj.updateDynamic("acceptCharset")(acceptCharset)
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLProps[T]]
  }
}

