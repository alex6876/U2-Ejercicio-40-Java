public class Main {

    public static void main(String[] args) {

        ProveedorTasaCambio proveedor;

        proveedor = new TasaBancoCentral();

        ConversorMoneda conversor = new ConversorMoneda(proveedor);

        double resultado = conversor.convertir(10, "USD", "ARS");

        System.out.println("Resultado Banco Central: " + resultado);

        System.out.println("--------------------");

        proveedor = new TasaMercadoLibre();

        conversor = new ConversorMoneda(proveedor);

        resultado = conversor.convertir(10, "USD", "ARS");

        System.out.println("Resultado Mercado: " + resultado);
    }
}