package lab1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int salir = 0;
        Scanner sc = new Scanner(System.in);
        while (salir==0){
            System.out.println("Aplicaciones lab1 apps moviles");
            System.out.println("1. Aplicación matemática");
            System.out.println("2. CRUD personas json");
            try{
                String op = sc.next();
                int op1 = Integer.valueOf(op);
                if(op1>= 1 && op1<= 2){
                    switch (op1){
                        case 1:
                            break;
                        case 2:
                            break;
                    }
                }
            } catch (NumberFormatException e){
                System.out.println("Ingrese un numero y este debe de estar en el rango de las opciones");
            }
        }
    }
}
