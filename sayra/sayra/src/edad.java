import java.util.Scanner;

public class edad {
     public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int age;
        age= lectura.nextInt();
        if (age >= 18){
            System.out.println("BIenvenido siga que si hay");

        }else{
            System.out.println("Si no eres mayor de edad, no puedes ingresar");
        }

        lectura.close();

     }
}

