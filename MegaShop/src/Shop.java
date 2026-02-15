import java.util.ArrayList;
import java.util.InputMismatchException;

public class Shop {
    ArrayList<Prodotto> prodotti = new ArrayList<>();

    public Shop() {
        prodotti.add(new Prodotto("Olio", 9.99, 1));
        prodotti.add(new Prodotto("Pane", 4.59, 2));
        prodotti.add(new Prodotto("Acqua", 0.99, 3));
    }

    public double buy(int productID) {
        double price = 0;
        for (Prodotto prodotto : prodotti) {
            if(prodotto.ID == productID) {
                price = prodotto.prezzo;
                System.out.println("Prodotto " + prodotto.nome + " Comprato!");
                return price;
            }
        }
        return 0;
    }

    public void printShop() {
        for (Prodotto prodotto : prodotti) {
            System.out.println(prodotto.ID + " - " + prodotto.nome + " $" + prodotto.prezzo);

        }
    }

    public void addProduct(String nome, double prezzo) throws InputMismatchException, NumberFormatException {

        prodotti.add(new Prodotto(nome, prezzo, (prodotti.getLast().ID)+1));
    }
}
