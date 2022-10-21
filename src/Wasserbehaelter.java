public class Wasserbehaelter {
    double fuellmenge;

    public double getFuellmenge() {
        return fuellmenge;
    }

    public void setFuellmenge(double fuellmenge) {
        this.fuellmenge = fuellmenge;
    }

    public void wasseraufellen(double wasseraufuellen) {
        fuellmenge = wasseraufuellen + fuellmenge;
    }

    public void wasserBereitstellen(double volumen) {fuellmenge = fuellmenge - volumen; }

//kaffeemachen musss noch definiert werden damit klar wird das 3 einheiten an wasser abgezogen werden
}
