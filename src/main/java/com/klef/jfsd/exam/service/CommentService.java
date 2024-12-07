package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Comment;
import java.util.List;

public interface CommentService {
    List<Comment> getAllComments();
}