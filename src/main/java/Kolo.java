import java.io.FileWriter;

public class Kolo extends Figura {
    private double promien;
    private static final String nazwa = "Kolo";

    public Kolo(double promien) {
        this.promien = promien;
    }

    @Override
    public void obliczPole() {
        double pole=1;
        pole=Math.PI*promien*promien;
        System.out.println("Pole wynosi: "+pole+" cm kwadratowych");
    }

    @Override
    public void obliczObwod() {
        double obwod=0;
        obwod=2*Math.PI*promien;
        System.out.println("Pole wynosi: "+obwod+" cm kwadratowych");
    }

    @Override
    public void wyswietlInfo() {
        super.wyswietlInfo();
    }
}
