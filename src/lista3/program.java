package lista3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        // Nazwa pliku do kt�rego zapiszemy i z kt�rego odczytamy tekst
        String nazwaPliku = "dane.csv";
        // Zapis pliku
      //  zapiszPlik(nazwaPliku);
        // Odczyt pliku
        String odczytanyTekst = odczytajPlik(nazwaPliku);
        // Drukowanie tre�ci odczytanej z pliku
        System.out.println("Odczytany tekst:\n" + odczytanyTekst);

    }


 
    // Metoda odczytuje tekst z pliku tekstowego,
    public static String odczytajPlik(String nazwaPliku) {
        // Deklarowanie i tworzenie obiektu typu File
        File plikDane = new File(nazwaPliku);
        // Utworzenie obiektu typu String, kt�ry b�dzie
        // przechowywa� odczytany tekst
        String odczyt = "";
        try {
            // Utworzenie obiektu typu String
            Scanner skaner = new Scanner(plikDane);
            // Odczytywanie kolejnych linii pliku dop�ki s� kolejne linie
            while (skaner.hasNextLine()) {
                // Do �a�cucha znak�w dodawana jest zawarto�� kolejnej linii
                // oraz znak \n oznaczaj�cy nast�pn� lini�
                odczyt = odczyt + skaner.nextLine() + "\n";
            }
        // Je�li nie uda�o si� odczyta� pliku   
        } catch (FileNotFoundException e) {
            System.out.println("Brak Pliku do odczytania!");
        }
        return odczyt;
    }
}
