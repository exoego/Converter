package typingsSlinky.react.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactElement extends js.Object {
  var key: Key | Null = js.native
  var props: js.Any = js.native
  var `type`: String | ReactComponentClass[_] = js.native
}

object ReactElement {
  @scala.inline
  def apply(props: js.Any, `type`: String | ReactComponentClass[_]): ReactElement = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactElement]
  }
  @scala.inline
  implicit class ReactElementOps[Self <: slinky.core.facade.ReactElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProps(value: js.Any): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeStatelessComponent(value: ReactComponentClass[_]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeComponentClass(value: ReactComponentClass[_]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String | ReactComponentClass[_]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
  }
  
}

