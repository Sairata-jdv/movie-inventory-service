package com.movie_inventory.controller;

import com.movie_inventory.model.Multiplex;
import com.movie_inventory.services.MovieInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("multiplex")
public class MovieInventoryController {
    @Autowired
    MovieInventoryService movieInventoryService;
    @PostMapping
    public Multiplex addMultiplex(@RequestBody Multiplex multiplex){
        return movieInventoryService.addMultiplex(multiplex);
    }
}
