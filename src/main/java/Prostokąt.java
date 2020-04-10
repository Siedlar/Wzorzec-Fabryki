import sun.java2d.SurfaceDataProxy;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Prostokąt extends Figura {
    private int boka;
    private int bokb;
    private static final String nazwa = "Prostokąt";

    public Prostokąt(int boka, int bokb) {
        this.boka = boka;
        this.bokb = bokb;
    }


    @Override
    public void obliczPole() {
        System.out.println("Pole wynosi: " + boka * bokb + " cm kwadratowych");
    }

    @Override
    public void obliczObwod() {
        System.out.println("Obwod wynosi: " + (2*boka + 2*bokb) + " cm ");
    }
        @Override
        public void wyswietlInfo(){

            System.out.println("Prostokąt o wymiarach: " + boka + " " + bokb);


        }
    }

