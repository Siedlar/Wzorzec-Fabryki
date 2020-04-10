import java.util.Scanner;

public class Main {
public static void main(String[] args){
    Scanner in=new Scanner(System.in);
SimpleFactory fabrykaFigur=new SimpleFactory();
Figura figura=null;
int a;
    System.out.println("Wybierz figurę\n1.Kwadrat\n2.Prostokąt");
    a=in.nextInt();
switch(a){
    case 1:figura=fabrykaFigur.stworzFigure("Kwadrat");
    break;
    case 2:figura=fabrykaFigur.stworzFigure("Prostokat");
    break;
    default:
        break;
}
    System.out.println("1.Oblicz Pole\n2.Oblicz objętość");
a=in.nextInt();
if(a==1){
    figura.obliczPole();
}else if(a==2){
    figura.obliczObjetosc();
}
}
}
