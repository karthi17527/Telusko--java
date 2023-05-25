package org.example;

import java.util.ArrayList;
import java.util.List;

public class productsservice {
    List<products> products = new ArrayList<>();
    productdb db = new productdb();
    public void addproduct(products p) {

//        products.add(p);
        db.save(p);
    }



    public List<products> getall() {
        return db.getalldb();
    }



    public products getparticular(String name) {
        for (products i : products) {
            if (i.getName().equals(name)) {
                return i;
            }
        }
        return null;
    }

    public List<products> getaccor(String txt) {
        txt = txt.toLowerCase();
        List<products> parti = new ArrayList<>();
        for (products p : products) {
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if (name.contains(txt) || type.contains(txt) || place.contains(txt)) {
                parti.add(p);
            }
        }
        return parti;
    }

    public List<products> ataplace(String place) {
        List<products> b = new ArrayList<>();
        for (products i : products) {
            if (i.getPlace().equals(place)) {
                b.add(i);
            }
        }
        return b;
    }

    public List<products> warrantyout(int year) {
        List<products> out = new ArrayList<>();
        for (products i : products) {
            if (i.getWarranty() < year) {
                out.add(i);
            }
        }
        return out;
    }
}