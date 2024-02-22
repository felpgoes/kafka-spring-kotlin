package com.example.kafkaspring

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class KafkaController(val kafkaProducer: KafkaProducer) {
    @GetMapping("/event")
    fun sendKafkaEvent(
        @RequestParam("msg") msg: String,
    ): ResponseEntity<String> {
        kafkaProducer.sendEvent(msg)
        return ResponseEntity("Message sent by kafka", HttpStatus.OK)
    }
}
