package com.example.library.services;

import com.example.library.models.Book;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LibraryService {

    private Map<Integer, Book> map;

    public LibraryService() {
        this.map = new HashMap<>();
    }
    public void addBook(Book book)
    {
        map.put( book.getIsbn(), book);
    }
    public Object getBook(int isbn)
    {
        return map.get( isbn);
    }
    public Object getAll()
    {
        return map.values();
    }
}
