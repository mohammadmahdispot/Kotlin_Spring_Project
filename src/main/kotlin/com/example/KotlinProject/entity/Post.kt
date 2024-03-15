package com.example.KotlinProject.entity

import jakarta.persistence.ManyToOne
import org.springframework.data.annotation.Id
import java.time.LocalDateTime
import java.time.LocalTime

data class Post(
        @Id val id : Long?,
        val title : String,
        val content : String,
        @ManyToOne val author: User,
        val createdAt: LocalDateTime = LocalDateTime.now()
)
