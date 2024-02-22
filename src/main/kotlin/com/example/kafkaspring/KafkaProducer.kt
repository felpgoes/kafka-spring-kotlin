package com.example.kafkaspring

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class KafkaProducer(val kafkaTemplate: KafkaTemplate<String, String>) {
    fun sendEvent(message: String) {
        kafkaTemplate.send(AppConstants.TOPIC_NAME, message)
    }
}
