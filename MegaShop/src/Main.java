import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double balance = 0;
        Inventory inv = new Inventory();
        Shop shop = new Shop();

        int selector;
        while(true) {
            System.out.println("### Shop Front ###");
            shop.printShop();
            System.out.println("$" + balance);
            selector = in.nextInt();

            switch (selector) {
                default: {
                    System.out.println("Il numero inserito non corrisponde a nessun'azione, riprova.");
                    break;
                }
                case 1: {
                    balance -= shop.buy(in.nextInt());
                    break;
                }
                case 2: {
                    try {
                        in.nextLine();
                        String nome = in.nextLine();
                        double prezzo = Double.parseDouble(in.nextLine().replaceAll("/.", ","));
                        shop.addProduct(nome, prezzo);
                    } catch(Exception e) {
                        System.out.println("Errore: Valori inseriti non validi!");
                    }
                    break;
                }
            }
        }
    }
}