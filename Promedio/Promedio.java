package Promedio;

import java.util.Scanner;

public class Promedio {
    Scanner obj =new Scanner(System.in);
    public void getPromedio(){
        int notas =0, cantidad =0, suma =0, promedio =0;
        System.out.println("Ingrese cantidad de notas: ");
        cantidad =obj.nextInt();

        for(int i =1;i<=cantidad;i++){
            System.out.println("Ingrese nota "+(i)+ ": ");
            notas =obj.nextInt();
            suma +=notas;
    }
    promedio =(suma)/cantidad;
    System.out.println("El promedio de las notas es: "+promedio);

    }
}
