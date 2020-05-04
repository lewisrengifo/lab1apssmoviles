package Opcion1;


import java.util.Scanner;

public class Matematica {


    Scanner sc = new Scanner(System.in);

    public void ApssMates() {
        System.out.println("1. Calcular numero primo");
        System.out.println("2. Calcular MCD");
        System.out.println("3. Calcular serie fibonacci");
        System.out.println("4. Obtener factorial");
    }

    public void numeroprimo() {
        int contador, I;
        System.out.print("Ingrese el numero: ");
        try {
            String numstr = sc.next();
            int numint = Integer.valueOf(numstr);
            contador = 0;
            for (I = 1; I <= numint; I++) {
                if ((numint % I) == 0) {
                    contador++;
                }
            }
            if(contador <= 2)
            {
                System.out.println("El numero es primo");
            }else{
                System.out.println("El numero no es primo");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ingresa un numero");
        }

    }



}
