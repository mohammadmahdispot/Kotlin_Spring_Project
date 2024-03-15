package com.example.KotlinProject.service.impl

import com.example.KotlinProject.entity.Comment
import com.example.KotlinProject.entity.Post
import com.example.KotlinProject.entity.User
import com.example.KotlinProject.repository.CommentRepository
import com.example.KotlinProject.service.CommentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class CommentServiceImpl @Autowired constructor(private val commentRepository: CommentRepository) : CommentService {

    override fun createComment(comment: Comment, author: User, post: Post): Comment {
        comment.author = author
        comment.post = post
        return commentRepository.save(comment)
    }

    override fun getCommentById(id: Long): Optional<Comment> {
        return commentRepository.findById(id)
    }

    override fun createComment(comment: Comment): Comment {
        return commentRepository.save(comment)
    }
}