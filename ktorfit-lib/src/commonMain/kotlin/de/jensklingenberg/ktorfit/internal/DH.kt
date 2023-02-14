package de.jensklingenberg.ktorfit.internal



/**
 * DataHolder
 */
public class DH(
    public val key: String,
    public val data: Any?,
    public val encoded: Boolean = false,
    public val type: String = ""
)