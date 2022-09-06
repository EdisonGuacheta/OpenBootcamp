public class ciclos {
    public static void main(String[] args) throws Exception {
        int x = 0;

        PosNegCero(x);

        While();

        DoWhile();

        For();

        FunSwich();
    
    }

    public static void PosNegCero(int x){

        if(x > 0 ){
            System.out.println("x es mayor a Cero (0)");
        }   
        else{ if( x < 0 )
                System.out.println("x es menor a Cero (0)");
        
            else {
                    System.out.println("x es igual a Cero (0)");
                }
        }

    }

    public static void While(){
        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println(numeroWhile + " While");
            numeroWhile++;
        }
    }

    public static void DoWhile(){
        int x = 0;
        do{
            System.out.println(x + " Do-While");
            x++;
        }while(x < 1);
    }

    public static void For(){
        for( int numeroFor = 0 ; numeroFor <= 3 ; numeroFor++ ){
            System.out.println( numeroFor + " For");
        }
    }
    
    public static void FunSwich(){

        String estacion = "otoño";

        switch(estacion){
            case "invierno":
                System.out.println("la estacion en la que está es: " + estacion);
                break;
            case "otoño":
                System.out.println("la estacion en la que está es: " + estacion);
                break;
            case "primavera":
                System.out.println("la estacion en la que está es: " + estacion);
                break;
            case "verano":
                System.out.println("la estacion en la que está es: " + estacion);
                break;
            default:
                System.out.println("el valor ingresado no es una estacion -> " + estacion);
        }
    }

}
