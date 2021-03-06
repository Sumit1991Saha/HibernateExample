package com.saha.simplestructure.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "com.saha.simplestructure.model.Book")
@Table(name = "book")
@Data
public class Book {

  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "title")
  private String title;

  @Column(name = "description")
  private String description;

  @Column(name = "unitCost")
  private Float unitCost;

  @Column(name = "isbn")
  private String isbn;

  @Column(name = "nbOfPage")
  private Integer nbOfPage;
}