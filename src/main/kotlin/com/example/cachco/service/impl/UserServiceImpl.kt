package com.example.cachco.service.impl

import com.example.cachco.entity.UserModel
import com.example.cachco.repository.UserRepository
import com.example.cachco.service.UserService
import jakarta.servlet.http.HttpSession
import org.springframework.boot.autoconfigure.security.SecurityProperties
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    val userRepository: UserRepository,
    val session:HttpSession
) : UserService {
    override fun authenticate(username: String, password: String): Boolean {
        val user = userRepository.findByUsername(username)
        if (user != null) {
            if (user.password == password) {
                session.setAttribute("currentUser", user);
                return true
            }
        }
        return false
    }

    override fun register(user: UserModel): UserModel {
      return userRepository.save(user)
    }

    override fun resetPassword(email: String) {
        val user = userRepository.findByEmail(email)
        if (user != null) {

        }
    }

    override fun getCurrentUser(): UserModel {
       return session.getAttribute("currentUser") as UserModel
    }

    override fun updateProfile(user: UserModel): UserModel {
        return userRepository.save(user)
    }

    override fun logout() {
        session.removeAttribute("currentUser")
    }
}