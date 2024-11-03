package com.example.cachco.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Alert (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val message: String,
    val status: String,
    val type: String,
    val createdAt: Long,
    val userId: Long,
    val caseStudyId: Long? = null,
    val description: String = ""
)