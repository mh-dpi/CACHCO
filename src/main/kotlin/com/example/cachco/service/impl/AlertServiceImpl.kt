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

    init {

        alerts.add(
            Alert(
                1,
                "Bribery Incident Reported in Local Office",
                "NEW",
                "WARNING",
                System.currentTimeMillis(),
                1
            )
        )

        alerts.add(
            Alert(
                2,
                "Suspicious Increase in Project Costs Noted",
                "NEW",
                "INFO",
                System.currentTimeMillis(),
                2
            )
        )

        alerts.add(
            Alert(
                3,
                "Unapproved Land Use Detected Near Riverside",
                "NEW",
                "ALERT",
                System.currentTimeMillis(),
                3
            )
        )

        alerts.add(
            Alert(
                4,
                "Unauthorized Charges Reported at Public Office",
                "NEW",
                "WARNING",
                System.currentTimeMillis(),
                4
            )
        )

        alerts.add(
            Alert(
                5,
                "Successful Prosecution of Corruption Case",
                "NEW",
                "SUCCESS",
                System.currentTimeMillis(),
                5
            )
        )

        alerts.add(
            Alert(
                6,
                "Fraudulent Job Listings Found in Local Paper",
                "NEW",
                "ALERT",
                System.currentTimeMillis(),
                6
            )
        )

        alerts.add(
            Alert(
                7,
                "Unexplained Delays in Road Project Completion",
                "NEW",
                "INFO",
                System.currentTimeMillis(),
                7
            )
        )

        alerts.add(
            Alert(
                8,
                "New Transparency Policy Implemented by Council",
                "NEW",
                "SUCCESS",
                System.currentTimeMillis(),
                8
            )
        )

        alerts.add(
            Alert(
                9,
                "Funds Allocated for School Development Missing",
                "NEW",
                "WARNING",
                System.currentTimeMillis(),
                9
            )
        )

        alerts.add(
            Alert(
                10,
                "Whistleblower Support Line Launched",
                "NEW",
                "INFO",
                System.currentTimeMillis(),
                10
            )
        )


    }

    override fun addAlert(message: String) {
        val alert = Alert(0,message,"NEW","INFO",System.currentTimeMillis(),1)
        alerts.add(alert)
        alertStreamController.sendAlert(message)
    }

    override fun getRecentAlerts(): List<Alert> {
        return alerts.toList()
    }



}