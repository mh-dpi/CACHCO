package com.example.cachco.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AdminController {
    @GetMapping("/admin-dashboard")
    fun adminDashboard(): String {
        return "admin-dashboard"
    }

    @GetMapping("/admin-dashboard/users")
    fun manageUsers(model: Model?): String {
        // Fetch user data logic
        return "manage-users"
    }

    @GetMapping("/admin-dashboard/case-studies")
    fun manageCaseStudies(model: Model?): String {
        // Fetch case studies data logic
        return "manage-case-studies"
    }

    @GetMapping("/admin-dashboard/alerts")
    fun manageAlerts(model: Model?): String {
        // Fetch alerts data logic
        return "manage-alerts"
    }

}

