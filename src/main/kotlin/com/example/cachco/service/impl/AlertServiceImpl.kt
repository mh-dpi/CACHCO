package com.example.cachco.service.impl

import com.example.cachco.controller.AlertStreamController
import com.example.cachco.entity.Alert
import com.example.cachco.service.AlertService
import org.springframework.stereotype.Service
import java.util.concurrent.CopyOnWriteArrayList


@Service
class AlertServiceImpl(
    val alertStreamController:AlertStreamController
): AlertService {

    private val alerts: MutableList<Alert> = CopyOnWriteArrayList()


    override fun getAllAlerts(): List<Alert> {
        return alerts
    }

    override fun addAlert(message: String) {
        val alert = Alert(0,message,"NEW","INFO",System.currentTimeMillis(),1)
        alerts.add(alert)
        alertStreamController.sendAlert(message)
    }

    override fun getRecentAlerts(): List<Alert> {
        return listOf(
             Alert(1,"Alert message 1","NEW","INFO",System.currentTimeMillis(),1),
             Alert(2,"Alert message 2","NEW","INFO",System.currentTimeMillis(),1),
        )
    }



}