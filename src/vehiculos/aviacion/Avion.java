package vehiculos.aviacion;
//Avion es la clase base
public class Avion {
    private boolean gasolina;
    private boolean vuelo;
    private int recorrido;

    public Avion(boolean gasolina, boolean vuelo) {
        this.gasolina = gasolina;
        this.vuelo = vuelo;
    }
    public Avion(boolean gasolina, boolean vuelo, int recorrido) {
        this.gasolina = gasolina;
        this.vuelo = vuelo;
        this.recorrido = recorrido;
    }


    public void setGasolina(){
    }
    public boolean getGasolina(){

        if (this.gasolina == true){
            System.out.println("El vehiculo cuenta con gasolina\n");
            return this.gasolina;
        }else {
            System.out.println("El vehiculo no cuenta con gasolina\n");
            return false;
        }
    }
    public void setVuelo(boolean vuelo){
        this.vuelo = vuelo;
    }
    public boolean getVuelo(){
        if (gasolina == true){
            System.out.println("El vehiculo esta emprendiendo su vuelo\n");
            return this.vuelo;
        }else {
            System.out.println("El vehiculo no puede volar si no tiene gasolina\n");
            return false;
        }
    }
    public void setRecorrido(int recorrido){
        this.recorrido = recorrido;
    }
    public String getRecorrido(){
        if (recorrido > 0){
            System.out.println("El recorrido de tu vuelo sera de: " + recorrido + " Kilometros\n");
        } else if (recorrido < 1){
            System.out.println("El recorrido de tu vuelo sera de: " + recorrido + " Kilometros\n");
            System.out.println("Al parecer hoy no volaras");
        }
        return " ";
    }
}
