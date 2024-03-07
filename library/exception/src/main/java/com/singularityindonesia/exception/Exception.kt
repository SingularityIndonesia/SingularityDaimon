/*
 * Copyright (c) 2024 Stefanus Ayudha (stefanus.ayudha@gmail.com)
 * Created on 04/03/2024 12:00
 * You are not allowed to remove the copyright.
 */
package com.singularityindonesia.exception

sealed class MException(override val message: String) : Exception()
data class WildException(override val message: String, val throwable: Throwable?) : MException(message)
data class NullPointerException(override val message: String) : MException(message)
data class IOException(override val message: String) : MException(message)
data class UnHandledException(override val message: String) : MException(message)
