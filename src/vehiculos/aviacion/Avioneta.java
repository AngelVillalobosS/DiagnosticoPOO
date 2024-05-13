package vehiculos.aviacion;

public class Avioneta extends Avion implements iAvionetas{
    private boolean helice;
    private boolean gasolina;
    private boolean volar;
    private int recorrido;

    public Avioneta(boolean gasolina, boolean volar, int recorrido, boolean helice){
        super(gasolina, volar, recorrido);
        this.gasolina = gasolina;
        this.volar = volar;
        this.recorrido = recorrido;
        this.helice = helice;
    }
    public void setHelice(boolean helice) {
        this.helice = helice;
    }

    public boolean getHelice() {
        if (helice == true){
            System.out.println("El vehiculo cuenta con una helice, entonces es una avioneta\n");
            return  true;
        }else{
            System.out.println("El vehiculo no cuenta con una helice, entonces no es una avioneta\n");
            return false;
        }
    }
}
