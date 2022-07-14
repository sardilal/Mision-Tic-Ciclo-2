public class Computadores {

    //Atributos
    protected int peso;
    protected char consumoW;
    protected double precioBase;

    //Getters

    //Setters

    //Constructores

    //Constructor por defecto
    public Computadores(){
        this.consumoW = 'F';
        this.precioBase = 100.0;
        this.peso = 5;
    }
    //Constructores con parametros

    public Computadores(double precioBase, int peso){
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = 'F';
    }
    public Computadores(double precioBase, int peso, char consumoW){
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = consumoW;
    }


    //Getters


    public int getPeso(){
        return peso;
    }

    public char getConsumoW(){
        return consumoW;
    }

    public double getPrecioBase(){
        return precioBase;
    }

    //Metodos

    public double calcularPrecio(){

        double adicionConsumo;

        switch (consumoW){

            case 'A':
                adicionConsumo = 100.0;
                break;
            case 'B':
                adicionConsumo = 80.0;
                break;
            case 'C':
                adicionConsumo = 60.0;
                break;
            case 'D':
                adicionConsumo = 50.0;
                break;
            case 'E':
                adicionConsumo = 30.0;
                break;
            case 'F':
                adicionConsumo = 10.0;
                break;
            default:
                adicionConsumo = 0.0;
        }

        double adicionPeso;

        if (peso < 19) {
            adicionPeso = 10.0;
        } else if (peso < 49){
            adicionPeso = 50.0;
        } else if (peso <= 79) {
            adicionPeso = 80.0;
        } else {
            adicionPeso = 100.0;
        }


        double precioTotal = precioBase + adicionPeso + adicionConsumo;
        return precioTotal;
        }

}