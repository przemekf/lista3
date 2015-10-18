package lista3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        // Nazwa pliku do którego zapiszemy i z którego odczytamy tekst
        String nazwaPliku = "dane.csv";
        // Zapis pliku
      //  zapiszPlik(nazwaPliku);
        // Odczyt pliku
        String odczytanyTekst = odczytajPlik(nazwaPliku);
        // Drukowanie treœci odczytanej z pliku
        System.out.println("Odczytany tekst:\n" + odczytanyTekst);

    }


 
    // Metoda odczytuje tekst z pliku tekstowego,
    public static String odczytajPlik(String nazwaPliku) {
        // Deklarowanie i tworzenie obiektu typu File
        File plikDane = new File(nazwaPliku);
        // Utworzenie obiektu typu String, który bêdzie
        // przechowywa³ odczytany tekst
        String odczyt = "";
        try {
            // Utworzenie obiektu typu String
            Scanner skaner = new Scanner(plikDane);
            // Odczytywanie kolejnych linii pliku dopóki s¹ kolejne linie
            while (skaner.hasNextLine()) {
                // Do ³añcucha znaków dodawana jest zawartoœæ kolejnej linii
                // oraz znak \n oznaczaj¹cy nastêpn¹ liniê
                odczyt = odczyt + skaner.nextLine() + "\n";
            }
        // Jeœli nie uda³o siê odczytaæ pliku   
        } catch (FileNotFoundException e) {
            System.out.println("Brak Pliku do odczytania!");
        }
        return odczyt;
    }
}
