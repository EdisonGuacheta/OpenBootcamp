
public class App {
    public static void main(String[] args) throws Exception {
        double x = 2;
        double y = 3;
        double z = y + x;

        var suma  = Suma(x,y,z);

        coche miCoche = new coche();

        miCoche.maspuerta();

        System.out.println("la suma de " + x + " + " + y + " + " + z + " da: " + suma );
        System.out.println(miCoche.puertas);
    }

    public static double Suma( Double x, Double y, Double z){

        return x + y + z ;
    }
}

class coche{
    public int puertas = 5;

    public void maspuerta(){
        puertas = puertas + 1;
    }

    public void menospuerta(){
        puertas = puertas - 1;
    }

}