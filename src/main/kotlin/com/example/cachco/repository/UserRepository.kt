package com.example.cachco.repository

import com.example.cachco.entity.UserModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<UserModel, Long> {
    fun findByUsername(username: String): UserModel?
    fun findByEmail(email: String): UserModel?
}