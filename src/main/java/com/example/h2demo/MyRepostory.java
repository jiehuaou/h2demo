package com.example.h2demo;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MyRepostory extends CrudRepository<Emp, Long> {
//    Optional<Emp> findById(Long id);
}
