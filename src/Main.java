public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro("Rocky", 4, "Carlos", "Labrador");
        Gato gato = new Gato("Misu", 2, "Ana", true);
        Ave ave = new Ave("Piolín", 1, "Sofía", 85);
        Conejo conejo = new Conejo("Tambor", 2, "Luis");

        System.out.println("=== FICHAS ===");
        Animal[] animales = {perro, gato, ave, conejo};
        for (Animal animal : animales) {
            animal.imprimirFicha();
        }

        System.out.println("=== VACUNAS ===");
        perro.registrarVacuna("Rabia");
        perro.registrarVacuna("Parvovirus");
        gato.registrarVacuna("Triple felina");
        System.out.println(perro.nombre + " lleva " + perro.getVacunasAplicadas() + " vacunas");
        System.out.println(gato.nombre + " lleva " + gato.getVacunasAplicadas() + " vacuna");

        System.out.println();
        System.out.println("=== PÓLIZAS ===");
        Clinica clinica = new Clinica("VetCare", "Calle 72 # 45-10");
        Asegurable[] asegurables = {perro, gato, clinica};
        for (Asegurable a : asegurables) {
            System.out.println(a.obtenerNumeroPoliza() + " paga $" + a.calcularPrimaSeguro() + " al año");
        }
    }
}
