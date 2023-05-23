package org.example;

import java.util.List;

public class Main{
    public static void main(String[] args) {
        productsservice service = new productsservice();
        service.addproduct(new products("ubs", "cabel", "black desk", 2020));
        service.addproduct(new products("Asus", "lap", "tb", 0));
        service.addproduct(new products("acer", "lap", "cub", 980));
        service.addproduct(new products("babo", "tree", "cub", 90));
        service.addproduct(new products("mouse", "pc", "tb", 40));



        List<products> products = service.getall();
        for (products i : products) {
            System.out.println(i);
        }


    }
}