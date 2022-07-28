package composite1;

import org.junit.Test;
public class Main {

    @Test
    public void testPrint() throws Exception {
        // Ana katalog için birincil ürünler oluşturun
        CatalogComponent mPantalon = new Product("M : Dar kesim ",100);
        CatalogComponent sElbise = new Product("S : Tshirt",90);

        CatalogComponent newCatalog = new ProductCatalog("Kadın ürünleri ");
        CatalogComponent fPantolon = new Product("F : Dar pantalon " ,150 );
        CatalogComponent fElbise = new Product("F : Tshirt " ,120 );
        newCatalog.add(fPantolon);
        newCatalog.add(fElbise);
        newCatalog.print();




    }
}
