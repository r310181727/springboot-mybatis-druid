package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;
import java.util.UUID;

import static com.sun.xml.internal.ws.util.JAXWSUtils.getUUID;

/**
 * @Description
 * @Date: 2022/10/20 15:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book{
    private int id;
    private String name;
    private String author;

    public Book(String name,String author){
        this.name = name;
        this.author = author;
    }

}
