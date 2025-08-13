import java.util.Scanner;

public class matriz{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = 3;
        
        //Definir la matriz
        int matriz[][] = new int[n][n];

        //Se llena la matriz
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matriz[i][j] = (int)(Math.random() * 50 + 1);
            }
        }

        System.out.println("--------------------------------");
        //Se imprime la matriz
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(" " + matriz[j][i]);
            }
            System.out.println();
        }

        System.out.println("--------------------------------");


        //suma de pocisiones pares 
        int pares = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(matriz[j][i] % 2 == 0){
                    pares += matriz[j][i];
                }
            }
        }
        System.out.println("La suma de los numeros pares es: " + pares);


        //Promedio de la matriz
        int suma = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                suma += matriz[j][i];
            }

        }
    
        System.out.println("El promedio de la matriz es: " + suma / (n * n));


        //numero divisibles por 2 de la matriz
        int divisibles = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(matriz[j][i] % 2 == 0){
                    divisibles++;
                }
            }
        }
        System.out.println("El numero de numeros divisibles por 2 es: " + divisibles);
    }
}