package com.example.kafkaspring

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class KafkaConsumer {
    @KafkaListener(topics = [AppConstants.TOPIC_NAME])
    fun listen(msg: String) {
        println("Message Received - $msg")
    }
}
