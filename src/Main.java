import java.util.Scanner;

public class Main {

    //Creamos un metodo dentro de la clase Main pero fuera del metodo main
    private static double rentalYield(double rentalIncome, double propertyValue){

        double yield = (double)(rentalIncome*12/propertyValue)*100;
        return yield;
    }

    //Método main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese en € su ingreso mensual de alguiler: ");
        int rentalIncome = scan.nextInt();
        System.out.println("Ingrese en € el valor total de su propiedad: ");
        int propertyValue = scan.nextInt();
        System.out.println("Ingreso mensual: "+(double)rentalIncome+" || Valor de la propiedad: "+(double)propertyValue);

        System.out.println("El rendimiento de su alquiler es del "+ rentalYield(rentalIncome, propertyValue)+"%");

    }
}