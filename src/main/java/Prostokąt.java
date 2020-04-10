import sun.java2d.SurfaceDataProxy;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Prostokąt extends Figura {
    private int boka;
    private int bokb;
    private int wysokosc=-1;
    private final String nazwa="Prostokąt";

    public Prostokąt(int boka, int bokb) {
        this.boka = boka;
        this.bokb = bokb;
    }


    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    @Override
    public void obliczPole() {
        System.out.println("Pole wynosi: "+boka*bokb+ " cm kwadratowych");
    }

    @Override
    public void obliczObjetosc() {
        if (wysokosc == -1) {
            Scanner in = new Scanner(System.in);
            System.out.println("Podaj wysokość ");
            wysokosc = in.nextInt();
            System.out.println("Objetosc wynosi: " + (boka * bokb * wysokosc) + " cm sześciennych");
        }
        else{
            System.out.println("Objetosc wynosi: " + (boka * bokb * wysokosc) + " cm sześciennych");
        }
    }

    public Prostokąt(int boka, int bokb, int wysokosc) {
        this.boka = boka;
        this.bokb = bokb;
        this.wysokosc = wysokosc;
    }

    @Override
    public void wyswietlInfo() {
    if(wysokosc==-1){
        System.out.println("Prostokąt o wymiarach: "+boka +" "+bokb);
    }else {
        System.out.println("Prostopadłościan o wymiarach: " +boka+" "+bokb+ " "+wysokosc);
    }
    }
}
