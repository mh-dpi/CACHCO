package com.example.cachco.service.impl

import com.example.cachco.entity.LearningModule
import com.example.cachco.entity.Webinar
import com.example.cachco.service.EducationService
import org.springframework.stereotype.Service


@Service
class EducationServiceImpl : EducationService {

    private val learningModule: MutableList<LearningModule> = ArrayList()
    private val webinars: MutableList<Webinar> = ArrayList()

    init {
        learningModule.add(LearningModule(1,"Title 1","this is description 1"))
        learningModule.add(LearningModule(2,"Title 2","this is description 2"))
        learningModule.add(LearningModule(3,"Title 3","this is description 3"))

        webinars.add(Webinar(1,"Title 1","this is description 1"))
        webinars.add(Webinar(2,"Title 2","this is description 2"))
        webinars.add(Webinar(3,"Title 3","this is description 3"))
    }


    override fun getAllModules(): List<LearningModule> {
        return learningModule.toList()
    }

    override fun getModuleById(id: Long): LearningModule? {
       return learningModule.find { it.id == id }
    }

    override fun getAllWebinars(): List<Webinar> {
        return webinars.toList()
    }

    override fun getWebinarById(id: Long): Webinar? {
        return webinars.find { it.id == id.toInt() }
    }
}