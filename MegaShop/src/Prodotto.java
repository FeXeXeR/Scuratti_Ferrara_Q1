public class Prodotto {
    String nome;
    double prezzo;
    int ID;

    public Prodotto(String nome, double prezzo, int ID) {
        this.nome = nome;
        this.prezzo = (Math.round(prezzo*100.00)/100.00);
        this.ID = ID;
    }
}
