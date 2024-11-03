package com.example.cachco.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Webinar(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int=0,
    val title: String="",
    val description: String="",
    val date: String="",
    val type: String="",
    val link: String="",
)
