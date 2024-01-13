package com.example.whattowear.controller;

import com.example.whattowear.model.Clothes;
import com.example.whattowear.repository.ClothesRepository;
import com.example.whattowear.service.ClothesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class ClothesController {


    @Autowired
    private ClothesService clothesService;
    ClothesRepository repo;

    @GetMapping
    public List<Clothes> getAllClothes() {
        return clothesService.getAllClothes();
    }

/*
@GetMapping
    public List<Clothes> getAll() {
        Iterable<Clothes> iterator = repo.findAll();
        List<Clothes> clothes = new ArrayList<Clothes>();
        for (Clothes clothe : iterator)  clothes.add(clothe);
        return clothes;
    }
    // Other CRUD endpoints

 */
}
