package com.example.KotlinProject.entity

import org.springframework.data.annotation.Id

data class User(
        @Id val username : String,
        val email : String,
        val passsword : String,
        val profileImage : String
)
