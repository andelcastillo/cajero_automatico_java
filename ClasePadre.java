import java.util.Scanner;
import java.util.Scanner.*;


public abstract class ClasePadre{

    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void Operaciones(){

        int bandera = 0;
        int seleccion = 0;

        do{

        do{
           System.out.println("Por favor, seleccione una opción:");
           System.out.println("\n   1. Consulta de saldo.");
           System.out.println("\n   2. Retiro de efectivo.");
           System.out.println("\n   3. Depósito de efectivo.");
           System.out.println("\n   4. Salir.");
           
           seleccion = entrada.nextInt();

           if(seleccion >= 1 && seleccion <= 4){

            bandera = 1;

           }else{
            System.out.println("----------------------------------------------------");
            System.out.println("Opción no disponible, vuelva a intentarlo por favor.");
            System.out.println("----------------------------------------------------");
           }

        }while(bandera == 0);

        if(seleccion == 1){

            ClasePadre mensajero = new ClaseHija_consulta();
            mensajero.Transacciones();

        }else if(seleccion == 2){

            ClasePadre mensajero = new ClaseHija_retiro();
            mensajero.Transacciones();

        }else if(seleccion == 3){

            ClasePadre mensajero = new ClaseHija_deposito();
            mensajero.Transacciones();
            
        }else if(seleccion == 4){
            System.out.println("--------------------------------");
            System.out.println("Gracias por confiar en nosotros.");
            System.out.println("--------------------------------");
            bandera = 2;
            
        }
    }while(bandera != 2);


}

//Método para solicitar cantidad de retiro
public void Retiro(){

    retiro = entrada.nextInt();
 
}

//Método para solicitar depósito
public void Deposito(){

    deposito = entrada.nextInt();
}

//Método abstracto
public abstract void Transacciones();

//Método setter y getter
public int getSaldo(){
    return saldo;
}

public void setSaldo(int saldo){

    this.saldo = saldo;

}

}