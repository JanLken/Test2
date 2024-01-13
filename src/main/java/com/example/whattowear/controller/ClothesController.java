package com.example.whattowear.controller;

import com.example.whattowear.model.Clothes;
import com.example.whattowear.service.ClothesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ClothesController {

    @Autowired
    private ClothesService clothesService;

    @GetMapping
    public List<Clothes> getAllClothes() {
        return clothesService.getAllClothes();
    }

    // Other CRUD endpoints
}
