package com.example.cachco.controller

import com.example.cachco.entity.Faq
import com.example.cachco.entity.Feedback
import com.example.cachco.service.SupportService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam


@Controller
class SupportController (
    val supportService: SupportService
){

    @GetMapping("/help-center")
    fun helpCenter(model: Model): String {
        val faqs = supportService.getAllFaqs()
        model.addAttribute("faqs", faqs)
        return "help-center"
    }

    @GetMapping("/help-center/add")
    fun showAddFaqForm(): String {
        return "add-faq"
    }

    @PostMapping("/help-center/add")
    fun addFaq(@RequestParam question: String?, @RequestParam answer: String?): String {
        supportService.addFaq(Faq(1,question!!, answer!!))
        return "redirect:/help-center"
    }

    @GetMapping("/feedback")
    fun feedback(model: Model): String {
        val feedbacks: List<Feedback> = supportService.getAllFeedback()
        model.addAttribute("feedbacks", feedbacks)
        return "view-feedback"
    }

    @GetMapping("/feedback/add")
    fun feedback(): String {
        return "feedback"
    }

    @PostMapping("/feedback")
    fun submitFeedback(@RequestParam message: String?): String {
        supportService.addFeedback(Feedback(1,message!!))
        return "redirect:/feedback"
    }
}
