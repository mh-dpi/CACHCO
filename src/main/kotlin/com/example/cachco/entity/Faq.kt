package com.example.cachco.entity

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

data class Faq(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,
    val question: String = "",
    val answer: String = "",

    )
