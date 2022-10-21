package com.example.service.Impl;

import com.example.entity.Book;
import com.example.mapper.BookMapper;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description
 * @Date: 2022/10/20 15:21
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> queryBook(Integer pageNum,Integer pageSize) {
        List<Book> book = bookMapper.queryBook(pageNum,pageSize);
        return book;
    }
    @Override
    @Transactional
    public int addBook(Book book) {

        int i = bookMapper.addBook(book);
        return i;
    }

    @Override
    @Transactional
    public int delBook(int id) {
        int i = bookMapper.delBook(id);
        return i;
    }

    @Override
    @Transactional
    public int updateBook(Book book) {
        int i = bookMapper.updateBook(book);
        return i;
    }

}

