package com.example.mywebservice.controller;

import com.example.mywebservice.controller.model.PostRequest;
import com.example.mywebservice.controller.model.PostResponse;
import com.example.mywebservice.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;

    // 게시글 작성
    @PostMapping
    public ResponseEntity<PostResponse> createPost(@RequestBody PostRequest request) {
        PostResponse response = postService.createPost(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    // 게시글 목록 보기
    @GetMapping
    public ResponseEntity<List<PostResponse>> list() {
        List<PostResponse> posts = postService.getAllPosts();
        return ResponseEntity.ok(posts);
    }

    // 게시글 상세 보기
    @GetMapping("/{id}")
    public ResponseEntity<PostResponse> detail(@PathVariable Long id) {
        PostResponse response = postService.getPostById(id)
                .orElseThrow(() -> new RuntimeException("Post not found"));
        return ResponseEntity.ok(response);
    }

    // 게시글 수정하기
    @PutMapping("/{id}")
    public ResponseEntity<PostResponse> editPost(@PathVariable Long id, @RequestBody PostRequest request) {
        PostResponse response = postService.updatePost(id, request);
        return ResponseEntity.ok(response);
    }

    // 게시글 삭제하기
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        postService.deletePost(id);
        return ResponseEntity.noContent().build();
    }
}
