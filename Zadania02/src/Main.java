    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(system.in);
    System.out.print("Podaj liczbę: ");
    int liczba = scanner.nextInt();
    if (liczba % 3 === 0) System.out.println("liczba jest podzilna przez 3");
    else {
        System.out.println("Liczba nie jest podzielna przez 3");
    }
}