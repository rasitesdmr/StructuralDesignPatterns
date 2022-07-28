package composite1;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog extends CatalogComponent {

    private List<CatalogComponent> items = new ArrayList<>();
    private String name;

    public ProductCatalog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        for (CatalogComponent catalogComponent : items)
            catalogComponent.print();
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }
}
