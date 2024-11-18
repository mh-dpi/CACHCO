package com.example.cachco.controller

import com.example.cachco.entity.Webinar
import com.example.cachco.service.EducationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class EducationController {
    @Autowired
    private val educationService: EducationService? = null

    @GetMapping("/learning-modules")
    fun learningModules(model: Model): String {
        val modules = educationService!!.getAllModules()
        model.addAttribute("modules", modules)
        return "learning-modules"
    }

    @GetMapping("/webinars")
    fun webinars(model: Model): String {
        val webinars = educationService!!.getAllWebinars()
        model.addAttribute("webinars", webinars)
        return "webinars"
    }



    @GetMapping("/learning-modules/{id}")
    fun moduleDetails(@PathVariable id: Int, model: Model): String {
        val module = educationService!!.getModuleById(id.toLong())
        model.addAttribute("module", module)
        return "learning-modules-details"
    }

    @GetMapping("/webinars/{id}")
    fun webinarDetails(@PathVariable id: Int, model: Model): String {
        val webinar = educationService!!.getWebinarById(id.toLong())
        model.addAttribute("webinar", webinar)
        return "webinar-details"
    }


    @GetMapping("/webinars/add")
    fun showAddWebinarForm(): String {
        return "add-webinar"
    }

    @PostMapping("/webinars/add")
    fun addWebinar(@RequestParam title: String, @RequestParam description: String, @RequestParam date: String, @RequestParam type: String, @RequestParam link: String, @RequestParam duration: Int, @RequestParam speaker: String, @RequestParam organization: String): String {
        val webinar = Webinar(0, title, description, date, type, link, duration, speaker, organization)
        educationService!!.addWebinar(webinar)
        return "redirect:/webinars"
    }
}
