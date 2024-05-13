package vehiculos.aviacion;

public class Aeroplano extends Avion {
    int recorrido;
    public Aeroplano(boolean gasolina, boolean vuelo) {
        super(gasolina, vuelo);
    }

    public Aeroplano(boolean gasolina, boolean vuelo, int recorrido) {
        super(gasolina, vuelo, recorrido);
        this.recorrido = recorrido;
    }
    @Override
    public String  getRecorrido(){
        if (recorrido > 0){
            System.out.println("El recorrido de tu vuelo en aeroplano sera de: " + recorrido + " Kilometros\n");
        } else if (recorrido < 1){
            System.out.println("El recorrido de tu vuelo sera de: " + recorrido + " Kilometros\n");
            System.out.println("Al parecer hoy no volaras");
        }
        return " ";
    }
}