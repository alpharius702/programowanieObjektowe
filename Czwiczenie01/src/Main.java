
void main() {

    System.out.println("hello World");
    System.out.println("Skrót"); //sout

    System.out.print("Bez entera");
    System.out.println("Nowa Linia");

    System.out.println("W takin sposób robić znaki specjalne");
    System.out.println("\t tabulacja");
    System.out.println("\n enter");
    System.out.println("To jest jak na maszynie \rdo pisania");
    System.out.println("\"cudzysłów\"");
    System.out.println("\'Apostrofa\'");
    System.out.println("backslash: \\");

    int liczbaCalkowita = 5;
    double liczbaRzeczywista;

    liczbaRzeczywista = (double) liczbaCalkowita /2;
    System.out.println("Wynik dzielenia liczby 5 przez 2 to " + liczbaRzeczywista);

    char znak = 'a';
    System.out.println("Litera a ma wartość " + (znak + 0));

    String napis = "napis";
    System.out.println("Napis Wielkimi literami " + napis.toUpperCase());

    System.out.println("Wynik 1 + 2 + 3 = " + (1 + 2 + 3));
    System.out.println(1 + 2 + 3 + "To wynik 1+2+3");


}
