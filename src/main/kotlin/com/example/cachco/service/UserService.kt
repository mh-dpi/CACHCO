package com.example.cachco.service

import com.example.cachco.entity.User

interface UserService {
    fun authenticate(username: String, password: String): Boolean
    fun register(user: User): User
    fun resetPassword(email: String)
    fun getCurrentUser(): User
    fun updateProfile(user: User): User
}