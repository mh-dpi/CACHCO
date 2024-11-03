package com.example.cachco.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class VolunteerOpportunity (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    val title: String,
    val description: String,
)