import java.util.Scanner;

public class presupuesto {
    public static void main (String [] args){
        Scanner lectura=new Scanner (System .in);
        int budget, spein,seguir;
        seguir=1;
        budget=100000;

        while(seguir==1){
            //instrucciones que deas repetir 
            System.out.println("Ingrese el valor del gasto");
            spein=lectura.nextInt();
            System.out.println("desea registrar otro gasto? digita 1 si o 2 no");
            seguir=lectura.nextInt();
            
            
            
            for(int x=1; x>=100000; x++ ){
                System.out.println("los gastos hasta el momento han sido"); 


            }


        }
    }

    
}
