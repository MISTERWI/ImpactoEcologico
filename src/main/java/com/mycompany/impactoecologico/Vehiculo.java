public class Vehiculo implements ImpactoEcologico {
    private double emisionesProduccion;
    private double consumoCombustible;
    private String tipoCombustible;
    private double eficienciaEnergetica;

    public Vehiculo(double emisionesProduccion, double consumoCombustible, 
            String tipoCombustible, double eficienciaEnergetica) {
        this.emisionesProduccion = emisionesProduccion;
        this.consumoCombustible = consumoCombustible;
        this.tipoCombustible = tipoCombustible;
        this.eficienciaEnergetica = eficienciaEnergetica;
    }

    @Override
    public double calcularImpactoEcologico() {
        return emisionesProduccion + consumoCombustible - eficienciaEnergetica;
    }

    @Override
    public String getIdentificacion() {
        return "Vehiculo";
    }
}
