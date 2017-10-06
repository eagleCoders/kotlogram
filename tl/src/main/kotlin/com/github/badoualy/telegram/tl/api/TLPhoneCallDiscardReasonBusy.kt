package com.github.badoualy.telegram.tl.api

/**
 * phoneCallDiscardReasonBusy#faf7e8c9
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLPhoneCallDiscardReasonBusy : TLAbsPhoneCallDiscardReason() {
    private val _constructor: String = "phoneCallDiscardReasonBusy#faf7e8c9"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLPhoneCallDiscardReasonBusy) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xfaf7e8c9.toInt()
    }
}