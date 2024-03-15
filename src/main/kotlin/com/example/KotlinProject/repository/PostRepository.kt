package com.example.KotlinProject.repository

import com.example.KotlinProject.entity.Post
import com.example.KotlinProject.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository: JpaRepository<Post, Long>{
    fun findByAuthor(author: User): List<Post>
}