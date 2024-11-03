package com.example.cachco.service

import com.example.cachco.entity.AdvocacyAlert
import com.example.cachco.entity.VolunteerOpportunity

interface AdvocacyService {

    fun getAllAlerts():List<AdvocacyAlert>
    fun getAlertById( id:Int):AdvocacyAlert?
    fun addAlert( alert: AdvocacyAlert)
    fun getAllOpportunities():List<VolunteerOpportunity>
    fun getOpportunityById(id:Int):VolunteerOpportunity?
   fun addOpportunity(opportunity:VolunteerOpportunity)


}