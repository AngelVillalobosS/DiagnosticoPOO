import vehiculos.aviacion.*;

public class Principal {
    public static void main(String[] args) {
//        Avion avion1 = new Avion(true, true,10);
        Aeroplano aeroplanoObj = new Aeroplano(true, true,10);
        Avioneta avionetaObj = new Avioneta(true, true, 20, true);
//        avion1.getGasolina();
//        avion1.getVuelo();

        System.out.println("--Aeroplano--");

        aeroplanoObj.getGasolina();
        aeroplanoObj.getVuelo();
        aeroplanoObj.getRecorrido();

        System.out.println("--Avioneta--");

        avionetaObj.getHelice();
        avionetaObj.getGasolina();
        avionetaObj.getVuelo();
        avionetaObj.getRecorrido();



    }
}
