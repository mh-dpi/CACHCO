package com.example.cachco.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter
import java.io.IOException
import java.util.function.Consumer

@RestController
class AlertStreamController {
    private val emitters: MutableList<SseEmitter> = ArrayList()

    @GetMapping("/alerts/stream")
    fun stream(): SseEmitter {
        val emitter = SseEmitter()
        emitters.add(emitter)
        emitter.onCompletion { emitters.remove(emitter) }
        emitter.onTimeout { emitters.remove(emitter) }
        return emitter
    }

    fun sendAlert(message: String) {
        val deadEmitters: MutableList<SseEmitter> = ArrayList()
        emitters.forEach(Consumer { emitter: SseEmitter ->
            try {
                emitter.send(SseEmitter.event().name("alert").data(message))
            } catch (e: IOException) {
                deadEmitters.add(emitter)
            }
        })
        emitters.removeAll(deadEmitters)
    }
}


