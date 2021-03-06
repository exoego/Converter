package typingsSlinky.semanticUiReact.genericMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictHtmlIframeProps extends js.Object {
  var src: js.UndefOr[String] = js.native
}

object StrictHtmlIframeProps {
  @scala.inline
  def apply(): StrictHtmlIframeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictHtmlIframeProps]
  }
  @scala.inline
  implicit class StrictHtmlIframePropsOps[Self <: StrictHtmlIframeProps] (val x: Self) extends AnyVal {
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
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
  }
  
}

