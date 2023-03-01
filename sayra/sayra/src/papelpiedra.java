import java.util.Scanner;
public class papelpiedra {
    public static void main(String [] args) {
//Se declaran las variables
   int sel;
   int riv ;

    //Se instancia la clase
    Scanner Leer=new Scanner(System.in);


    
        riv=(int)(Math.random() * 3) + 1;
        System.out.println("el rival ya va a lanzar");
 
//Se solicitan los datos
        System.out.print("Escoja 1 para elegir piedra, 2 para elegir papel o 3 para elegir tijera: ");
        sel = Leer.nextInt();

 //Operaciones
        System.out.print("El rival ya hizo su tiro: ");
 

        switch(riv)
        {
            case 1:
                System.out.println("Piedra");
                switch (sel)
                {
                   case 1: System.out.println("Empatados");
                    break;
                   case 2: System.out.println("Has ganado");
                    break;
                   case 3: System.out.println("Rival Gana"); 
                   break;
                    
                }break;
 
            case 2:
                System.out.println("Papel");
                switch (sel)
                {
                   case 1: System.out.println("Rival gana"); 
                   break;
                   case 2: System.out.println("Empatados");  
                   break;
                   case 3: System.out.println("Has ganado");
                   break;
                
                }break;
 
            case 3:
                System.out.println("Tijera");
                switch (sel)
                {
                   case 1: System.out.println("Has ganado");
                   
                   break;
                   case 2: System.out.println("Rival gana");
                   
                   break;
                   case 3: System.out.println("Empatados");
                   
                   break;
                }
                break;
        }

        //Se limpia el buffer
        Leer.close();
    } 
}
