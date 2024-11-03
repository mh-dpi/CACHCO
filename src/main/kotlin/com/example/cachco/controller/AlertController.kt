package com.example.cachco.controller

import com.example.cachco.service.AlertService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam


@Controller
class AlertController(
    val alertService: AlertService
) {

    @GetMapping("/alerts")
    fun alerts(model: Model): String {
        val alerts = alertService.getAllAlerts()
        model.addAttribute("alerts", alerts)
        return "alerts"
    }

    @GetMapping("/alerts/add")
    fun showAddAlertForm(): String {
        return "add-alert"
    }

    @PostMapping("/alerts/add")
    fun addAlert(@RequestParam message: String?): String {
        alertService.addAlert(message!!)
        return "redirect:/alerts"
    }
}

