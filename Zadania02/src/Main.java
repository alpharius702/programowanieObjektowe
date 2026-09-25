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
        System.out.print("Podaj Trzeciego bok Trójkąta: ");
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a){
            System.out.println("Można zrobić trójkąt ");
        } else {
            System.out.println("Nie można zrobić trójkąta");
        }

        //3
        System.out.print("Podaj pierwszą liczbe: ");
        int d = scanner.nextInt();
        System.out.print("Podaj drugą liczbe: ");
        int e = scanner.nextInt();

        if (d > e){
            System.out.println("Liczba Pierwsza jest większa od liczby drugiej");
        } else if (e > d) {
            System.out.println("Liczba druga jest większa od liczby pierwszej");
        } else {
            System.out.println("Liczby są równe");
        }

        //4
        System.out.print("zad4.Podaj jedną liczbę ");
        int f = scanner.nextInt();
        System.out.print("zad.4Podaj drugą liczbe: ");
        int g = scanner.nextInt();
        System.out.print("zad4.Podaj liczbę trzecią ");
        int h = scanner.nextInt();

        if (f > g && f > h){
            System.out.println("Liczba pierwsza jest większa od drugiej i trzeciej");
        } else if (g > f && g > h) {
            System.out.println("Liczba druga jest większa od pierwszej i trzeciej");
        } else if (h > f && h > g) {
            System.out.println("Trzecia liczba jest większa od pierweszej i drugiej");
        }else{
            System.out.println("Liczby są równe");
        }

        //5
        System.out.print("Podaj numer miesiąca od 1 do 12: ");
        int miesiac = scanner.nextInt();
        switch (miesiac){
            case 1:
                System.out.println("Styczeń");
                break;
            case 2:
                System.out.println("Luty");
                break;

            case 3:
                System.out.println("Marzec");
                break;
            case 4:
                System.out.println("Kwiecien");
                break;
            case 5:
                System.out.println("Maj");
                break;
            case 6:
                System.out.println("Czerwiec");
                break;
            case 7:
                System.out.println("Lipiec");
                break;
            case 8:
                System.out.println("Sierpien");
                break;
            case 9:
                System.out.println("Wrzesien");
                break;
            case 10:
                System.out.println("Pazdziwernik");
                break;
            case 11:
                System.out.println("Listopad");
                break;
            case 12:
                System.out.println("Gurdzien");
                break;
            default:
                System.out.println("Niepoprawny numer miesiąca");
        }
        //6
        System.out.print("Podaj swoje imie: ");
        String username = scanner.nextLine();

        String dev = "Bartosz";

        if (username.equals(dev)){
            System.out.println("Masz takie imie jak developer");
        } else {
            System.out.println("Masz inne imie niż dev");
        }


    }
