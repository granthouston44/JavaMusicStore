import accessories.GuitarStrings;
import instruments.Drums;
import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StoreTest {

    private Store store;
    private Drums drums;
    private Guitar guitar;
    private GuitarStrings strings;


    @Before
    public void before(){
        store = new Store();
        drums = new Drums("drum skin", "blue", InstrumentType.PERCUSSION, 200, 350, "junior kit");
        guitar = new Guitar("mahogony", "black",InstrumentType.STRING, 300, 425);
        strings = new GuitarStrings("Ernie balls", 5, 20, "good set of strings");
    }

    @Test
    public void canAddToStock(){
        store.addToStock(drums);
        store.addToStock(guitar);
        store.addToStock(strings);
        assertEquals(3, store.getStock().size());
    }

    @Test
    public void canRemoveFromStock(){
        store.addToStock(drums);
        store.addToStock(guitar);
        store.addToStock(strings);
        store.removeFromStock(strings);
        assertEquals(2, store.getStock().size());
    }

    @Test
    public void canRemoveSpecificFromStock(){
        store.addToStock(drums);
        store.addToStock(guitar);
        store.addToStock(strings);
        store.removeFromStock(strings);
        assertEquals(false, store.getStock().contains(strings));
    }

}
