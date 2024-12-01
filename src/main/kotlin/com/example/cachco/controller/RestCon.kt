package com.example.cachco.controller

import org.springframework.web.bind.annotation.*
import java.util.Date

@RestController
@RequestMapping("/attendance")
class AttendanceController {

    @PostMapping
    fun logAttendance(@RequestBody attendance: Attendance): String {
        // Set current timestamp
        attendance.timestamp = Date()

        // Log the received attendance object
        println("Received attendance: ${attendance.macAddress}, Timestamp: ${attendance.timestamp}")

        // Save to the database or perform further processing here
        // attendanceRepository.save(attendance)

        return "Attendance logged successfully!"
    }
}
