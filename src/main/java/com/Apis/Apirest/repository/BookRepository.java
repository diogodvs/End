package com.Apis.Apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Apis.Apirest.models.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
