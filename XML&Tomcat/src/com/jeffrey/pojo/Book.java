package com.jeffrey.pojo;

/**
 * @author jeffrey
 * @ClassName: Book
 * @Description:
 * @date: 2021/7/2 6:39 下午
 * @version:
 * @since JDK 1.8
 */


public class Book {
    private String sn;
    private String name;
    private int id;
    private String author;
    private double price;

    public Book(String sn, String name, int id, String author, double price) {
        this.sn = sn;
        this.name = name;
        this.id = id;
        this.author = author;
        this.price = price;
    }

    public Book() {
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "sn='" + sn + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
