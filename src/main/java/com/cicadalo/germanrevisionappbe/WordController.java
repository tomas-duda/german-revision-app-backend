package com.cicadalo.germanrevisionappbe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") // Allow requests from the frontend
public class WordController {

    @Autowired
    private WordService wordService;

    @GetMapping("/words")
    public List<Word> getWords() {
        return wordService.getAllWords();
    }

    @PostMapping("/words")
    public Word addWord(@RequestBody Word word) {
        return wordService.addWord(word);
    }
}