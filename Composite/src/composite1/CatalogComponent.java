package composite1;

public class CatalogComponent {

    public void add(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("kataloğa ürün eklenemiyor");
    }

    public void remove(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("Öğe katalogdan kaldırılamıyor");

    }

    public String getName() {
        throw new UnsupportedOperationException("Ad döndürülemiyor");

    }

    public double getPrice() {
        throw new UnsupportedOperationException("Fiyat döndürülemiyor");

    }

    public void print() {
        throw new UnsupportedOperationException("Yazdırılamıyor");
    }
}
