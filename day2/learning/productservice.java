import java.util.ArrayList;
import java.util.List;

public class productservice {
    List<products> products = new ArrayList<>();

    public void addproduct(products p) {
        products.add(p);
    }

    public List<products> getall() {
        return products;
    }

    public products getproduct(String name) {
        for (products i : products) {
            if (i.getName().equals(name)) {
                return i;
            }
        }
        return null;
    }

    public List<products> getparticular(String txt) {
        List<products> parti = new ArrayList<>();
        txt = txt.toLowerCase();
        for (products p : products) {
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            int warranty = p.getWarranty();
            if (name.contains(txt) || type.contains(txt) || place.contains(txt)) {
                parti.add(p);
            }
        }
        return parti;
    }
}
