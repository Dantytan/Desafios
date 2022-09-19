package Soluciones.semana1;

public class FizzBuzz {
    public static void main(String[] args) {
        int numeroDesde = 0;
        int numeroHasta = 100;
        int numero ;
        for (int i = numeroDesde; i <= numeroHasta; ++i) {
            numero = i;
            if (numero % 3 == 0 && numero % 5 == 0)
                System.out.println(" fizzbuzz ");
            else if (numero % 3 == 0)
                System.out.println(" fizz ");
            else if(numero% 5 == 0)
                System.out.println(" buzz ");
            else
                System.out.println(" "+numero+" ");

        }
    }
    }
