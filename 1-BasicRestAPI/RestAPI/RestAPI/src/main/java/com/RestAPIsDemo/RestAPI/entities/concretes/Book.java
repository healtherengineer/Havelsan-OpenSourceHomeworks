package com.RestAPIsDemo.RestAPI.entities.concretes;

import com.RestAPIsDemo.RestAPI.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book extends BaseEntity {
    public Book(int id, String name, String author, String publishedYear, String category, String language) {
        super(id);
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
        this.category = category;
        this.language = language;
    }

    private String name ;
    private String author ;
    private String publishedYear;
    private String category ;
    private String language ;



}
