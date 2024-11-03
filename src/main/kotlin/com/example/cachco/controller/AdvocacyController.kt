package com.example.cachco.controller

import com.example.cachco.entity.AdvocacyAlert
import com.example.cachco.entity.VolunteerOpportunity
import com.example.cachco.service.AdvocacyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class AdvocacyController(
    val advocacyService: AdvocacyService
) {

    @GetMapping("/advocacy-alerts")
    fun advocacyAlerts(model: Model): String {
        val alerts = advocacyService.getAllAlerts()
        model.addAttribute("alerts", alerts)
        return "advocacy-alerts"
    }

    @GetMapping("/volunteer-opportunities")
    fun volunteerOpportunities(model: Model): String {
        val opportunities = advocacyService.getAllOpportunities()
        model.addAttribute("opportunities", opportunities)
        return "volunteer-opportunities"
    }

    @GetMapping("/advocacy-alerts/{id}")
    fun alertDetails(@PathVariable id: Int, model: Model): String {
        val alert = advocacyService.getAlertById(id)
        model.addAttribute("alert", alert)
        return "alert-details"
    }

    @GetMapping("/volunteer-opportunities/{id}")
    fun opportunityDetails(@PathVariable id: Int, model: Model): String {
        val opportunity = advocacyService.getOpportunityById(id)
        model.addAttribute("opportunity", opportunity)
        return "opportunity-details"
    }

    @GetMapping("/advocacy-alerts/add")
    fun showAddAlertForm(): String {
        return "add-advocacy-alert"
    }

    @PostMapping("/advocacy-alerts/add")
    fun addAlert(@RequestParam title: String?, @RequestParam description: String?): String {
        advocacyService.addAlert(AdvocacyAlert(1,title!!, description!!))
        return "redirect:/advocacy-alerts"
    }

    @GetMapping("/volunteer-opportunities/add")
    fun showAddOpportunityForm(): String {
        return "add-volunteer-opportunity"
    }

    @PostMapping("/volunteer-opportunities/add")
    fun addOpportunity(@RequestParam title: String?, @RequestParam description: String?): String {
        advocacyService.addOpportunity(VolunteerOpportunity(1,title!!, description!!))
        return "redirect:/volunteer-opportunities"
    }
}
