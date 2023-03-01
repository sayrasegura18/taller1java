import java.util.Scanner;

public class operaciones {
    public static void main(String[] args) throws Exception {
        System.out.println("Ingrese un numero");
        double  numOne,numTwo, total;
        int op;
        Scanner lectura= new Scanner (System.in);
        numOne= lectura.nextInt();
        System.out.println("Ingrese un numero");
        numTwo=lectura.nextInt();
        System.out.println("1.Suma 2.Resta 3.Multiplicacion 4.Division 5.Potenciacion 6.Radicacion");
        op=lectura.nextInt();
        switch(op){
            case 1:
            total=numOne+numTwo;
            System.out.println("La Suma entre "+numOne+"y"+numTwo+"es"+ total);
            break;
          
            case 2:
            total=numOne-numTwo;
            System.out.println("La Resta entre "+numOne+"y" +numTwo+"es"+ total);
            break;
           
            case 3:
            total=numOne*numTwo;
            System.out.println("La Multiplicacion entre"+numOne+"y" +numTwo+"es"+ total);
            break;
           

            case 4:
            total=numOne/numTwo;
            System.out.println("La Division entre "+numOne+"y" +numTwo+"es"+ total);
            break;


            case 5:
            total= Math.pow (numOne,numTwo);
            System.out.println("La  Potenciacion del numero 1 es "+ numOne+"y la potenciacion de numero 2 es" +numTwo);
            break;

            case 6:
            double raizNumberOne, raizNumbertwo;
            raizNumberOne= Math.sqrt(numOne);
            raizNumbertwo = Math.sqrt(numTwo);
            System.out.println("La Radicacion del número 1 es " +raizNumberOne+ " y la Radicacion del número 2 es"+ raizNumbertwo);
            lectura.close();
            break;

//            default:



           



        

            




        }



    }
}
