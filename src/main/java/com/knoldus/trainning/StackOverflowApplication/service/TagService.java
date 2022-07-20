package com.knoldus.trainning.StackOverflowApplication.service;

import com.knoldus.trainning.StackOverflowApplication.entity.Tag;
import com.knoldus.trainning.StackOverflowApplication.repository.TagRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagService {

    @Autowired
    private TagRepository tagRepository;

    List <Tag> tagList = new ArrayList<>();

    public Optional<Tag> getAllTag(Long tagId) {
        return tagRepository.findById(tagId);
    }

    public Optional<Tag> getAllTagByName(String name){
        return tagRepository.findByName(name);
    }

    public List<Tag> getAllTagsList() {
        tagList = (List<Tag>) tagRepository.findAll();
        return tagList;
    }


    public void  save(Tag tag) {
        tagRepository.save(tag);
    }

    public void deleteById(Long id) {
        tagRepository.deleteById(id);
    }
}
