public class PrecioTotal {

    //Atributos
    double totalComputadores;
    double totalComputadoresMesa;
    double totalComputadoresPortatiles;
    Computadores[]  listaComputadores;

    //Constructores
    public PrecioTotal(){
        this.totalComputadores = 0.0;
        this.totalComputadoresMesa = 0.0;
        this.totalComputadoresPortatiles = 0.0;
        this.listaComputadores = new Computadores[]{};
    }

    public PrecioTotal(Computadores[] pComputadores){
        this.listaComputadores = pComputadores;
    }

    public void mostrarTotales() {
        //Inicializo los valores de los precios
        totalComputadores = 0;
        totalComputadoresMesa = 0;
        totalComputadoresPortatiles = 0;

        for (Computadores computador : listaComputadores) {
            totalComputadores += computador.calcularPrecio();

            if (computador instanceof ComputadoresMesa){
                totalComputadoresMesa += computador.calcularPrecio();
            }

            if (computador instanceof  ComputadoresPortatiles){
                totalComputadoresPortatiles += computador.calcularPrecio();
            }
        }



        System.out.println("La suma del precio de los computadores es de " + totalComputadores);
        System.out.println("La suma del precio de los computadores de mesa es de " + totalComputadoresMesa);
        System.out.println("La suma del precio de los computadores portatiles es de " + totalComputadoresPortatiles);
    }
}
