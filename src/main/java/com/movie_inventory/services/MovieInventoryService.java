package com.movie_inventory.services;

import com.movie_inventory.model.Multiplex;
import com.movie_inventory.repository.MultiplexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieInventoryService {
    @Autowired
    private MultiplexRepository multiplexrepository;

    public Multiplex addMultiplex(Multiplex multiplex) {
        try{
            return multiplexrepository.save(multiplex);
        }catch (Exception ex) {
            System.out.println();
            throw new RuntimeException();
        }
    }
}
