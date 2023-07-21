package com.hl.jna.demo

import com.sun.jna.Library
import com.sun.jna.Native

/**
 * @author  张磊  on  2023/07/21 at 10:44
 * Email: 913305160@qq.com
 */
interface TestLib : Library {
	companion object {
		val instance = Native.load("test", TestLib::class.java)
	}

	fun hello_world(): String

	fun add_count(): Int
}