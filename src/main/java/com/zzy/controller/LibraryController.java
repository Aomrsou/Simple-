package com.zzy.controller;

import com.zzy.model.po.Book;
import com.zzy.model.po.Search;
import com.zzy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

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

    @CrossOrigin
    @PostMapping("/search")
    public List<Book> searchResult(@RequestBody Search s) throws Exception {
        // 关键字为空时查询所有书籍
        if ("".equals(s.getKeywords())) {
            return bookService.list();
        } else {
            return bookService.Search(s.getKeywords());
        }
    }

    @CrossOrigin
    @PostMapping("/covers")
    public String coversUpload(MultipartFile file) throws Exception {
        File path = new File(ResourceUtils.getURL("classpath:").getPath());
        if (!path.exists()) {
            path = new File("");
        }
        String folder = path.getAbsolutePath() + "\\static\\upload\\";
        File imageFoler = new File(folder);
        if (!imageFoler.exists()) {
            imageFoler.mkdirs();
        }
        File f = new File(imageFoler, UUID.randomUUID().toString() +
                file.getOriginalFilename().substring(file.getOriginalFilename().length() - 4));
        if (!f.getParentFile().exists()) {
            f.getParentFile().mkdirs();
        }
        try {
            file.transferTo(f);
            String imgURL = "http://39.105.72.22:8888/bs/upload/" + f.getName();
            return imgURL;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
