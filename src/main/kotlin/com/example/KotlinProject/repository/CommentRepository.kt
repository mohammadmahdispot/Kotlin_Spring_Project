package com.example.KotlinProject.repository

import com.example.KotlinProject.entity.Comment
import com.example.KotlinProject.entity.Post
import com.example.KotlinProject.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface CommentRepository: JpaRepository<Comment, Long> {
    fun findByAuthor(author: User): List<Comment>
    fun findByPost(post: Post): List<Comment>
}