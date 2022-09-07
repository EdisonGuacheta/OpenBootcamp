public class Herencia {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente();

        cliente.setedad(24);
        cliente.setnombre("Augusto mejia");
        cliente.settelefono("321987654");
        cliente.setcredito(false);

        System.out.println("Cliente -> " + " || Edad: " + cliente.getedad() + " || Nombre: " + cliente.getnombre()
         + " || Telefono: " + cliente.gettelefono() + " || Credito: " + cliente.iscredito());

        Trabajador trabajador = new Trabajador();

        trabajador.setedad(35);
        trabajador.setnombre("Tania Oregán");
        trabajador.settelefono("321987654");
        trabajador.setsalario((float)3216.56);

        System.out.println("Trabajador -> " + " || Edad: " + trabajador.getedad() + " || Nombre: " + trabajador.getnombre()
         + " || Telefono: " + trabajador.gettelefono() + " || Salario: " + trabajador.getsalario());
    }
}

class Persona{
    int edad;
    String nombre;
    String telefono;

    public void setedad( int edad){
        this.edad = edad;
    }

    public int getedad(){
        return this.edad;
    }

    public void setnombre( String nombre){
        this.nombre = nombre;
    }

    public String getnombre(){
        return this.nombre;
    }

    public void settelefono( String telefono){
        this.telefono = telefono;
    }

    public String gettelefono(){
        return this.telefono;
    }
}

class Cliente extends Persona{
    boolean credito;

    public void setcredito( boolean credito){
        this.credito = credito;
    }

    public boolean iscredito(){
        return this.credito;
    }
}

class Trabajador extends Persona{
    float salario;

    public void setsalario( float salario){
        this.salario = salario;
    }

    public float getsalario(){
        return this.salario;
    }
}