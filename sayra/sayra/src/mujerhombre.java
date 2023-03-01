import java.util.Scanner;
public class mujerhombre {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        String leer;
        int contarHombre, contarMujer;
        
        contarHombre=0;
        contarMujer=0;

        for (int x=1;x<=10; x++){
            System.out.println("ingrese si usted es mujer o hombre");
            leer= lectura.nextLine();

            if (leer.equalsIgnoreCase("Hombre")){
                contarHombre=contarHombre+1;

                 }else{
                    contarMujer=contarMujer+1;
            } 
        }
        System.out.println("El total de hombres es " + contarHombre + " Y la cantidad de mujeres es " + contarMujer);
        
        
        lectura.close();
    }
}