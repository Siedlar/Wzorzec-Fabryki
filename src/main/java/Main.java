import java.util.Scanner;

public class Main {
public static void main(String[] args) throws InterruptedException {
    Scanner in = new Scanner(System.in);
    SimpleFactory fabrykaFigur = new SimpleFactory();
    Figura figura = null;
    String type="";
    int a;
    int zmienna2=1;
    do{
    do{
    System.out.println("Wybierz figurę\n1.Kwadrat\n2.Prostokąt\n3.Wyjdz");
    a = in.nextInt();
    switch (a) {
        case 1:
            type="Kwadrat";
            figura = fabrykaFigur.stworzFigure(type);
            break;
        case 2:
            type="Prostokat";
            figura = fabrykaFigur.stworzFigure(type);
            break;
        case 3:
           System.exit(0);
        }

        if(figura==null) {
            System.out.println("Nie wybrales żadnej z powyższych akcji!! Spróbuj ponownie");
            Thread.sleep(2000);
        }}while(figura==null);
    int zmienna=1;
    do{
    System.out.println("Wybierz akcje\n1.Oblicz pole\n2.Oblicz objetosc\n3.Wyswietl info\n4.Zmien dane\n5.Wyjdz");
    a=in.nextInt();
    if(a==1){
        figura.obliczPole();
    }else if(a==2){
        figura.obliczObjetosc();
    }else if(a==3){
        figura.wyswietlInfo();
    }else if(a==4){
       figura=fabrykaFigur.stworzFigure(type);
    }else if(a==5){
        System.exit(0);
    }
    if(a==4){
        zmienna=1;
    }else{
        System.out.println("Chcesz ponownie wykonać obliczenie na tej figurze?\n1.Tak\n2.Nie");
    zmienna=in.nextInt();}
    }while(zmienna==1);
    System.out.println("Czy chcesz zacząć od początku?\n1.Tak\n2.Nie");
        zmienna2=in.nextInt();
}while(zmienna2==1);
    }
}
