import java.util.ArrayList;

public class CalculadorImpactoEcologico {
    public static void main(String[] args) {
        Edificio edificio = new Edificio(500, 1000, 300, 200);
        Vehiculo vehiculo = new Vehiculo(1000, 500, "Gasolina", 300);
        Bicicleta bicicleta = new Bicicleta(100, 50, 30);

        ArrayList<ImpactoEcologico> objetos = new ArrayList<>();
        objetos.add(edificio);
        objetos.add(vehiculo);
        objetos.add(bicicleta);

        for (ImpactoEcologico objeto : objetos) {
            System.out.println(objeto.getIdentificacion() + " - Impacto Ecológico: " 
                    + objeto.calcularImpactoEcologico());
        }
    }
}
