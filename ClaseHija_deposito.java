public class ClaseHija_deposito extends ClasePadre {

    public void Transacciones(){

        System.out.println("¿Cuánto desea depositar?");
        Deposito();

        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("Depositaste: " + deposito);
        System.out.println("Tu saldo actual es : " + getSaldo());

    }
    
}
