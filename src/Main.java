import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Clientes> clientes = new ArrayList<>();
        ArrayList<Reserva> reservas = new ArrayList<>();
        ArrayList<Automoviles> automoviles = new ArrayList<>();
        ArrayList<Agencia> agencias = new ArrayList<>();

        while (true) {
            System.out.println("Bienvenido al sistema de alquiler de automóviles:");
            System.out.println("1. CRUD de Agencias");
            System.out.println("2. CRUD de Automóviles");
            System.out.println("3. CRUD de Clientes");
            System.out.println("4. CRUD de Reservas");
            System.out.println("5. Listar alquileres de un cliente");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de leer el entero

            switch (opcion) {
                case 1:
                    // CRUD de Agencias
                    System.out.println("Seleccione una opción para Agencias:");
                    System.out.println("a. Agregar Agencia");
                    System.out.println("b. Eliminar Agencia");
                    char subopcionAgencias = scanner.next().charAt(0);
                    scanner.nextLine(); // Consumir la nueva línea después de leer el carácter
 // Consumir la nueva línea después de leer el carácter

                    switch (subopcionAgencias) {
                        case 'a':
                            // Agregar Agencia
                            System.out.println("Ingrese los detalles de la agencia:");
                            System.out.print("ID de la agencia: ");
                            int idAgencia = scanner.nextInt();
                            scanner.nextLine(); // Consumir la nueva línea después de leer el entero
                            System.out.print("Nombre de la agencia: ");
                            String nombreAgencia = scanner.nextLine();

                            // Crear instancia de Agencia con los valores ingresados
                            Agencia nuevaAgencia = new Agencia(idAgencia, nombreAgencia);

                            // Agregar la nueva agencia a la lista de agencias
                            agencias.add(nuevaAgencia);

                            System.out.println("Agencia agregada con éxito.");
                            break;
                        case 'b':
                            // Eliminar Agencia
                            if (agencias.isEmpty()) {
                                System.out.println("No hay agencias para eliminar.");
                            } else {
                                System.out.println("Seleccione la agencia a eliminar:");
                                for (int i = 0; i < agencias.size(); i++) {
                                    System.out.println((i + 1) + ". " + agencias.get(i).getNombre());
                                }
                                int indiceEliminar = scanner.nextInt() - 1;
                                if (indiceEliminar >= 0 && indiceEliminar < agencias.size()) {
                                    agencias.remove(indiceEliminar);
                                    System.out.println("Agencia eliminada con éxito.");
                                } else {
                                    System.out.println("Índice de agencia fuera de rango.");
                                }
                            }
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                case 2:
                    //Automovil
                    System.out.println("Seleccione una opción para Automóviles:");
                    System.out.println("a. Agregar Automóvil");
                    System.out.println("b. Eliminar Automóvil");
                    char subopcionAutomoviles = scanner.next().charAt(0);

                    switch (subopcionAutomoviles) {
                        case 'a':
                            System.out.println("Ingrese los detalles del automóvil:");
                            System.out.print("Matrícula: ");
                            String matricula = scanner.next();
                            scanner.nextLine(); // Consumir la nueva línea
                            System.out.print("Modelo: ");
                            String modelo = scanner.nextLine();
                            System.out.print("Color: ");
                            String color = scanner.nextLine();
                            System.out.print("Marca: ");
                            String marca = scanner.nextLine();
                            System.out.print("Garaje: ");
                            String garaje = scanner.nextLine();

                            // Crear instancia de Automóvil con los valores ingresados
                            Automoviles nuevoAutomovil = new Automoviles(matricula, modelo, color, marca, garaje);

                            // Agregar el nuevo automóvil a la lista de automóviles
                            automoviles.add(nuevoAutomovil);

                            System.out.println("Automóvil agregado con éxito.");
                            break;
                        case 'b':
                            // Implementar eliminación de automóvil
                            System.out.println("Ingrese la matrícula del automóvil a eliminar:");
                            String matriculaEliminar = scanner.next();
                            scanner.nextLine(); // Consumir la nueva línea

                            // Buscar el automóvil por su matrícula y eliminarlo si se encuentra
                            boolean automovilEncontrado = false;
                            for (Automoviles automovil : automoviles) {
                                if (automovil.getMatricula().equals(matriculaEliminar)) {
                                    automoviles.remove(automovil);
                                    automovilEncontrado = true;
                                    System.out.println("Automóvil eliminado con éxito.");
                                    break; // Salir del bucle una vez que se haya eliminado el automóvil
                                }
                            }

                            // Si no se encontró el automóvil, mostrar un mensaje de error
                            if (!automovilEncontrado) {
                                System.out.println("Automóvil no encontrado.");
                            }
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    break;



                case 3:

                    ;System.out.println("Seleccione una opción para Clientes:");
                    System.out.println("a. Agregar Cliente");
                    System.out.println("b. Eliminar Cliente");
                    char subopcionClientes = scanner.next().charAt(0);

                    switch (subopcionClientes) {
                        case 'a':
                            System.out.println("Ingrese los detalles del cliente:");
                            System.out.print("DNI: ");
                            int dni = scanner.nextInt();
                            scanner.nextLine(); // Consumir la nueva línea
                            System.out.print("Nombre: ");
                            String nombre = scanner.nextLine();
                            System.out.print("Dirección: ");
                            String direccion = scanner.nextLine();
                            System.out.print("Teléfono: ");
                            String telefono = scanner.nextLine();

                            // Crear instancia de Cliente con los valores ingresados
                            Clientes nuevoCliente = new Clientes(telefono, dni, nombre, direccion);

                            // Agregar el nuevo cliente a la lista de clientes
                            clientes.add(nuevoCliente);

                            System.out.println("Cliente agregado con éxito.");
                            break;
                        case 'b':
                            // Implementar eliminación de cliente
                            System.out.println("Ingrese el DNI del cliente a eliminar:");
                            int dniEliminar = scanner.nextInt();
                            scanner.nextLine(); // Consumir la nueva línea

                            // Buscar el cliente por su DNI y eliminarlo si se encuentra
                            boolean clienteEncontrado = false;
                            for (Clientes cliente : clientes) {
                                if (cliente.getDNI() == dniEliminar) {
                                    clientes.remove(cliente);
                                    clienteEncontrado = true;
                                    System.out.println("Cliente eliminado con éxito.");
                                    break; // Salir del bucle una vez que se haya eliminado el cliente
                                }
                            }

                            // Si no se encontró el cliente, mostrar un mensaje de error
                            if (!clienteEncontrado) {
                                System.out.println("Cliente no encontrado.");
                            }
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    break;
                case 4:
                    // CRUD de Reservas
                    System.out.println("Seleccione una opción para Reservas:");
                    System.out.println("a. Agregar Reserva");
                    System.out.println("b. Eliminar Reserva");
                    char subopcionReservas = scanner.next().charAt(0);

                    switch (subopcionReservas) {
                        case 'a':
                            // Agregar Reserva
                            System.out.println("Ingrese los detalles de la reserva:");
                            System.out.print("ID de reserva: ");
                            int idReserva = scanner.nextInt();
                            scanner.nextLine(); // Consumir la nueva línea
                            System.out.print("Fecha de inicio: ");
                            String fechaInicio = scanner.nextLine();
                            System.out.print("Fecha de finalización: ");
                            String fechaFin = scanner.nextLine();
                            System.out.print("Litros de gasolina en el depósito: ");
                            String litros = scanner.nextLine();
                            System.out.print("Precio total: ");
                            String precio = scanner.nextLine();
                            System.out.print("Estado (entregado/no entregado): ");
                            String estado = scanner.nextLine();

                            // Crear instancia de Reserva con los valores ingresados
                            Reserva nuevaReserva = new Reserva(idReserva, fechaInicio, fechaFin, litros, precio, estado);

                            // Agregar la nueva reserva a la lista de reservas
                            reservas.add(nuevaReserva);

                            System.out.println("Reserva agregada con éxito.");
                            break;
                        case 'b':
                            // Eliminar Reserva
                            if (reservas.isEmpty()) {
                                System.out.println("No hay reservas para eliminar.");
                            } else {
                                System.out.println("Seleccione la reserva a eliminar:");
                                for (int i = 0; i < reservas.size(); i++) {
                                    System.out.println((i + 1) + ". " + reservas.get(i).getId_reserva());
                                }
                                int indiceEliminar = scanner.nextInt() - 1;
                                if (indiceEliminar >= 0 && indiceEliminar < reservas.size()) {
                                    reservas.remove(indiceEliminar);
                                    System.out.println("Reserva eliminada con éxito.");
                                } else {
                                    System.out.println("Índice de reserva fuera de rango.");
                                }
                            }
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    break;
                case 5:
                    // Listar alquileres de un cliente
                    System.out.println("Ingrese el DNI del cliente para ver sus alquileres:");
                    int dniCliente = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea

                    // Buscar el cliente por su DNI
                    Clientes clienteSeleccionado = null;
                    for (Clientes cliente : clientes) {
                        if (cliente.getDNI() == dniCliente) {
                            clienteSeleccionado = cliente;
                            break;
                        }
                    }

                    // Si se encontró al cliente, mostrar sus alquileres
                    if (clienteSeleccionado != null) {
                        System.out.println("Alquileres del cliente " + clienteSeleccionado.getNombre() + ":");

                        // Recorrer la lista de reservas y mostrar aquellas asociadas al cliente
                        boolean alquileresEncontrados = false;
                        for (Reserva reserva : reservas) {
                            if (reserva.getLosClientes() == clienteSeleccionado) {
                                System.out.println("ID de reserva: " + reserva.getId_reserva());
                                System.out.println("Fecha de inicio: " + reserva.getFinicio());
                                System.out.println("Fecha de finalización: " + reserva.getFfinal());
                                System.out.println("Precio total: " + reserva.getPrecio());
                                System.out.println("Estado: " + reserva.getEstado());
                                System.out.println("-------------------------");
                                alquileresEncontrados = true;
                            }
                        }

                        // Si no se encontraron alquileres para el cliente, mostrar un mensaje
                        if (!alquileresEncontrados) {
                            System.out.println("El cliente no tiene alquileres registrados.");
                        }
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;


                case 6:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}
