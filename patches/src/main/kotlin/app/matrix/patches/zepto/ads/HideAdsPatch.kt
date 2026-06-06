package app.matrix.patches.zepto.ads

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.matrix.patches.zepto.shared.Constants.COMPATIBILITY_EXAMPLE

@Suppress("unused")
val hideAdsPatch = bytecodePatch(
    name = "Hide ads"
    description = "Hide ads in zepto.",
    default = true
) {
    compatibleWith(COMPATIBILITY_EXAMPLE)

    apply{
    onSizeChangedMethod.returnEarly(true)
}
}
