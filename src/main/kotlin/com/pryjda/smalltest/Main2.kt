package com.pryjda.smalltest

import com.google.api.client.util.Base64

fun main(args: Array<String>) {
    val text_jwt = JWT_TEST.replace(System.getProperty("line.separator"), "")
//    println(String(Base64.decodeBase64(text_jwt)))
    val firstDot = text_jwt.indexOf('.')
    println(String(java.util.Base64.getDecoder().decode(text_jwt.substring(0, firstDot))))

    val payload_jwt = PAY.replace(System.getProperty("line.separator"), "")
    println(String(java.util.Base64.getDecoder().decode(payload_jwt)))







}

//return new JsonWebSignature(header, payload, signatureBytes, signedContentBytes);