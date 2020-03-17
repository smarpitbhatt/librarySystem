package com.example.library.controllers;

import com.example.library.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.library.services.LibraryService;

@RestController
public class LibraryController {

    @Autowired
    LibraryService libraryService;

    @PostMapping("/add")
    public String addBook( @RequestBody Book book)
    {
        try
        {
            libraryService.addBook(book);
            return "Successfully added!" + book.toString();
        } catch (Exception e)
        {
            return "Error book not added!";
        }
    }

    @GetMapping("/get/{isbn}")
    public Object getBook(@PathVariable("isbn") int isbn)
    {
        Book book = (Book) libraryService.getBook( isbn);
        if(book==null)
            return new Object(){};
        else
            return book;
    }

    @GetMapping("/getall")
    public Object getAll()
    {
//        StringUtils
        return libraryService.getAll();
    }

}
