package com.example.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Movies;

public interface IMoviesRepo extends JpaRepository<Movies, Integer> {

}
