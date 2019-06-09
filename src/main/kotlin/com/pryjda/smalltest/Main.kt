package com.pryjda.smalltest

import com.google.api.client.util.Base64
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets

fun main(args: Array<String>) {
    println("show me")

//    val tokenString = String(JWT_TEST.toByteArray(Charset.forName("UTF-8")), Charset.forName("UTF-8"))
//    val tokenString = JWT_TEST
//    val firstDot = tokenString.indexOf('.')
//    val headerBytes = Base64.decodeBase64(tokenString.substring(0, firstDot))


//    val hb = java.util.Base64.getDecoder().decode(tokenString.substring(0, firstDot))

//    StandardCharsets.ISO_8859_1


/*    val hb = tokenString.toByteArray(Charsets.ISO_8859_1)
    val next = java.util.Base64.getDecoder().decode(hb)*/


//    val hb = java.util.Base64.getDecoder().decode(tokenString.substring(0, firstDot))


    /*val text = "jakiś text"

    val encodedText = Base64.encodeBase64(text.toByteArray())
    println("encodedText: ${encodedText}")
    val encodedText2 = Base64.encodeBase64String(text.toByteArray(Charsets.UTF_32LE))
    println("encodedText2: $encodedText2")

    val decodedtext2 = String(Base64.decodeBase64(encodedText2), Charsets.UTF_32LE)
    println("decodedText2: $decodedtext2")*/


    val text = DECODED_PAYLOAD

    val encodedText = Base64.encodeBase64(text.toByteArray())
    println("encodedText: ${encodedText}")
    val encodedText2 = Base64.encodeBase64String(text.toByteArray())
    println("encodedText2: $encodedText2")

    val decodedtext2 = String(Base64.decodeBase64(encodedText2), Charsets.ISO_8859_1)
    println("decodedText2: $decodedtext2")

    val tokenString = JWT_TEST
    val firstDot = tokenString.indexOf('.')
    val encodedPayload = tokenString.substring(0, firstDot)
//    println(encodedPayload)
//    println(DECODED_PAYLOAD)
    /*val decodedPayloadByItsOwn = String(java.util.Base64.getDecoder().decode(encodedPayload))
    println("decodedPayloadByItsOwn: $decodedPayloadByItsOwn")*/

    val decodedPayloadByItsOwn = String(java.util.Base64.getDecoder().decode(DP2))
    println("decodedPayloadByItsOwn: $decodedPayloadByItsOwn")


//    val decodedPayload = String(Base64.decodeBase64(encodedPayload), Charsets.US_ASCII)
//    java.util.Base64.getUrlDecoder().decode(encodedPayload)
//    val decodedPayload = String(java.util.Base64.getDecoder().decode(encodedPayload))
//    println("decodedPayload: $decodedPayload")

}