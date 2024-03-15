package com.example.KotlinProject.service

import com.example.KotlinProject.entity.User

interface UserService {

    fun createUser(user: User): User
    fun getUserById(id: Long): User?
}