public class Edificio implements ImpactoEcologico {
    private double emisionesConstruccion;
    private double consumoEnergetico;
    private double residuosConstruccionDemolicion;
    private double eficienciaEnergetica;

    public Edificio(double emisionesConstruccion, double consumoEnergetico, 
           double residuosConstruccionDemolicion, double eficienciaEnergetica) {
        this.emisionesConstruccion = emisionesConstruccion;
        this.consumoEnergetico = consumoEnergetico;
        this.residuosConstruccionDemolicion = residuosConstruccionDemolicion;
        this.eficienciaEnergetica = eficienciaEnergetica;
    }

    @Override
    public double calcularImpactoEcologico() {
        return emisionesConstruccion + consumoEnergetico - eficienciaEnergetica 
                + residuosConstruccionDemolicion;
    }

    @Override
    public String getIdentificacion() {
        return "Edificio";
    }
}

