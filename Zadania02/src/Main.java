    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutte
    import java.util.Scanner;

    void main() {
        //1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 3");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3");
        }

        //2
        System.out.print("Podaj Pierwszy bok Trójkąta: ");
        int a = scanner.nextInt();
        System.out.print("Podaj Drugiego bok Trójkąta: ");
        int b = scanner.nextInt();
        System.out.print("Podaj Trzeiego bok Trójkąta: ");
        int c = scanner.nextInt();


    }
