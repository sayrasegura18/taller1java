import java.util.Scanner;

import java.util.Random;
public class carasello{

    public static void main(String[] args) {
       
 
int mda, altorio;


Scanner lectura=new Scanner(System.in);
Random mRandom=new Random();


System.out.println("Elige 1 si deseas tirar cara o elige 2 si deseas tirar sello");
mda=lectura.nextInt();

altorio=mRandom.nextInt(2)+1;
System.out.println(altorio);


if (altorio==1 && mda==1){
    System.out.println("Cara, has ganado");

}else if(altorio==2 && mda==1){
    System.out.println("Sello, has ganado");
} else if(altorio==1 && mda==2){
    System.out.println("Cara, has perdido");
}else if(altorio==2 && mda==1){
    System.out.println("Sello, has perdido");
}else{
    System.out.println("El número que has ingresado no corresponde a las opciones");

}

lectura.close();



    }

}