package com.example.Relations.controller;

import com.example.Relations.model.Book;
import com.example.Relations.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("book")
    public String addBook(@RequestBody List<Book> newBook){
        return bookService.addBook(newBook);
    }

    @GetMapping("books")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @PutMapping("book")
    public String updateBook(@RequestParam Integer id, @RequestParam Integer price){
        return  bookService.updateBook(id, price);
    }

    @DeleteMapping("book")
    public String deleteBook(@RequestParam Integer id){
        return bookService.deleteBook(id);
    }

}
