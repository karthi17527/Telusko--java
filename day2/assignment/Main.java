import java.util.List;

public class Main {
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
        System.out.println("======== particular product");
        products p = service.getparticular("acer");
        System.out.println(p);
        System.out.println("============ according to particular text");
        List<products> getparti = service.getaccor("Cub");
        for (products i : getparti) {
            System.out.println(i);
        }
        System.out.println("========= at a place");
        List<products> atplace = service.ataplace("tb");
        for (products i : atplace) {
            System.out.println(i);
        }
        System.out.println("======= out warranty");
        List<products> outwar = service.warrantyout(2023);
        for (products i : outwar) {
            System.out.println(i);
        }
    }
}