package com.example.cachco.service

import com.example.cachco.entity.Alert

interface AlertService {
    fun getRecentAlerts(): List<Alert>
   fun getAllAlerts(): List<Alert>
   fun addAlert( message:String)
}