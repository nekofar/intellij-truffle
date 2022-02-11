package com.nekofar.milad.intellij.truffle

import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

object TruffleIcons {
    @JvmField
    val FileType = IconLoader.getIcon("/icons/truffle.svg", javaClass)

    @JvmField
    val ProjectGenerator: Icon = IconLoader.getIcon("/icons/truffle.png", javaClass)
}
