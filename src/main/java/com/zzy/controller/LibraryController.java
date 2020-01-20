package com.zzy.controller;

import com.zzy.model.po.Book;
import com.zzy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {
        @Autowired
        BookService bookService;

        @GetMapping("/books")
        @CrossOrigin
        public List<Book> list() throws Exception {
            return bookService.list();
        }

        @PostMapping("/books")
        @CrossOrigin
        public Book addOrUpdate(@RequestBody Book book) throws Exception {
            bookService.addOrUpdate(book);
            return book;
        }

        @PostMapping("/deleteBook")
        @CrossOrigin
        public void delete(@RequestBody Book book) throws Exception {
            bookService.deleteById(book.getId());
        }

        @GetMapping("/categories/{cid}/books")
        @CrossOrigin
        public List<Book> listByCategory(@PathVariable("cid") int cid) throws Exception {
            if (0 != cid) {
                return bookService.listByCategory(cid);
            } else {
                return list();
            }
        }
    }