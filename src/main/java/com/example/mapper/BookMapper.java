package com.example.mapper;

import com.example.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @Description
 * @Date: 2022/10/20 15:22
 */
@Mapper
@Repository
public interface BookMapper {
    //查询
    List<Book> queryBook(Integer pageNum,Integer pageSize);
    //增加
    public int addBook(Book book);
    //删除图书
    public int delBook(int id);
    //修改图书
    public int updateBook(Book book);
}
