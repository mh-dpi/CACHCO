package com.example.cachco.service

import com.example.cachco.entity.UserModel


interface UserService {
    fun authenticate(username: String, password: String): Boolean
    fun register(user: UserModel): UserModel
    fun resetPassword(email: String)
    fun getCurrentUser(): UserModel
    fun updateProfile(user: UserModel): UserModel
    fun logout()
}