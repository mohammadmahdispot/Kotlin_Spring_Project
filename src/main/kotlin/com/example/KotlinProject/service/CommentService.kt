package com.example.KotlinProject.service

import com.example.KotlinProject.entity.Comment
import com.example.KotlinProject.entity.Post
import com.example.KotlinProject.entity.User

interface CommentService {

    fun createComment(comment: Comment): Comment
    fun createComment(comment: Comment, author: User, post: Post): Comment
    fun getCommentById(id: Long): Comment?

}