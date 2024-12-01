package com.example.cachco.controller

import com.example.cachco.entity.UserModel
import com.example.cachco.service.UserService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import java.util.*


@Controller
class UserController(
    val userService: UserService
) {


    @GetMapping("/login")
    fun login(): String {
        return "login"
    }

    @PostMapping("/login")
    fun login(@RequestParam username: String, @RequestParam password: String, model: Model): String {
        val success: Boolean = userService.authenticate(username, password)
        if (success) {
            return "redirect:/profile"
        } else {
            model.addAttribute("error", "Invalid username or password")
            return "login"
        }
    }

    @GetMapping("/register")
    fun register(): String {
        return "register"
    }

    @PostMapping("/register")
    fun register(
        @RequestParam username: String,
        @RequestParam email: String,
        @RequestParam password: String
    ): String {
        userService.register(UserModel(0, username, email, password,"",""))
        return "redirect:/login"
    }

    @GetMapping("/forgot-password")
    fun forgotPassword(): String {
        return "forgot-password"
    }

    @PostMapping("/forgot-password")
    fun forgotPassword(@RequestParam email: String): String {
        userService.resetPassword(email)
        return "redirect:/login"
    }

    @GetMapping("/profile")
    fun profile(model: Model): String {
        val user: UserModel = userService.getCurrentUser()
        model.addAttribute("user", user)
        return "profile"
    }

    @PostMapping("/profile")
    fun updateProfile(@RequestParam username: String, @RequestParam email: String): String {
        userService.updateProfile(UserModel(0, username, email,"","",""))
        return "redirect:/profile"
    }

    @GetMapping("/logout")
    fun logout(): String {
        userService.logout()
        return "redirect:/login"
    }
}
