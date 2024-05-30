import java.util.ArrayList;
import java.util.List;

public class Automoviles {
    private String matricula;
    private String modelo;
    private String color;
    private String marca;
    private String garaje;

    public Automoviles() {
    }

    public Automoviles(String matricula, String modelo, String color, String marca, String garaje) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.garaje = garaje;
    }

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

    private static List<Automoviles> listaAutomoviles = new ArrayList<>();

    public static Automoviles obtenerAutomovil(String matricula) {
        for (Automoviles automovil : listaAutomoviles) {
            if (automovil.getMatricula().equals(matricula)) {
                return automovil;
            }
        }
        return null;
    }
}
