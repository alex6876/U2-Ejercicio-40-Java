public class TasaMercadoLibre extends ProveedorTasaCambio {

    @Override
    public double obtenerTasa(String monedaOrigen, String monedaDestino) {

        System.out.println("Consultando tasa del mercado...");

        return 1450.0;
    }
}