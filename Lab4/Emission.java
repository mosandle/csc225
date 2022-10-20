public class Emission {

    private final double co2;
    private final double n2o;
    private final double ch4;

    public Emission(double co2, double n2o, double ch4) {
        this.co2 = co2;
        this.n2o = n2o;
        this.ch4 = ch4;
    }

    public double getCO2() {
        return co2;
    }

    public double getN2O() {
        return n2o;
    }

    public double getCH4() {
        return ch4;
    }

    public double getTotal() {
        return co2 + n2o + ch4;
    }

}
