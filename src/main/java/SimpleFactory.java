import java.util.Scanner;

public class SimpleFactory {
  private Figura figura;
    private Scanner in;

    public Figura getFigura() {
        return figura;
    }

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
            System.out.println("Chcesz podać wysokość?\n1.Tak\n2.Nie");
            zmienna=in.nextInt();
            if(zmienna==1){
                System.out.println("Podaj wysokość");
                int c=in.nextInt();
                figura=new Prostokąt(a,b,c);
            }else if(zmienna==2){
                figura=new Prostokąt(a,b);
            }
        }
        return figura;
    }
}
