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







}

