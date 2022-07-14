public class BecaUniversitaria {
    //Atributos de la clase
    int tiempo;
    double monto;
    double interes;

    //constructores

    public BecaUniversitaria(){
        this.tiempo = 0;
        this.monto = 0;
        this.interes = 0;
    }

    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres){
        this.tiempo = pTiempo;
        this.monto = pMonto;
        this.interes = pInteres;
    }

    //Metodos

    public double calcularInteresSimple() {
        double interesSimple = monto*(interes/100)*tiempo;
        return Math.round(interesSimple);
    }

    public double calcularInteresCompuesto() {
        double interesCompuesto = monto*(Math.pow((1+interes/100), tiempo)-1);
        return Math.round(interesCompuesto);
    }

    public String compararInversion(){
        double diferencia = calcularInteresCompuesto()-calcularInteresSimple();
        String s = diferencia == 0 ?
                "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada." :
                "La diferencia entre la proyección de interés compuesto e interés simple es: $"+diferencia;
        return s;
    }
    public String compararInversion(int pTiempo, double pMonto, double pInteres){
        tiempo = pTiempo;
        monto = pMonto;
        interes = pInteres;
        return compararInversion();
    }
}