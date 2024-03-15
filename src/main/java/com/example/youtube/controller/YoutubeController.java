package com.example.youtube.controller;


import com.example.youtube.service.YoutubeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/youtube")
public class YoutubeController {

    private final YoutubeService youtubeService;

    @GetMapping
    public ResponseEntity<String> searchVideo(@RequestParam String keyword) throws IOException {
        String result = youtubeService.searchVideo(keyword);
        return ResponseEntity.ok(result);

    }
}
