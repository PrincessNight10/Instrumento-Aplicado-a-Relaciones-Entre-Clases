import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

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
            int dni = scanner.nextInt();
            int opcion = scanner.nextInt();
            scanner.nextLine();


            switch (opcion) {
                case 1:
                    // CRUD de Agencias
                    System.out.println("Seleccione una opción para Agencias:");
                    System.out.println("a. Agregar Agencia");
                    System.out.println("b. Eliminar Agencia");
                    System.out.println("c. Consultar Agencia");
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
                        case 'c':
                            //Listar
                            System.out.println("Listado de Agencias disponibles:");
                            for (Agencia agencia : agencias) {
                                System.out.println("ID: " + agencia.getId() + ", Nombre: " + agencia.getNombre());
                            }
                            break;
                            case 'd':
                                // Leer el ID de la agencia que se desea actualizar
                                System.out.print("Ingrese el ID de la agencia que desea actualizar: ");
                                int idAgenciaActualizar = scanner.nextInt();
                                scanner.nextLine(); // Consumir la nueva línea

// Buscar la agencia por su ID
                                Agencia agenciaActualizar = null;
                                for (Agencia agencia : agencias) {
                                    if (agencia.getId() == idAgenciaActualizar) {
                                        agenciaActualizar = agencia;
                                        break;
                                    }
                                }

                                if (agenciaActualizar != null) {
                                    // Mostrar los detalles actuales de la agencia
                                    System.out.println("Detalles actuales de la agencia:");
                                    System.out.println("ID: " + agenciaActualizar.getId());
                                    System.out.println("Nombre: " + agenciaActualizar.getNombre());

                                    // Solicitar al usuario que ingrese los nuevos detalles
                                    System.out.println("Ingrese los nuevos detalles de la agencia:");
                                    System.out.print("Nuevo nombre: ");
                                    String nuevoNombre = scanner.nextLine();

                                    // Actualizar los atributos de la agencia
                                    agenciaActualizar.setNombre(nuevoNombre);

                                    System.out.println("Agencia actualizada con éxito.");
                                } else {
                                    System.out.println("No se encontró ninguna agencia con el ID especificado.");
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
                        case 'c':
                            // Leer Automóvil
                            System.out.println("Ingrese la matrícula del automóvil que desea consultar:");
                            String matriculaConsultar = scanner.next();
                            scanner.nextLine(); // Consumir la nueva línea

                            // Buscar el automóvil por su matrícula
                            boolean automovilEncontradoConsultar = false;
                            for (Automoviles automovil : automoviles) {
                                if (automovil.getMatricula().equals(matriculaConsultar)) {
                                    // Mostrar los detalles del automóvil
                                    System.out.println("Detalles del automóvil:");
                                    System.out.println("Matrícula: " + automovil.getMatricula());
                                    System.out.println("Modelo: " + automovil.getModelo());
                                    System.out.println("Color: " + automovil.getColor());
                                    System.out.println("Marca: " + automovil.getMarca());
                                    System.out.println("Garaje: " + automovil.getGaraje());
                                    automovilEncontradoConsultar = true;
                                    break; // Salir del bucle una vez que se haya encontrado el automóvil
                                }
                            }

                            // Si no se encontró el automóvil, mostrar un mensaje de error
                            if (!automovilEncontradoConsultar) {
                                System.out.println("Automóvil no encontrado.");
                            }
                            break;

                        case 'd':
                            // Actualizar Automóvil
                            System.out.println("Ingrese la matrícula del automóvil que desea actualizar:");
                            String matriculaActualizar = scanner.next();
                            scanner.nextLine(); // Consumir la nueva línea

                            // Buscar el automóvil por su matrícula
                            boolean automovilEncontradoActualizar = false;
                            for (Automoviles automovil : automoviles) {
                                if (automovil.getMatricula().equals(matriculaActualizar)) {
                                    // Mostrar los detalles actuales del automóvil
                                    System.out.println("Detalles actuales del automóvil:");
                                    System.out.println("Matrícula actual: " + automovil.getMatricula());
                                    System.out.println("Modelo: " + automovil.getModelo());
                                    System.out.println("Color: " + automovil.getColor());
                                    System.out.println("Marca: " + automovil.getMarca());
                                    System.out.println("Garaje: " + automovil.getGaraje());

                                    // Solicitar al usuario que ingrese los nuevos detalles
                                    System.out.println("Ingrese los nuevos detalles del automóvil:");
                                    System.out.print("Nuevo modelo: ");
                                    String nuevoModelo = scanner.nextLine();
                                    System.out.print("Nuevo color: ");
                                    String nuevoColor = scanner.nextLine();
                                    System.out.print("Nueva marca: ");
                                    String nuevaMarca = scanner.nextLine();
                                    System.out.print("Nuevo garaje: ");
                                    String nuevoGaraje = scanner.nextLine();

                                    // Actualizar los atributos del automóvil
                                    automovil.setModelo(nuevoModelo);
                                    automovil.setColor(nuevoColor);
                                    automovil.setMarca(nuevaMarca);
                                    automovil.setGaraje(nuevoGaraje);

                                    System.out.println("Automóvil actualizado con éxito.");
                                    automovilEncontradoActualizar = true;
                                    break; // Salir del bucle una vez que se haya actualizado el automóvil
                                }
                            }

                            // Si no se encontró el automóvil, mostrar un mensaje de error
                            if (!automovilEncontradoActualizar) {
                                System.out.println("Automóvil no encontrado.");
                            }
                            break;


                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }

                    break;


                case 3:
                    //clientes
                    System.out.println("Seleccione una opción para Clientes:");
                    System.out.println("a. Agregar Cliente");
                    System.out.println("b. Eliminar Cliente");
                    System.out.println("c. Consultar Cliente");

                    char subopcionClientes = scanner.next().charAt(0);

                    switch (subopcionClientes) {
                        case 'a':
                            System.out.println("Ingrese los detalles del cliente:");
                            System.out.print("DNI: ");

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
                            boolean clienteEncontradoBorrar = false;
                            for (Clientes cliente : clientes) {
                                if (cliente.getDNI() == dniEliminar) {
                                    clientes.remove(cliente);
                                    clienteEncontradoBorrar = true;
                                    System.out.println("Cliente eliminado con éxito.");
                                    break; // Salir del bucle una vez que se haya eliminado el cliente
                                }
                            }

                            // Si no se encontró el cliente, mostrar un mensaje de error
                            if (!clienteEncontradoBorrar) {
                                System.out.println("Cliente no encontrado.");
                            }
                            break;

                        case 'c':
                            System.out.print("Ingrese el DNI del cliente que desea consultar: ");
                            scanner.nextLine(); // Consumir la nueva línea pendiente

                            int dniConsulta = scanner.nextInt();
                            scanner.nextLine();

                            // Buscar el cliente por su DNI
                            boolean clienteEncontradoConsultar = false;
                            for (Clientes cliente : clientes) {
                                if (cliente.getDNI() == dniConsulta) {
                                    // Mostrar la información del cliente
                                    System.out.println("Información del cliente:");
                                    System.out.println("DNI: " + cliente.getDNI());
                                    System.out.println("Nombre: " + cliente.getNombre());
                                    System.out.println("Dirección: " + cliente.getDireccion());
                                    System.out.println("Teléfono: " + cliente.getTelefono());
                                    clienteEncontradoConsultar = true;
                                    break; // Salir del bucle una vez que se haya encontrado el cliente
                                }
                            }

                            // Si no se encontró el cliente, mostrar un mensaje de error
                            if (!clienteEncontradoConsultar) {
                                System.out.println("Cliente no encontrado.");
                            }
                        case 'd':
                            // Actualizar Cliente
                            System.out.println("Ingrese el DNI del cliente que desea actualizar:");
                            int dniActualizar = scanner.nextInt();
                            scanner.nextLine(); // Consumir la nueva línea

                            // Buscar el cliente por su DNI
                            boolean clienteEncontradoActualizar = false;
                            for (Clientes cliente : clientes) {
                                if (cliente.getDNI() == dniActualizar) {
                                    // Mostrar los detalles actuales del cliente
                                    System.out.println("Detalles actuales del cliente:");
                                    System.out.println("DNI: " + cliente.getDNI());
                                    System.out.println("Nombre: " + cliente.getNombre());
                                    System.out.println("Dirección: " + cliente.getDireccion());
                                    System.out.println("Teléfono: " + cliente.getTelefono());

                                    // Solicitar al usuario que ingrese los nuevos detalles
                                    System.out.println("Ingrese los nuevos detalles del cliente:");
                                    System.out.print("Nuevo nombre: ");
                                    String nuevoNombre = scanner.nextLine();
                                    System.out.print("Nueva dirección: ");
                                    String nuevaDireccion = scanner.nextLine();
                                    System.out.print("Nuevo teléfono: ");
                                    String nuevoTelefono = scanner.nextLine();

                                    // Actualizar los atributos del cliente
                                    cliente.setNombre(nuevoNombre);
                                    cliente.setDireccion(nuevaDireccion);
                                    cliente.setTelefono(nuevoTelefono);

                                    System.out.println("Cliente actualizado con éxito.");
                                    clienteEncontradoActualizar = true;
                                    break; // Salir del bucle una vez que se haya actualizado el cliente
                                }
                            }

                            // Si no se encontró el cliente, mostrar un mensaje de error
                            if (!clienteEncontradoActualizar) {
                                System.out.println("Cliente no encontrado.");
                            }
                            break;



                        case 4:
                            // CRUD de Reservas
                            System.out.println("Seleccione una opción para Reservas:");
                            System.out.println("a. Agregar Reserva");
                            System.out.println("b. Eliminar Reserva");
                            char subopcionReservas = scanner.next().charAt(0);
                            scanner.nextLine(); // Consumir la nueva línea

                            switch (subopcionReservas) {
                                case 'a':
                                    // Agregar Reserva
                                    System.out.println("Ingrese los detalles de la reserva:");
                                    System.out.print("ID de reserva: ");
                                    int idReserva = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.print("Fecha de inicio: ");
                                    String fechaInicio = scanner.nextLine();
                                    System.out.print("Fecha de finalización: ");
                                    String fechaFin = scanner.nextLine();
                                    System.out.print("Litros de gasolina en el depósito: ");
                                    String litros = scanner.nextLine();
                                    System.out.print("Coloca la matrícula del carro: ");
                                    String matricula = scanner.nextLine();
                                    Automoviles automoviles1 = Automoviles.obtenerAutomovil(matricula);
                                    if (automoviles1 == null) {
                                        System.out.println("Automóvil no encontrado.");
                                        break;
                                    }
                                    System.out.print("Ingrese el DNI del cliente: ");
                                    Clientes cliente = Clientes.obtenerClientePorDNI(String.valueOf(dni));
                                    if (cliente == null) {
                                        System.out.println("Cliente no encontrado.");
                                        break;
                                    }

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

                                case 'c':
                                    // Actualizar Reserva
                                    if (reservas.isEmpty()) {
                                        System.out.println("No hay reservas para actualizar.");
                                    } else {
                                        System.out.println("Seleccione el ID de la reserva a actualizar:");
                                        for (Reserva reserva : reservas) {
                                            System.out.println(reserva.getId_reserva() + ". " + reserva);
                                        }
                                        int idActualizar = scanner.nextInt();
                                        scanner.nextLine(); // Consumir la nueva línea
                                        boolean reservaEncontrada = false;
                                        for (Reserva reserva : reservas) {
                                            if (reserva.getId_reserva() == idActualizar) {
                                                System.out.println("Ingrese los nuevos detalles de la reserva:");
                                                System.out.print("Fecha de inicio (previa: " + reserva.getFinicio() + "): ");
                                                String nuevaFechaInicio = scanner.nextLine();
                                                reserva.setFinicio(nuevaFechaInicio);
                                                // Repetir el proceso para otros campos que desees actualizar
                                                System.out.println("Reserva actualizada con éxito.");
                                                reservaEncontrada = true;
                                                break;
                                            }
                                        }
                                        if (!reservaEncontrada) {
                                            System.out.println("No se encontró ninguna reserva con el ID proporcionado.");
                                        }
                                    }
                                    break;



                                case 'd':
                                    // Mostrar todas las Reservas
                                    if (reservas.isEmpty()) {
                                        System.out.println("No hay reservas para mostrar.");
                                    } else {
                                        System.out.println("Lista de Reservas:");
                                        for (Reserva reserva : reservas) {
                                            System.out.println(reserva);
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
}
