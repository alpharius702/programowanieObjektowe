//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
//1
    System.out.println("Ania");
    System.out.println("Bartek");
    System.out.println("Kasia");
    //2
    String imie = "Bartosz";
    int rok = 2009;
    double liczba = 0.66;
    int rokobecny = 2026;
    int wiek = rokobecny - rok;
    //3
    System.out.println("Mam na imie " + imie + "mam " + wiek + " lat i bede pisać mature za " + liczba);
    //4
    Scanner myObj = new Scanner(System.in);
    System.out.println("Podaj mi liczbe Celcjuszy: ");

    int cel = myObj.nextInt();
    double fahr = 1.8*cel+10;
    System.out.println("liczba w fahrenhajt: " + fahr);

}
