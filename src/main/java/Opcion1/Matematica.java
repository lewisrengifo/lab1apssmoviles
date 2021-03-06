package Opcion1;


import java.util.Scanner;

public class Matematica extends Menuopciones {
    int n;
    @Override
    public void mostrarMenu() {
        System.out.println("1. Calcular numero primo");
        System.out.println("2. Calcular MCD");
        System.out.println("3. Calcular serie fibonacci");
        System.out.println("4. Obtener factorial");
    }

    @Override
    public void realizarAccion(int x) {
        switch (x) {
            case 1:
            numeroprimo();
            break;
            case 2:
                mcd();
                break;
            case 3:
                break;
            case 4:
                mostrarSerie();

                break;
        }
    }

    Scanner sc = new Scanner(System.in);

    public void ApssMates() {

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
            if (contador <= 2) {
                System.out.println("El numero es primo");
            } else {
                System.out.println("El numero no es primo");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ingresa un numero");
        }

    }
    public int fibonacci(int n)
    {
        if (n>1){
            return fibonacci(n-1) + fibonacci(n-2);
        }
        else if (n==1) {
            return 1;
        }
        else if (n==0){
            return 0;
        }
        else{
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }
    public void mostrarSerie(){
        System.out.println("serie fibonacci"+" de tamaño "+ n +":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i)+" ");
        }
        System.out.println();
    }

    public void mcd(){
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese primer numero: ");
        String num1String  =sc.next();
        num1=Integer.valueOf(num1String);
        System.out.println("Ingrese un segundo numero: ");
        String num2String=sc.next();
        num2=Integer.valueOf(num2String);
        try {
            while(num1 != num2)
                if(num1>num2)
                    num1= num1-num2;
                else
                    num2= num2 -num1;

            System.out.println("El MCD es :" + num1);

        } catch (NumberFormatException e){
            System.out.println("Ingresa dos numeros");

        }



    }



}
