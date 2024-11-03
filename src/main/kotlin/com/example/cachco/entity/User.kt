package com.example.cachco.entity

data class User (
    val id: Long,
    val username: String,
    val email: String,
    val displayName: String,
    val avatarUrl: String,
    val password: String
)