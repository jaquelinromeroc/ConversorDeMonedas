import com.google.gson.JsonObject;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ColsultaMoneda consulta = new ColsultaMoneda();

        int opcion = 0;
        while (opcion !=8) {
            System.out.println("********************************\n" +
                    "BIENVENIDO AL CONVERSOR DE MONEDAS.\n\n" +
                    "INGRESA LA CONVERSION QUE DESEAS REALIZAR.\n\n" +
                    "1) Dolar ==> Peso argentino\n" +
                    "2) Peso argentino ==> Dolar\n" +
                    "3) Dolar ==> Peso colombiano\n" +
                    "4) Peso colombiano ==> Dolar\n" +
                    "5) Dolar ==> Peso mexicano\n" +
                    "6) Peso mexicano ==> Dolar\n" +
                    "7) Convertir otro tipo de moneda\n" +
                    "8) Salir");
            opcion = lectura.nextInt();
            lectura.nextLine();


            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "MXN", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("MXN", "USD", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("GRACIAS POR SU CONSULTA, REGRESE PRONTO");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor intente de nuevo.");
                    break;
            }
        }
    }
}
