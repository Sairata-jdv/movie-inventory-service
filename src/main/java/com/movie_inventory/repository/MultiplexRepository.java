package com.movie_inventory.repository;


import com.movie_inventory.model.Multiplex;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MultiplexRepository extends JpaRepository<Multiplex,Long> {
}
