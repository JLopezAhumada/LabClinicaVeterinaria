public class Gato extends Animal implements Vacunable, Asegurable {

    private boolean esEsterilizado;
    private int vacunasAplicadas = 0;

    public Gato(String nombre, int edad, String nombreDueno, boolean esEsterilizado) {
        super(nombre, edad, nombreDueno);
        this.esEsterilizado = esEsterilizado;
    }

    @Override
    public double calcularCostoConsulta() {
        return 38000;
    }

    @Override
    public void registrarVacuna(String nombre) {
        vacunasAplicadas++;
        System.out.println(this.nombre + " recibió la vacuna " + nombre);
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunasAplicadas;
    }

    @Override
    public double calcularPrimaSeguro() {
        if (esEsterilizado) {
            return 120000;
        }
        return 200000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-GATO-" + nombre.toUpperCase();
    }
}
