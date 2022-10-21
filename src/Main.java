public class Main {
    public static void main(String[] args) {
        Kaffeesorte rot = new Kaffeesorte("rot");
        Kaffeesorte blau = new Kaffeesorte("blau");
        Kaffeesorte pink = new Kaffeesorte("pink");
        Kaffeesorte gelb = new Kaffeesorte("gelb");
        Kaffeemaschiene vollautomat = new Kaffeemaschiene(rot, blau, pink, gelb);
        vollautomat.wasseraufuellen(5);
        vollautomat.bohnenaufuellen(5, rot);
        vollautomat.bohnenaufuellen(5, blau);
        vollautomat.bohnenaufuellen(4, pink);
        vollautomat.bohnenaufuellen(7, gelb);
        System.out.println(vollautomat.status());


        while(true){
            vollautomat.wechsleInAuswahlstatus();
        }
    }
//einheiten speichern können?
}