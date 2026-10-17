public class ConversorMoneda {

    private ProveedorTasaCambio proveedor;

    public ConversorMoneda(ProveedorTasaCambio proveedor) {
        this.proveedor = proveedor;
    }

    public double convertir(double monto, String origen, String destino) {

        double tasa = proveedor.obtenerTasa(origen, destino);

        return monto * tasa;
    }
}