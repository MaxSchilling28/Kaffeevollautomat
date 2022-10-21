public class Kaffeebohnenbehaelter {
    double fuellmengeBohnen;
    Kaffeesorte kaffeesorte;

    public Kaffeebohnenbehaelter(Kaffeesorte kaffeesorte) {
        this.kaffeesorte = kaffeesorte;
    }
    public double getFuellmenge() {

        return fuellmengeBohnen;
    }

    public void setFuellmenge(double fuellmenge) {

        this.fuellmengeBohnen = fuellmenge;
    }

    public void bohnenaufuellen(double bohnenaufuellen) {

        fuellmengeBohnen = bohnenaufuellen + fuellmengeBohnen;
    }
    public void bohnenBereitstellen(double volumen) {fuellmengeBohnen = fuellmengeBohnen - volumen; }



//kaffeemachen musss noch definiert werden damit klar wird das 3 einheiten an bohnen abgezogen werden
}
