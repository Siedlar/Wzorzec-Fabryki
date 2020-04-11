import java.util.Scanner;

public class Trojkat extends Figura {
    private int wysokosc;
    private int bok;
    private int bokb=-1;
    private int bokc=-1;
    private static final String  nazwa="Trojkat";
private boolean zmienna=false;
    public Trojkat(int bok, int wysokosc) {
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
        if(zmienna==false){
        do{
                System.out.println("Aby obliczyc obwód podaj nastepne 2 boki\nPodaj drugi bok");
                Scanner in = new Scanner(System.in);
                bokb = in.nextInt();
                System.out.println("Podaj 3 bok");
                bokc = in.nextInt();
           zmienna=Trojkat.sprawdzCzyPowstanieTrojkat(bok,bokb,bokc);
        }while(zmienna==false);}
    int obwod=bok+bokb+bokc;
        System.out.println("Obwod wynosi "+ obwod+" cm");
    }

    @Override
    public void wyswietlInfo() {
        if(bokb==-1 && bokc==-1){
            System.out.println("Figura to trójkąt o boku: "+bok+ "cm i wysokości "+wysokosc+"cm");
        }else{
        System.out.println("Figura to trójkąt o bokach: "+bok+"cm "+bokb+"cm "+bokc+ "cm i wysokości "+wysokosc+"cm");}
    }
    public static boolean sprawdzCzyPowstanieTrojkat(int boka,int bokb,int bokc){
    if(boka+bokb>bokc&boka+bokc>bokb&bokb+bokc>boka){
        return true;
    }else{
        System.out.println("Z tych bokow nie powstanie trojkat!!!\nProsze podać ponownie");
        return false;}
    }
}
