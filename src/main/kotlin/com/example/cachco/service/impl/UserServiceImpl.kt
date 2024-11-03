package com.example.cachco.service.impl

import com.example.cachco.entity.User
import com.example.cachco.service.UserService
import org.springframework.boot.autoconfigure.security.SecurityProperties
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {
    override fun authenticate(username: String, password: String): Boolean {
        return true
    }

    override fun register(user: User): User {
      return user
    }

    override fun resetPassword(email: String) {
    }

    override fun getCurrentUser(): User {
       return User(id = 0,"mhr","a@gmail.com","MahmudulHasan","https://avatars.githubusercontent.com/u/107402929?v=4","123456")
    }

    override fun updateProfile(user: User): User {
        return user
    }
}