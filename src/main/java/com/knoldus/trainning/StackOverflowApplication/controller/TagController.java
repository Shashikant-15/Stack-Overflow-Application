package com.knoldus.trainning.StackOverflowApplication.controller;

import com.knoldus.trainning.StackOverflowApplication.entity.Tag;
import com.knoldus.trainning.StackOverflowApplication.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tags")
public class TagController {
    @Autowired
    private TagService tagService;

    @GetMapping()
    public List<Tag> getAllTagsList() {
        return tagService.getAllTagsList();
    }

    @GetMapping("/{name}")
    public Optional<Tag> getAllTagsByName(@PathVariable String name) {
        return tagService.getAllTagByName(name);
    }

    @PostMapping()
    public void AddTag(@RequestBody Tag tag) {

    }
}
