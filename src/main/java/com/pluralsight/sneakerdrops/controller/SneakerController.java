package com.pluralsight.sneakerdrops.controller;

import com.pluralsight.sneakerdrops.models.Sneaker;
import com.pluralsight.sneakerdrops.service.SneakerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sneakers") // Writes an endpoint for all mapping
@CrossOrigin // Allows the front-end to communicate
public class SneakerController {

    private final SneakerService sneakerService;

    public SneakerController(SneakerService sneakerService) {
        this.sneakerService = sneakerService;
    }

    @GetMapping
    public List<Sneaker> getAll() {
        return sneakerService.allSneakers();
    }
}
