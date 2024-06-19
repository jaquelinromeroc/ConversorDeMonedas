import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaBase, String monedaTarget, ColsultaMoneda consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Moneda monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("LA TAZA DE CONVERSION PARA HOY ES: \n1 " +monedaBase +"=" +monedas.conversion_rate() + " " +monedaTarget );
        System.out.println("Ingrese la cantidad que desea convertir " +monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad + " " +monedaBase + "=" +cantidadConvertida + " " +monedas.target_code());
    }

    public static void convertirOtraMoneda(ColsultaMoneda consulta, Scanner lectura){
        System.out.println("Ingrese el codigo (en mayusculas) de la moneda base que desea convertir");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese el codigo (en mayusculas) de la comeda a la que quiere convertir");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}
