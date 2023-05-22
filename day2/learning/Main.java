import java.util.List;

public class Main {
    public static void main(String[] args) {
        productservice service = new productservice();
        service.addproduct(new products("Asus", "lap", "tb", 0));
        service.addproduct(new products("acer", "lap", "cub", 980));
        service.addproduct(new products("babo", "tree", "cub", 90));
        service.addproduct(new products("mouse", "pc", "tb", 40));
        List<products> products = service.getall();
        for (products i : products) {
            System.out.println(i);
        }
        System.out.println("=======================");
        System.out.println(" a particulat product");
        products p = service.getproduct("acer");
        System.out.println(p);
        System.out.println("=======================");
        System.out.println(" a particulat text");
        List<products> prods = service.getparticular("cub");
        System.out.println(prods);
    }
}
