import java.util.Scanner;
import java.util.Random;

public class carisellazo{

    public static void main(String[] args) {

        int play, riv, vec, apu;

        Scanner lectura = new Scanner(System.in);
        Random random= new Random();

        System.out.println("BIENVENIDO AL CARISELLAZO VIRTUAL");
        System.out.println("Por favor, digita la cantidad que quieres apostar:");
        apu=lectura.nextInt();

        System.out.println("¿Qué eliges, CARA (0) o SELLO (1)");

        for(vec=0; vec<20;vec++);
{
    play=lectura.nextInt();

    riv=random.nextInt(2);
    if(play==riv){
        System.out.println("Felicidades, has ganado.");

        apu=apu+50;
        System.out.println("su saldo es "+apu);
    } else{
        System.out.println("Lo sentimos, has perdido.");

        apu=apu-50;
        System.out.println("su saldo es "+apu);
    }
    }
    System.out.println("Jugaste " + vec+ " veces y tus ganancias o perdidas totales son $" + apu);
    
    lectura.close();
}
}