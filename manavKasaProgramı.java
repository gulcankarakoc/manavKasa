import java.util.Scanner;
public class manavKasaProgramı {
public static void main(String[] args){
    double armut=2.14,patlican=5,domates=1.11,muz=0.95,elma=3.67,toplam,akilo,ekilo,dkilo,mkilo,pkilo;

    Scanner inp=new Scanner(System.in);

    System.out.println("Armut Kaç Kg?:");
    akilo= inp.nextDouble();

    System.out.println("Elma Kaç Kg?:");
     ekilo= inp.nextDouble();

     System.out.println("Domates Kaç Kg?:");
    dkilo= inp.nextDouble();

    System.out.println("Muz Kaç Kg?:");
     mkilo= inp.nextDouble();

     System.out.println("Patlıcan Kaç kg?:");
    pkilo= inp.nextDouble();

    toplam=(armut*akilo)+(elma*ekilo)+(domates*dkilo)+(muz*mkilo)+(patlican*pkilo);

    System.out.println("Toplam Fiyat:"+toplam);
}

}
