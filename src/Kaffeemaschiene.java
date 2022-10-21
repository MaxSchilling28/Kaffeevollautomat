import java.util.Scanner;

public class Kaffeemaschiene {

    double volumenPortion = 3;
    Wasserbehaelter wasserbehaelter1;
    Kaffeebohnenbehaelter bohnenbehaelter1, bohnenbehaelter2, bohnenbehaelter3, bohnenbehaelter4;

    public Kaffeemaschiene(Kaffeesorte kaffeesorte1, Kaffeesorte kaffeesorte2, Kaffeesorte kaffeesorte3, Kaffeesorte kaffeesorte4) {
        wasserbehaelter1 = new Wasserbehaelter();
        bohnenbehaelter1 = new Kaffeebohnenbehaelter(kaffeesorte1);
        bohnenbehaelter2 = new Kaffeebohnenbehaelter(kaffeesorte2);
        bohnenbehaelter3 = new Kaffeebohnenbehaelter(kaffeesorte3);
        bohnenbehaelter4 = new Kaffeebohnenbehaelter(kaffeesorte4);
    }

    public String status() {
        return "Wasserstand " + wasserbehaelter1.getFuellmenge() + "\nBohneninhalt rot " + bohnenbehaelter1.getFuellmenge() + "\nBohneninhalt blau " + bohnenbehaelter2.getFuellmenge() + "\nBohneninhalt pink " + bohnenbehaelter3.getFuellmenge() + "\nBohneninhalt gelb " + bohnenbehaelter4.getFuellmenge();
    }

    public String status1() {
        return "Wasserstand " + wasserbehaelter1.getFuellmenge() + "\nBohneninhalt rot " + bohnenbehaelter1.getFuellmenge();
    }

    public String status2() {
        return "Wasserstand " + wasserbehaelter1.getFuellmenge() + "\nBohneninhalt blau " + bohnenbehaelter2.getFuellmenge();
    }

    public String status3() {
        return "Wasserstand " + wasserbehaelter1.getFuellmenge() + "\nBohneninhalt pink " + bohnenbehaelter3.getFuellmenge();
    }

    public String status4() {
        return "Wasserstand " + wasserbehaelter1.getFuellmenge() + "\nBohneninhalt gelb " + bohnenbehaelter4.getFuellmenge();
    }

    public void wasseraufuellen(double wassereinheiten) {

        wasserbehaelter1.wasseraufellen(wassereinheiten);
    }

    public void bohnenaufuellen(double bohneneinheiten, Kaffeesorte kaffeesorte) {
        if (kaffeesorte.equals(bohnenbehaelter1.kaffeesorte))
            bohnenbehaelter1.bohnenaufuellen(bohneneinheiten);
        else if (kaffeesorte.equals(bohnenbehaelter2.kaffeesorte))
            bohnenbehaelter2.bohnenaufuellen(bohneneinheiten);
        else if (kaffeesorte.equals(bohnenbehaelter3.kaffeesorte))
            bohnenbehaelter3.bohnenaufuellen(bohneneinheiten);
        else if (kaffeesorte.equals(bohnenbehaelter4.kaffeesorte))
            bohnenbehaelter4.bohnenaufuellen(bohneneinheiten);
    }

    public void wechsleInAuswahlstatus() {

        System.out.println("Was für ein Kaffee ist gewünscht?");

        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.next();
        if (!istGenugWasserDa()) {
            return;
        }



        if (eingabe.equals("r")) {
            if (bohnenbehaelter1.getFuellmenge() > volumenPortion) {
                kaffeemachen(volumenPortion, bohnenbehaelter1);
            } else System.out.println("Bohnen auffüllen");
            System.out.println(status1());                              //prüfen ob alles vorhanden ist, falls nicht dann sout bohnen und/oder wasser nachfüllen
        } else if (eingabe.equals("b")) {
            if (bohnenbehaelter2.getFuellmenge() > volumenPortion) {
                // kaffee kochen
            } else System.out.println("Bohnen auffüllen");
            System.out.println(status2());
        } else if (eingabe.equals("p")) {
            if (bohnenbehaelter3.getFuellmenge() > volumenPortion) {
                // kaffee kochen
            } else System.out.println("Bohnen auffüllen");
            System.out.println(status3());
        } else if (eingabe.equals("g")) {
            if (bohnenbehaelter4.getFuellmenge() > volumenPortion) {
                // Kaffee kochen
            } else System.out.println("Bohnen auffüllen");
            System.out.println(status4());
        }
        System.out.println(eingabe);

        //vorschlag wechle kaffeesortenverfügbar sind, wenn falsche tasten gedrückt wurden

    }

    public void kaffeemachen(double volumen, Kaffeebohnenbehaelter kaffeebohnenbehaelter) {
        wasserbehaelter1.wasserBereitstellen(volumen);
        kaffeebohnenbehaelter.bohnenBereitstellen(volumen);
        System.out.println("Kaffee wird gebrüht");
    }

    public boolean istGenugWasserDa() {
        if (wasserbehaelter1.getFuellmenge() > volumenPortion) {
            return true;
        } else {
            System.out.println("Wasser auffüllen");
            return false;
        }
    }
}




