package com.Apis.Apirest.controller.dto;


import com.Apis.Apirest.models.Book;

public class BookRs {

    private Integer id;
    private String name;
    private double price;
    private int quantity;
    private String category;
    private String img;

    public static BookRs converter(Book b){
        var book = new BookRs();
        book.setId(b.getId());
        book.setName(b.getName());
        book.setCategory(b.getCategory());
        book.setPrice(b.getPrice());
        book.setImg(b.getImg());
        book.setQuantity(b.getQuantity());

        return book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
