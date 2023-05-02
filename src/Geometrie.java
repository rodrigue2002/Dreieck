import java.util.*;
import java.lang.Math;
public class Geometrie{
    int x;
    int y;
    Geometrie a ,b ,c ;
    public static void main(String[] args) {
        Geometrie g = new Geometrie();
        g.point();
        g.distance();
    }
    public void point(){
        Scanner sc = new Scanner(System.in);
            a = new Geometrie();
            System.out.println("Construction du 1er point");
            System.out.print("Veuillez entrer x : ");
            a.x = sc.nextInt();
            System.out.print("Veuillez entrer y : ");
            a.y = sc.nextInt();

            b = new Geometrie();
            System.out.println("Construction du 2eme point");
            System.out.print("Veuillez entrer x : ");
            b.x = sc.nextInt();
            System.out.print("Veuillez entrer y : ");
            b.y = sc.nextInt();

            c = new Geometrie();
            System.out.println("Construction du 3eme point");
            System.out.print("Veuillez entrer x : ");
            c.x = sc.nextInt();
            System.out.print("Veuillez entrer y : ");
            c.y = sc.nextInt();
        
}

    public void distance(){
        double distaceAB =  Math.sqrt(Math.pow (a.x - b.x,2) + Math.pow(a.y - b.y,2));
        double distaceBC =  Math.sqrt(Math.pow (b.x - c.x,2) + Math.pow(b.y - c.y,2));
        double distaceCA =  Math.sqrt(Math.pow (c.x - a.x,2) + Math.pow(c.y - a.y,2));
  System.out.println("Le perimetre du triangle est : " + (distaceAB + distaceBC + distaceCA));

        if(distaceAB == distaceBC && distaceBC == distaceCA){
            System.out.println("Le triangle est equilateral");
        }
        else if(distaceAB == distaceBC || distaceBC == distaceCA || distaceCA == distaceAB){
            System.out.println("Le triangle est isocèle");
        }
        else{
            System.out.println("Le triangle est scalène");
        }
    }
}