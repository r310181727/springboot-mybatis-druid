package com.example.service;

import com.example.entity.Book;

import java.util.List;

/**
 * @Description
 * @Date: 2022/10/20 15:20
 */
public interface BookService {

    public List<Book> queryBook(Integer pageNum,Integer pageSize);

    public int addBook(Book book);

    public int delBook(int id);

    public int updateBook(Book book);
}
