package com.example.cachco.service

import com.example.cachco.entity.CaseStudy

interface CaseStudyService {
    fun getLatestCaseStudies(): List<CaseStudy>
    fun getCaseStudyById(id: Long): CaseStudy
    fun addCaseStudy(caseStudy: CaseStudy)
}