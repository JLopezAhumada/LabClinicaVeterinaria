public class Perro extends Animal implements Vacunable, Asegurable {

    private String raza;
    private int vacunasAplicadas = 0;

    public Perro(String nombre, int edad, String nombreDueno, String raza) {
        super(nombre, edad, nombreDueno);
        this.raza = raza;
    }

    @Override
    public double calcularCostoConsulta() {
        return 45000 + 3000 * edad;
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
        return 80000 * edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-PERRO-" + nombre.toUpperCase();
    }
}
