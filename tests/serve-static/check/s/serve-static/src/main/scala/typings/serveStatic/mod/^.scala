package typings.serveStatic.mod

import typings.expressServeStaticCore.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serve-static", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(root: String): Handler = js.native
  def apply(root: String, options: ServeStaticOptions): Handler = js.native
}

