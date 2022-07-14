public class ComputadoresMesa extends Computadores{
     private int almacenamiento;

    //Constructores

    public ComputadoresMesa(){
        super();
        this.almacenamiento = 50;
    }
    public ComputadoresMesa(double precioBase, int peso){
        super(precioBase, peso);
        this.almacenamiento = 50;
    }
    public ComputadoresMesa(double precioBase, int peso, char consumoW, int almacenamiento){
        super(precioBase, peso, consumoW);
        this.almacenamiento = almacenamiento;
    }


    //Metodos

    public double calcularPrecio(){
        double adicion = super.calcularPrecio();
        if (almacenamiento > 100.0) {
            adicion += 50.0;
        }
        return adicion;
    }

    //Getters

    public int getCarga(){
        return almacenamiento;
    }
}
