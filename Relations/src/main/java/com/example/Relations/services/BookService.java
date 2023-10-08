package com.example.Relations.services;

import com.example.Relations.model.Book;
import com.example.Relations.repo.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    IBookRepo iBookRepo;

    public String addBook(List<Book> newBook){
        iBookRepo.saveAll(newBook);
        return "Book Added";
    }

    public List<Book> getBooks(){
       return iBookRepo.findAll();
    }

    public String updateBook(Integer id,Integer price){
        Book pBook = iBookRepo.findById(id).orElse(null);
        if(pBook != null){
            pBook.setPrice(price);
            iBookRepo.save(pBook);
            return "Book Price Updated";
        }
        else
            return  "Book Not Found";
    }

    public String deleteBook(Integer id){
        iBookRepo.deleteById(id);
        return "Book Deleted";
    }

}
