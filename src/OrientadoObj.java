public class OrientadoObj {
    public static void main(String[] args) throws Exception {

        Persona persona = new Persona();

        
        persona.setedad(35);
        persona.setnombre("Albaro Melasco");
        persona.settelefono("3154684965");

        System.out.println("La Edad es: " + persona.getedad());
        System.out.println("El nombre es: " + persona.getnombre());
        System.out.println("El numero de telefono es: " + persona.gettelefono());

    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setedad (int edad){
        this.edad = edad;
    }

    public int getedad() {
        return this.edad;
    }

    public void setnombre (String nombre){
        this.nombre = nombre;
    }

    public String getnombre() {
        return this.nombre;
    }

    public void settelefono (String telefono){
        this.telefono = telefono;
    }

    public String gettelefono() {
        return this.telefono;
    }

}