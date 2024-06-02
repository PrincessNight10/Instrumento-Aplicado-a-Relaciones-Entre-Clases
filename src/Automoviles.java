import java.util.List;
import java.util.ArrayList;

public class Automoviles {
    private String matricula;
    private String modelo;
    private String color;
    private String marca;
    private String garaje;
    private static List<Automoviles> listaDeAutomoviles = new ArrayList<>(); // ArrayList de objetos Automoviles

    // Constructor
    public Automoviles(String matricula, String modelo, String color, String marca, String garaje) {

        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.garaje = garaje;
    }

    // Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGaraje() {
        return garaje;
    }

    public void setGaraje(String garaje) {
        this.garaje = garaje;
    }
    // Método estático para obtener un automóvil por matrícula


    // Método estático para agregar un automóvil a la lista
    public static void agregarAutomovil(ArrayList<Automoviles> lista, Automoviles automovil) {
        lista.add(automovil);
    }

    // Método estático para eliminar un automóvil de la lista
    public static void eliminarAutomovil(ArrayList<Automoviles> lista, int indice) {
        lista.remove(indice);
    }
    public static Automoviles obtenerAutomoviles(String matricula) {
        // Aquí iría la lógica para buscar en una base de datos o en alguna lista
        // un automóvil con la matrícula dada y devolverlo
        // Por ejemplo:
        Automoviles autoEncontrado = null;
        // Supongamos que existe una lista llamada listaDeAutomoviles
        for (Automoviles auto : listaDeAutomoviles) {
            if (auto.getMatricula().equals(matricula)) {
                autoEncontrado = auto;
                break;
            }
        }
        return autoEncontrado;
    }

}
