public class Kwadrat extends Figura {
   private int bok;
   private static final String nazwa="Kwadrat";

    public int getBok() {
        return bok;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Kwadrat(int bok) {
        this.bok = bok;
    }

    public Kwadrat() {
    }

    @Override
    public void obliczPole() {
        System.out.println("Pole wynosi: "+bok*bok+ " cm kwadratowych");
    }

    @Override
    public void obliczObwod() {
        System.out.println("Obwod wynosi: "+(4*bok)+ " cm ");
    }

    @Override
    public String toString() {
        return nazwa +" "+ bok;
    }
}
