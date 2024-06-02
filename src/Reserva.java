
public class Reserva {
    public int Id_reserva;
    public String Finicio;
    public String Ffinal;
    public String Litros;
    public String Precio;
    public String Estado;
    public Clientes losClientes = new Clientes();
    Automoviles losAutomoviles = new Automoviles("arg1", "arg2", "arg3", "arg4", "arg5");

    public Clientes getLosClientes() {
        return losClientes;
    }

    public void setLosClientes(Clientes losClientes) {
        this.losClientes = losClientes;
    }


    public void setLosAutomoviles(Automoviles losAutomoviles) {
        this.losAutomoviles = losAutomoviles;
    }



    public Reserva(int id_reserva, String finicio, String ffinal, String litros, String precio, String estado) {
        Id_reserva = id_reserva;
        Finicio = finicio;
        Ffinal = ffinal;
        Litros = litros;
        Precio = precio;
        Estado = estado;
    }

    public int getId_reserva() {
        return Id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        Id_reserva = id_reserva;
    }

    public String getFinicio() {
        return Finicio;
    }

    public void setFinicio(String finicio) {
        Finicio = finicio;
    }

    public String getFfinal() {
        return Ffinal;
    }

    public void setFfinal(String ffinal) {
        Ffinal = ffinal;
    }

    public String getLitros() {
        return Litros;
    }

    public void setLitros(String litros) {
        Litros = litros;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = precio;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

}
