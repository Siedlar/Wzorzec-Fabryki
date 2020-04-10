import java.util.Scanner;

public class SimpleFactory {
  private Figura figura;
    private Scanner in;


    public Figura stworzFigure(String type){
        if(type.equals("Kwadrat")){
            in=new Scanner(System.in);
            System.out.println("Podaj dlugość boku");
            int a=in.nextInt();
            figura=new Kwadrat(a);

        }
        else if(type.equals("Prostokat")){
            int zmienna;
            in=new Scanner(System.in);
            System.out.println("Podaj dlugość boku a");
            int a=in.nextInt();
            System.out.println("Podaj dlugość boku b");
            int b=in.nextInt();
                figura=new Prostokąt(a,b);
            }
        else if(type.equals("Trojkat")){
            in=new Scanner(System.in);
            System.out.println("Podaj długość boku ");
            int a=in.nextInt();
            System.out.println("Podaj wysokość");
            int h=in.nextInt();
            figura=new Trojkat(a,h);
        }else if(type.equals("Kolo")){
            in=new Scanner(System.in);
            System.out.println("Podaj długość promienia");
            int a=in.nextInt();
            figura=new Kolo(a);
        }
        return figura;
    }
}
