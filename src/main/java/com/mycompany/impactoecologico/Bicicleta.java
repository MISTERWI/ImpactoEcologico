public class Bicicleta implements ImpactoEcologico {
    private double emisionesProduccion;
    private double consumoEnergetico;
    private double residuosGenerados;

    public Bicicleta(double emisionesProduccion, double consumoEnergetico, double residuosGenerados) {
        this.emisionesProduccion = emisionesProduccion;
        this.consumoEnergetico = consumoEnergetico;
        this.residuosGenerados = residuosGenerados;
    }

    @Override
    public double calcularImpactoEcologico() {
        return emisionesProduccion + consumoEnergetico + residuosGenerados;
    }

    @Override
    public String getIdentificacion() {
        return "Bicicleta";
    }
}
