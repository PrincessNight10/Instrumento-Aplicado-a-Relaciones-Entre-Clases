import java.util.ArrayList;
import java.util.List;

public class Clientes {
    public int DNI;
    public String Nombre;
    public String Direccion;
    public String Telefono;

    public Clientes() {
    }

    public Clientes(String telefono, int DNI, String nombre, String direccion) {
        Telefono = telefono;
        this.DNI = DNI;
        this.Nombre = nombre;
        this.Direccion = direccion;

    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }


    private static List<Clientes> listaClientes = new ArrayList<>();

    public static Clientes obtenerClientePorDNI(String dni) {
        for (Clientes cliente : listaClientes) {
            if (String.valueOf(cliente.getDNI()).equals(dni)) {
                return cliente;
            }
        }
        return null;
    }
    }



