package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    private static final String JSON_PLACEHOLDER_URL = "https://jsonplaceholder.typicode.com/comments";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Comment> getAllComments() {
        ResponseEntity<List<Comment>> response = restTemplate.exchange(
            JSON_PLACEHOLDER_URL,
            HttpMethod.GET,
            null,
            new ParameterizedTypeReference<List<Comment>>() {}
        );
        return response.getBody();
    }
}