/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nhatp
 */
public class Book {
    private String id;
    private String name;
    private String description;
    private Category idcategory;
    private Author idauthor;
    private int amount;
    private String img;

    public Book() {
    }

    public Book(String id, String name, String description, Category idcategory, Author idauthor, int amount, String img) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.idcategory = idcategory;
        this.idauthor = idauthor;
        this.amount = amount;
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getIdcategory() {
        return idcategory;
    }

    public void setIdcategory(Category idcategory) {
        this.idcategory = idcategory;
    }

    public Author getIdauthor() {
        return idauthor;
    }

    public void setIdauthor(Author idauthor) {
        this.idauthor = idauthor;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    
}
