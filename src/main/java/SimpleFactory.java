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
            figura=new Prostokąt();
        }
        return figura;
    }
}
