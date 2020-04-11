import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleFactory {
  private Figura figura;
    private Scanner in;
    private int a=-1;
    private int h=-1;

    public Figura stworzFigure(String type) throws InterruptedException {
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
        else if(type.equals("Trojkat")) {
            a=-1;
            h=-1;
            while((a>=0 && h>=0) ==false){
            try{
                in = new Scanner(System.in);
                System.out.println("Podaj długość boku ");
           a = in.nextInt();
            System.out.println("Podaj wysokość");
            h = in.nextInt();
                if((a>=0 && h>=0) ==false){
                    System.out.println("Liczby nie mogą być ujemne!!!");
                }else if((a>=0 && h>=0) ==true){
                    figura = new Trojkat(a, h);
                }
            }catch(InputMismatchException e)
            {
                System.out.println("Nie mozesz podać litery!!\nZacznij od nowa");
                Thread.sleep(2000);
              stworzFigure("Trojkat");

            }


            }





        }else if(type.equals("Kolo")){
            in=new Scanner(System.in);
            System.out.println("Podaj długość promienia");
            int a=in.nextInt();
            figura=new Kolo(a);
        }
        return figura;
    }
}
