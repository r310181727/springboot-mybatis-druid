package com.example.controller;

import com.example.entity.Book;
import com.example.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description
 * @Date: 2022/10/20 15:15
 */

@RestController
@Slf4j
public class BookController {
    @Autowired
    private BookService bookService;

    //http://localhost:8080/queryBook?pageNum=1&pageSize=5
    @RequestMapping(value = "/queryBook",method = RequestMethod.GET)
    public List<Book> queryBook(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
        pageNum = (pageNum-1);
        List<Book> book = bookService.queryBook(pageNum,pageSize);
        log.info("查询结果：{}",book);
        return book;
    }

    //http://localhost:8080/addBook?name=资治通鉴&author=司马迁
    @RequestMapping(value = "/addBook",method = RequestMethod.GET)
    public String addBook(Book book){
        book.setId((int)(Math.random()*9000)+1000);
        int i = bookService.addBook(book);
        if(i >= 1){
            return "新增book成功,bookId为："+book.getId();
            //23213
        }else {
            return "新增book失败";
        }
    }

    //通过id删除
    //http://localhost:8080/delBook/1748
    @RequestMapping(value = "/delBook/{id}",method = RequestMethod.GET)
    public String delBook(@PathVariable("id") int id){
        int i = bookService.delBook(id);
        if(i >= 1){
            return "刪除book成功";
        }else {
            return "刪除book失败";
        }
    }

    //http://localhost:8080/updateBook?id=4&name=资治通鉴&author=司马迁
    @RequestMapping(value = "/updateBook",method = RequestMethod.GET )
    public String updateBook(Book book){
        int i = bookService.updateBook(book);
        if(i >= 1){
            return "修改book成功";
        }else {
            return "修改book失败";
        }
    }
}

