public class ComputadoresPortatiles extends Computadores{

    private int pulgadas;
    private boolean camaraITG;

    //Constructores
    public ComputadoresPortatiles(){
        super();
        this.pulgadas = 20;
        this.camaraITG = false;
    }

    public ComputadoresPortatiles(double precioBase, int peso){
        super(precioBase, peso);
        this.pulgadas = 20;
        this.camaraITG = false;
    }

    public ComputadoresPortatiles(double precioBase, int peso, char consumoW, int pulgadas){
        super(precioBase, peso, consumoW);
        this.pulgadas = pulgadas;
        this.camaraITG = false;
    }

    public ComputadoresPortatiles(double precioBase, int peso, char consumoW, int pulgadas, boolean camaraITG){
        super(precioBase, peso, consumoW);
        this.pulgadas = pulgadas;
        this.camaraITG = camaraITG;
    }

    //Metodos

    public double calcularPrecio(){
        double adicion = super.calcularPrecio();
        if (pulgadas >40) {
            adicion += precioBase * 0.3;
        }
        if (camaraITG){
            adicion += 50.0;
        }
        return adicion;
    }

}
