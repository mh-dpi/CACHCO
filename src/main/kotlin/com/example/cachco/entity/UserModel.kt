package com.example.cachco.entity

import jakarta.persistence.*

@Entity
data class UserModel (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long=0,
    var username: String="",
    var email: String="",
    var displayName: String="",
    var avatarUrl: String="",
    var password: String="",
)

