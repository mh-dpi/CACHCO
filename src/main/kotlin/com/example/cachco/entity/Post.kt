package com.example.cachco.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


@Entity
data class Post(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val topicId: String,
    val content: String,
    val username: String,
)
