package com.example.cachco.service

import com.example.cachco.entity.LearningModule
import com.example.cachco.entity.Webinar

interface EducationService {
    fun getAllModules(): List<LearningModule>
    fun getModuleById( id:Long):LearningModule?
    fun getAllWebinars():List<Webinar>
    fun getWebinarById(id:Long):Webinar?
    fun addWebinar(webinar: Webinar)
}