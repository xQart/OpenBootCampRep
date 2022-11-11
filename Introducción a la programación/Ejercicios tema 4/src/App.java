public class App {
    public static void main(String[] args) throws Exception {
/*      Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
            Pista: Los números inferiores a 0 son negativos y los superiores, positivos. */
            
        int num=-2;
        if (num>0){
            System.out.println("Numero Positivo");
        }
        else{
            System.out.println("Numero Negativo");
        }


/*      Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
            Incrementar el valor de la variable en uno cada vez que se ejecute.
            Mostrarlo por pantalla cada vez que se ejecute. */
        System.out.println("\n");
        int numeroWhile=0;
        while(numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

       /*  Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez. */
       System.out.println("\n");
       do{
            numeroWhile++;
            System.out.println(numeroWhile);
        }while(numeroWhile<1);


 /*        Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se  */
        System.out.println("\n");
        int numeroFor=0;
        for(int i=0;i<=3;i++){
            numeroFor++;
            System.out.println(numeroFor);
        }



/*     Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. 
    Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. 
    También habrá que poner un default para cuando el valor de la variable no sea una estación. */

        var estacion = "primavera";
        switch(estacion){
            case "primavera":
                System.out.println("primavera");
                break;
            case "verano":
                System.out.println("verano");
                break;
            case "otoño":
                System.out.println("verano");
                break;
            case "invierno":
                System.out.println("invierno");
                break;
            default:
                System.out.println("No es una estacion");            
        }


    }




}
