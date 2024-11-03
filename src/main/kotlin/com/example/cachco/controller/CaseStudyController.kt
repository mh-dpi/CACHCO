package com.example.cachco.controller

import com.example.cachco.entity.CaseStudy
import com.example.cachco.service.CaseStudyService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam


@Controller
class CaseStudyController(
    val caseStudyService: CaseStudyService
) {

    @GetMapping("/case-studies")
    fun caseStudies(model: Model): String {
        val caseStudies: List<CaseStudy> = caseStudyService.getLatestCaseStudies()
        model.addAttribute("caseStudies", caseStudies)
        return "case-studies"
    }

    @GetMapping("/case-studies/{id}")
    fun caseStudyDetails(@PathVariable id: Int, model: Model): String {
        val caseStudy = caseStudyService!!.getCaseStudyById(id.toLong())
        model.addAttribute("caseStudy", caseStudy)
        return "case-study-details"
    }

    @GetMapping("/case-studies/add")
    fun showAddCaseStudyForm(): String {
        return "add-case-study"
    }

    @PostMapping("/case-studies/add")
    fun addCaseStudy(
        @RequestParam title: String?,
        @RequestParam summary: String?,
        @RequestParam fullDescription: String?
    ): String {
        caseStudyService.addCaseStudy(CaseStudy(0,title!!, summary!!, fullDescription!!))
        return "redirect:/case-studies"
    }


}
