package com.Apis.Apirest.controller;

import com.Apis.Apirest.repository.BookRepository;
import org.springframework.web.bind.annotation.*;
import com.Apis.Apirest.controller.dto.BookRs;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookRepository bookRep;

    public BookController(BookRepository bookRep) {
        this.bookRep = bookRep;
    }

    @GetMapping("/getAll")
    public List<BookRs> findAll(){
        var books = bookRep.findAll();
        return books
                .stream()
                .map(BookRs::converter)            //Converte books Rs para b (BookRs.converter(b))
                .collect(Collectors.toList());     // coleta a conversao e forma uma lista
    }
}
