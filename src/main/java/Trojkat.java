public class Trojkat extends Figura {
    private int wysokosc;
    private int bok;
    private static final String  nazwa="Trojkat";

    public Trojkat(int wysokosc, int bok) {
        this.wysokosc = wysokosc;
        this.bok = bok;
    }

    @Override
    public void obliczPole() {
        double pole=(bok*wysokosc)/2;
        System.out.println("Pole wynosi " + pole+" cm.");
    }

    @Override
    public void obliczObwod() {
    }

    @Override
    public void wyswietlInfo() {
        super.wyswietlInfo();
    }
}
