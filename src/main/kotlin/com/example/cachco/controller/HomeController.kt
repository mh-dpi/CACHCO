package com.example.cachco.controller

import com.example.cachco.service.AlertService
import com.example.cachco.service.CaseStudyService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping


@Controller
class HomeController (
    val caseStudyService: CaseStudyService,
    val alertService: AlertService
){

    @GetMapping("")
    fun home(model: Model): String {
        val caseStudies = caseStudyService.getLatestCaseStudies()
        val alerts = alertService.getRecentAlerts()
        model.addAttribute("caseStudies", caseStudies)
        model.addAttribute("alerts", alerts)
        return "home"
    }

}