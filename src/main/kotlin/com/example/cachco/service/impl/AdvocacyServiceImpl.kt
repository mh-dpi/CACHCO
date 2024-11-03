package com.example.cachco.service.impl

import com.example.cachco.entity.AdvocacyAlert
import com.example.cachco.entity.VolunteerOpportunity
import com.example.cachco.service.AdvocacyService
import org.springframework.stereotype.Service


@Service
class AdvocacyServiceImpl:AdvocacyService {
    private val alerts: MutableList<AdvocacyAlert> = ArrayList()
    private val opportunities: MutableList<VolunteerOpportunity> = ArrayList()


    init {

        alerts.add(
            AdvocacyAlert(1,"Title 1","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Asperiores eos, et maxime quae quaerat ratione ullam unde veritatis. Adipisci aliquam at cum cupiditate deserunt doloremque eos esse et eum hic incidunt iure minus modi necessitatibus praesentium quaerat quia, rem repudiandae. Obcaecati pariatur quaerat tempora voluptatibus. Aliquam asperiores aspernatur autem eos, ipsam iste labore, neque obcaecati, pariatur quam quibusdam sunt!",),
        )
        alerts.add(  AdvocacyAlert(2,"Title 2","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Asperiores eos, et maxime quae quaerat ratione ullam unde veritatis. Adipisci aliquam at cum cupiditate deserunt doloremque eos esse et eum hic incidunt iure minus modi necessitatibus praesentium quaerat quia, rem repudiandae. Obcaecati pariatur quaerat tempora voluptatibus. Aliquam asperiores aspernatur autem eos, ipsam iste labore, neque obcaecati, pariatur quam quibusdam sunt!"),
        )
        alerts.add(
            AdvocacyAlert(3,"Title 3","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Asperiores eos, et maxime quae quaerat ratione ullam unde veritatis. Adipisci aliquam at cum cupiditate deserunt doloremque eos esse et eum hic incidunt iure minus modi necessitatibus praesentium quaerat quia, rem repudiandae. Obcaecati pariatur quaerat tempora voluptatibus. Aliquam asperiores aspernatur autem eos, ipsam iste labore, neque obcaecati, pariatur quam quibusdam sunt!"),
            )

        opportunities.add(
            VolunteerOpportunity(1,"Title 1","this is Description 1"),
        )
        opportunities.add(
            VolunteerOpportunity(2,"Title 2","this is Description 2"),
        )
        opportunities.add(
            VolunteerOpportunity(3,"Title 3","this is Description 3"),
        )

    }

    override fun getAllAlerts(): List<AdvocacyAlert> {
        return alerts.toList()
    }

    override fun getAlertById(id: Int): AdvocacyAlert? {
        return alerts.find { it.id == id.toLong() }
    }

    override fun addAlert(alert: AdvocacyAlert) {

        val alertId = alerts.last().id?.plus(1.toLong())
        alert.id = alertId?.toLong()
        alerts.add(alert)
    }

    override fun getAllOpportunities(): List<VolunteerOpportunity> {
        return opportunities.toList()
    }

    override fun getOpportunityById(id: Int): VolunteerOpportunity? {
        return opportunities.find { it.id == id }
    }

    override fun addOpportunity(opportunity: VolunteerOpportunity) {
        val opportunityId = opportunities.last().id.plus(1.toLong())
        opportunity.id=opportunityId.toInt()
        opportunities.add(opportunity)
    }
}