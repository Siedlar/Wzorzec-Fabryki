public class Kwadrat extends Figura {
   private int bok;
   private final String nazwa="Kwadrat";

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
    public void obliczObjetosc() {
        System.out.println("Objetosc wynosi: "+bok*bok*bok+ " cm sześciennych");
    }

    @Override
    public String toString() {
        return nazwa +" "+ bok;
    }
}
