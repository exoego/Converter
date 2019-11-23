package typings.react.reactMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typings.std.Event
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEvent[T] extends BaseSyntheticEvent[Event, EventTarget with T, EventTarget] {
  @JSName("target")
  var target_ChangeEvent: org.scalajs.dom.raw.EventTarget with T
}

object ChangeEvent {
  @scala.inline
  def apply[T](
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: org.scalajs.dom.raw.EventTarget with T,
    defaultPrevented: Boolean,
    eventPhase: Double,
    isDefaultPrevented: CallbackTo[Boolean],
    isPropagationStopped: CallbackTo[Boolean],
    isTrusted: Boolean,
    nativeEvent: org.scalajs.dom.raw.Event,
    persist: Callback,
    preventDefault: Callback,
    stopPropagation: Callback,
    target: org.scalajs.dom.raw.EventTarget with T,
    timeStamp: Double,
    `type`: String
  ): ChangeEvent[T] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, cancelable = cancelable, currentTarget = currentTarget, defaultPrevented = defaultPrevented, eventPhase = eventPhase, isTrusted = isTrusted, nativeEvent = nativeEvent, target = target, timeStamp = timeStamp)
    __obj.updateDynamic("isDefaultPrevented")(js.Any.fromFunction0((() => isDefaultPrevented.runNow())))
    __obj.updateDynamic("isPropagationStopped")(js.Any.fromFunction0((() => isPropagationStopped.runNow())))
    __obj.updateDynamic("persist")(js.Any.fromFunction0((() => persist.runNow())))
    __obj.updateDynamic("preventDefault")(js.Any.fromFunction0((() => preventDefault.runNow())))
    __obj.updateDynamic("stopPropagation")(js.Any.fromFunction0((() => stopPropagation.runNow())))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChangeEvent[T]]
  }
}

