import java.util.ArrayList;

public class Inventory {
    ArrayList<Prodotto> prodotti = new ArrayList<>();

    public double costSum() {
        double totPrice = 0;
        for (Prodotto prodotto : prodotti) {
            totPrice += prodotto.prezzo;
        }
        return totPrice;
    }
}
