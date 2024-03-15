package com.example.KotlinProject.service.impl

import com.example.KotlinProject.entity.Post
import com.example.KotlinProject.entity.User
import com.example.KotlinProject.repository.PostRepository
import com.example.KotlinProject.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import java.util.*

class PostServiceimpl @Autowired constructor(private val postRepository: PostRepository) : PostService {

    override fun createBlogPost(post: Post, author: User): Post {
        post.author = author
        return postRepository.save(post)
    }

    override fun getBlogPostById(id: Long): Optional<Post> {
        return postRepository.findById(id)
    }

    override fun filterAndSearchBlogPosts(keyword: String): List<Post> {
        return postRepository.findByTitleOrContent(keyword, keyword)
    }

    override fun createBlogPost(post: Post): Post {
        return postRepository.save(post)
    }
}