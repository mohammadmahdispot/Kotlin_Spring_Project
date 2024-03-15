package com.example.KotlinProject.service

import com.example.KotlinProject.entity.Post
import com.example.KotlinProject.entity.User
import org.springframework.stereotype.Service

@Service
interface PostService {

    fun createdPost(post: Post): Post
    fun createdPost(post: Post, author: User)
    fun getPostById(id: Long): Post?
    fun filterAndSearchPosts(keyword: String): List<Post>

}