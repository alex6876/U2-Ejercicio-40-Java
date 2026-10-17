public class TasaBancoCentral extends ProveedorTasaCambio {

    @Override
    public double obtenerTasa(String monedaOrigen, String monedaDestino) {

        System.out.println("Consultando tasa del Banco Central...");

        return 1400.0;
    }
}