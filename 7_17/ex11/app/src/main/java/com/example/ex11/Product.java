package com.example.ex11;
/*
상품 이미지, 이름, 가격이 들어가는 클래스
 */
public class Product {
    int img;
    String name;
    int price;

    // 생성자
    public Product(int img, String name, int price) {
        this.img = img;
        this.name = name;
        this.price = price;
    }
}
