package com.krishna.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishna.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
