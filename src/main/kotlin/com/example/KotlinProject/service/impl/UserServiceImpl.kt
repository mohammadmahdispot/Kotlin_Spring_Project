package com.example.KotlinProject.service.impl

import com.example.KotlinProject.config.PasswordConfig
import com.example.KotlinProject.entity.User
import com.example.KotlinProject.repository.UserRepository
import com.example.KotlinProject.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImpl @Autowired constructor(private val userRepository: UserRepository,
                                             private val passwordEncoder: PasswordConfig
) : UserService {
    override fun createUser(user: User): User {
        val hashedPassword = passwordEncoder.encode(user.password)
        user.password = hashedPassword
        return userRepository.save(user)
    }

    override fun getUserById(id: Long): Optional<User> {
        return userRepository.findById(id)
    }
}