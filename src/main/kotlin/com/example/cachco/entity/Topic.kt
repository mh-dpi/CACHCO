package com.example.cachco.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Topic(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    var title: String,
    var description: String,
)
