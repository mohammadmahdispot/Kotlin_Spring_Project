package com.example.KotlinProject.entity

import jakarta.persistence.ManyToOne
import org.springframework.data.annotation.Id
import java.time.LocalDateTime

data class Comment(
        @Id val id: Long?,
        val text : String,
        @ManyToOne val author : User,
        @ManyToOne val post: Post,
        val createdAt: LocalDateTime = LocalDateTime.now(),
)
